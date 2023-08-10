// pj ellis - module 8 discussion - Runnable Demo

public class DemoRunnable {
    public static void main(String[] args){
        //create a task
        Runnable hi = new PrintHello("Pj", "Florida");
        
        //create a thread
        Thread t1 = new Thread(hi);
        
        //start the thread
        t1.start();
    }    
}
//runnable class
class PrintHello implements Runnable {
    private String name;
    private String place;
    
    //Constructor if needed
    public PrintHello(String a, String b){
    name = a;
    place = b;
    }   
    
    @Override
    public void run() {
        System.out.println("\n\tHello, my name is " + name
                + ", and I live in " + place + "!");
    }
}



       






