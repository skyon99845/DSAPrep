import java.util.Scanner;
import java.util.Stack;

public class Problem11 {
    public static void main(String[] args) {
        String sentence = "{";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string of following literal '{','}','[',']','(',')' only ");
        System.out.println("Enter the String ");
        sentence = sc.next();

        System.out.println("The string entered is :"+sentence);
        Stack<Character> st = new Stack<>();
        for(char ch:sentence.toCharArray())
        {
            char sym=ch;
            char check;


            if(sym=='{'||sym=='['|| sym=='(')
            {
                st.push(sym);
                //continue;
            }
            if(st.isEmpty()){
                System.out.println(" ");
                System.exit(0);
            }

            switch(sym)
            {
                case '}':check=st.pop();
                    if(sym=='[' || sym=='(')
                    {
                        System.out.println("String is Not Balanced");
                        System.exit(0);
                    }
                    break;
                case']':check=st.pop();
                    if(sym=='{' || sym=='(')
                    {
                        System.out.println("String is Not Balanced");
                        System.exit(0);
                    }
                    break;
                case')':check=st.pop();
                    if(sym=='[' || sym=='{')
                    {
                        System.out.println("String is Not Balanced");
                        System.exit(0);
                    }
                    break;
            }

            if(st.isEmpty()) {

                System.out.println("String is Balanced");
                System.exit(0);
            }
            else
            {
                System.out.println("String is not balanced last");
                System.exit(0);
            }
        }
    }
}
