
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//pj ellis - module 10 - populate fans

public class InsertFans {

  Connection con;

  Statement stmt;

  public InsertFans(){

    try{

      Class.forName("com.mysql.cj.jdbc.Driver");

      String url = "jdbc:mysql://localhost:3306/databasedb?";

      con = DriverManager.getConnection(url + "user=student1&password=pass");

      stmt = con.createStatement();
    }
    catch(Exception e){

      System.out.println("Error connection to database.");
      System.exit(0);
    }

    try{

      System.out.println(
      stmt.executeUpdate("INSERT INTO fans VALUES(1,'Pj','Ellis','Chicago Cubs')") + "row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO fans VALUES(2,'Mark','Wagner','Dallas Cowboys')") + "row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO fans VALUES(3,'Josh','Porter','Tampa Bucs')") + "row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO fans VALUES(4,'Courtney','Porter','Denver Broncos')") + "row updated");
      System.out.println(
      stmt.executeUpdate("INSERT INTO fans VALUES(5,'Josh','Fraser','Boston Red Sox')") + "row updated");

      stmt.executeUpdate("COMMIT");

      System.out.println("Data Inserted");
    }
    catch(SQLException e){

      System.out.println(e);
      System.out.println("Insert Data Failed");
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

    InsertFans insertFans = new InsertFans();
  }
}    