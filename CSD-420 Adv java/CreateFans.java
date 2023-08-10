
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Pj Ellis - Module 10 - create and populate database fans


public class CreateFans {
  
  Connection con;

  Statement stmt;

  public CreateFans(){

    try{

      Class.forName("com.mysql.cj.jdbc.Driver");

      String url = "jdbc:mysql://localhost:3306/databasedb?";

      con = DriverManager.getConnection(url + "user=student1&password=pass");

      stmt = con.createStatement();
    }
    catch(Exception e){

      System.out.println("Error connection to database.");
      System.out.println(e);
      System.exit(0);
    }

    try{

      stmt.executeUpdate("DROP TABLE fans");
      System.out.println("Table address Dropped");
    }
    catch(SQLException e){

      System.out.println("Table address does not exist");
    }

    try{

      stmt.executeUpdate("CREATE TABLE fans(ID int PRIMARY KEY, FIRSTNAME varchar(25), LASTNAME varchar(25), FAVORITETEAM varchar(25))");
      System.out.println("Table address Created");
    }
    catch(SQLException e){

      System.out.println("Table address Creation failed");
    }

    try{

      stmt.close();

      con.close();
      System.out.println("Database connections closed");
    }
    catch(SQLException e){

      System.out.println("Connection close failed");
    }
  }

  public static void main(String args[]) {

    CreateFans createFans = new CreateFans();
  }  
}
