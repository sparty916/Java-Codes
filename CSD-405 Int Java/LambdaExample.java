/* Pj Ellis - Module 9 - Lambda Expression Essay Example
 *
 * Research the web for websites discussing different aspects of Java's Lambda. 
 * Provide examples on the topics you discuss along with a file including 
 * documentation in the actual code. Include a link to the site(s) you are 
 * referencing in your paper. This paper is to be a 700-word paper (excluding 
 * your references) on the Lambda aspects you selected to write about. This 
 * paper will automatically be submitted to SafeAssign for an 
 * originality/plagiarism review. 
 * Note: Your code is not to be in your paper, it is to be a separate file for 
 * execution testing.
*/

interface LetsAdd {
    public void add();   
}

public class LambdaExample {
 
    public static void main(String[] args) {
        int a = 15;
        int b = 37;
    
        //without a lambda expression
        LetsAdd adding = new LetsAdd(){
        @Override
        public void add() {
            System.out.println("The sum of " +a+ " and " +b+ " = " +(a+b));
            }
        };
        //get output
        System.out.println("Without a Lambda Expression:");
        adding.add();
    
        /*using a lambda expression
         *create an object of the interface but eliminate 'new LetsAdd()' 
         *   / no parameters / 
         *        / '->' to replace 'new LetsAdd(){ @override public void add()' /
         *                            / keep the body within the {} /
        */
        //Lambda Expression
        LetsAdd addWithLambda = () -> {System.out.println("The sum of " +a+ 
                " and " +b+ " = " +(a+b));
        };
    
        //get output
        System.out.println("With a Lambda Expression:");
        addWithLambda.add();
    }
}

