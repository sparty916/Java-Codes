/* pj ellis - module 3 - generics
 * discussion example demonstrating Generic classes and methods
*/
public class GenericsDiscussion {    
    public static void main(String[] args) {
        GenericExample<Integer> intObj = new GenericExample<>(5);
        GenericExample<String> strObj = new GenericExample<>("Hello!");
        System.out.println(intObj.getInput());
        System.out.println(strObj.getInput());        
    }    
}
class GenericExample<T> {
    private T input;        
    public GenericExample(T input) {
        this.input = input;
    }        
    public T getInput() {
        return this.input;
    }
}




