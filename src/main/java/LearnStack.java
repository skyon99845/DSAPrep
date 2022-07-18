import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> nn = new Stack<>();
        nn.add(1);
        nn.add(2);
        nn.add(3);
        nn.add(4);

        System.out.println("The elements are :"+nn);
        System.out.println("The next element tot be pop out is ");
        nn.peek();


    }
}
