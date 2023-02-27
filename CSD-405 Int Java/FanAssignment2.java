/* Pj Ellis - Module 2 - More Class Stuff - UseFans
 * Starting with your code from Module 1 create the following new class titled UseFans:
 * Create a collection of Fan instances.
 * Create a method taking a collection of Fan instances for displaying without 
 * using the toString() method.
 * Create a method that takes a single instance of a Fan for displaying without 
 * using the toString() method.
 * Use the this reference throughout the Fan class where allowed.
 * Write test code that creates a collection of Fans and displays the functionality 
 * of all of the Fan instances in the collection.
*/

import java.util.*;
        
public class FanAssignment2 {
        
    public static void main(String[] args) {
       Random x = new Random();
       int fans = x.nextInt(10);
                             
       //declare fanArray
       UseFans[] fanArray;
       
       //create fanArray
       fanArray = createFanArray(fans);
       
       //print out display of array of fans
       printFanArray(fanArray);
       
       //print out a display for a random single fan
       printOneofFanArray(fanArray);  
      
    }//End of Main
    
    //create an array of fan objects
    public static UseFans[] createFanArray(int a) {
        UseFans[] fanArray = new UseFans[a];
        Random rand = new Random();
                          
        for (int i = 0; i < fanArray.length; i++) {
            fanArray[i] = new UseFans();            
            fanArray[i].setID(i);
            fanArray[i].setSpeed(rand.nextInt(4));
            fanArray[i].setOn(rand.nextBoolean());
            fanArray[i].setRadius((int)(Math.random() * 10 + 1));
            fanArray[i].setColor(createRandomColor());
        }//End of For Loop
        
        //Return Fan Array
        return fanArray;
    }//End of creatFanArray
    
    //create random color
    public static String createRandomColor() {
        // Create an empty list
        List<String> colors = new ArrayList<>();
  
        // Instantiating list using Collections.addAll()
        Collections.addAll(colors, "Red", "Orange", "Yellow", "Green", "Blue",
                "Purple", "White", "Black");
        
        //Get a random color
        Random rand = new Random();
        int f = rand.nextInt(8);
        String pickColor = colors.get(f);
        
        return pickColor;
    }//End of createRandomColor
    
      
    //Print out display of fans current values
    public static void printFanArray(UseFans[] fanArray) {
        System.out.println("MY COLLECTION OF FANS");
        System.out.println("---------------------------------------------------");
        System.out.printf("%-10s%-10s%-15s%-10s%-10s\n", "Fan ID", "Speed", 
                "ON or OFF", "Radius", "Color");
        for (int i = 0; i < fanArray.length; i++) {
        System.out.printf("%-10s%-10s%-15s%-10s%-10s\n", fanArray[i].getID(), 
                fanArray[i].getSpeed(), fanArray[i].isOn(), fanArray[i].getRadius(), 
                fanArray[i].getColor());
        }//End of for loop
        System.out.println("---------------------------------------------------");
        System.out.println();
    }//End of printFanArray
    
    //Pring out display of one Random Fan
    public static void printOneofFanArray(UseFans[] fanArray) {
        Random z = new Random();
        int fav = z.nextInt(fanArray.length);
        System.out.println("MY FAVORITE FAN FROM MY COLLECTION OF FANS");
        System.out.println("---------------------------------------------------");
        System.out.printf("%-10s%-10s%-15s%-10s%-10s\n", "Fan ID", "Speed", 
                "ON or OFF", "Radius", "Color");
        System.out.printf("%-10s%-10s%-15s%-10s%-10s\n", fanArray[fav].getID(), 
                fanArray[fav].getSpeed(), fanArray[fav].isOn(), 
                fanArray[fav].getRadius(), fanArray[fav].getColor());
        System.out.println("---------------------------------------------------");
        System.out.println();
    }//End of printOneofFanArray
}//End of Public Class

//New Class titled UseFans
class UseFans {
  //default settings of class
  public static int STOPPED = 0;
  public static int SLOW = 1;
  public static int MEDIUM = 2;
  public static int FAST = 3;

  private int id = 0;
  private int speed = STOPPED;
  private boolean on = false;
  private double radius = 6;
  private String color = "white";

  //no arg constructor
  public UseFans() {
  }
  
  //argument constructor
  public UseFans(int id, int speed, boolean on, double radius, String color) {
      this.id = id;
      this.speed = speed;
      this.on = on;
      this.radius = radius;
      this.color = color;      
  }

  //setter and getter methods
  public int getID() {
      return id;
  }
  
  public void setID(int id) {
      this.id = id;
  }
  
  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public boolean isOn() {
    return on;
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  /* Honestly not sure why @Override is here, netbeans told me i should put it 
   * here and code works if it is there or not there, need to research this more
  */
  public String toString() {
    return "speed setting is " + speed + "\nthe fan is set to " + ((on) ? "ON" 
            : "OFF") + "\nthe radius of this fan is " + radius + "\nthe color is "
            + color;
  }
}//End of UseFans Class
