/* Pj Ellis - Module 1 - Class
 * Write a program with a class titled Fan. This class is to contain:
 * Four constants named STOPPED, SLOW, MEDIUM, and FAST. The constants are to 
 * hold the values of 0, 1, 2, and 3 respectively.
 * A private field named speed that holds one of the constant values with the 
 * default being STOPPED.
 * A private Boolean field titled on that specifies whether the fan is on or off.
 * A private field named radius that holds the radius of the fan with a default 
 * value of 6.
 * A String field that holds the color, with the default being white.
 * Setter and getter methods for all mutable fields.
 * A no-argument constructor that sets all fields with a default value.
 * A constructor taking arguments and setting values.
 * Write a toString() method that returns a description of the Fans state.
 * Write test code that creates two instances of the Fan class, one using the 
 * default constructor and the other using the argument constructor. 
 * Write code that displays the functionality of the Fan class methods.
*/
       
public class FanAssignment {
  public static void main(String[] args) {
    //creates object with default no arg
    Fan fan1 = new Fan();
    System.out.println("-- Fan 1 --");
    System.out.println(fan1.toString());//displays toString()
    
    //created object with arguments
    Fan fan2 = new Fan(3, true, 5, "blue");
    System.out.println("\n-- Fan 2 --");
    //Showing a different way to display without using toString()
    System.out.println(fan2); 
    
    //Code to showcase the methods of Fan class individually
    System.out.println("\n-- Fan 1 --");
    /*System.out.println("Speed: " + fan1.speed); 
     *ERROR - speed is set to private so you can not access it, 
     *have to use the 'getters' to return the value
    */
    System.out.println("Speed: " + fan1.getSpeed());
    System.out.println("On or Off: " + fan1.isOn());
    System.out.println("Radius: " + fan1.getRadius());
    System.out.println("Color: " + fan1.getColor());
    
    System.out.println("\n-- Fan 2 --");
    System.out.println("Speed: " + fan2.getSpeed());
    System.out.println("ON or OFF: " + fan2.isOn());
    System.out.println("Radius: " + fan2.getRadius());
    System.out.println("Color: " + fan2.getColor());
    
    //Modify Fan 2's Values and show changes
    fan2.setSpeed(Fan.MEDIUM);//showing another way to input a value
    fan2.setOn(false);
    fan2.setRadius(9);
    fan2.setColor("green");
        
    System.out.println("\n-- Fan 2 after modifying values --");
    System.out.println("Speed: " + fan2.getSpeed());
    System.out.println("ON or OFF: " + fan2.isOn());
    System.out.println("Radius: " + fan2.getRadius());
    System.out.println("Color: " + fan2.getColor());
  }//End of Main
}//End of public class

class Fan {
  //default settings of class
  public static int STOPPED = 0;
  public static int SLOW = 1;
  public static int MEDIUM = 2;
  public static int FAST = 3;

  private int speed = STOPPED;
  private boolean on = false;
  private double radius = 6;
  private String color = "white";

  //no arg constructor
  public Fan() {
  }
  
  //argument constructor
  public Fan(int s, boolean torf, double r, String c) {
      speed = s;
      on = torf;
      radius = r;
      color = c;      
  }

  //setter and getter methods
  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int newSpeed) {
    speed = newSpeed;
  }

  public boolean isOn() {
    return on;
  }

  public void setOn(boolean trueOrFalse) {
    this.on = trueOrFalse;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double newRadius) {
    radius = newRadius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String newColor) {
    color = newColor;
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
}