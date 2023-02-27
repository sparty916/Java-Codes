// Welcome to FavTutor
interface Drawable{  
    public void draw();  
}  
public class LambdaExpressionExample {  
    public static void main(String[] args) {  
        int width=10;  
        //with using a lambda  
        Drawable d=() -> {
            System.out.println("Drawing "+width);  
        };  
        d.draw();  
    }  
} 
