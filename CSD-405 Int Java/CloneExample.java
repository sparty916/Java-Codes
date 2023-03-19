import java.lang.Cloneable;

public class CloneExample implements Cloneable {

   private String name;

   public CloneExample(String name) {
	this.name = name;
   }

   public String getName() {
	return name;
   }
   // Overriding clone() method of Object class
   @Override
   public Object clone()throws CloneNotSupportedException{  
	return super.clone();  
   }
	
   public static void main(String[] args) throws CloneNotSupportedException {
	CloneExample obj1 = new CloneExample("Tommy");
	CloneExample obj2 = (CloneExample) obj1.clone();
        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
   }
}
