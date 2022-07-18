import java.util.List;
import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.push("Lion");
        animal.push("Dog");
        animal.push("Horse");
        animal.push("Dear");

        System.out.println("Printing the top animal :"+animal.peek());

        System.out.println("Performing the pop operation :"+animal.pop());
        System.out.println("Printing the origional array :"+animal);
        System.out.println("Pushing Zebra into the List :"+animal.push("zebra"));

        System.out.println("Printing the Stack of the Array"+animal);


    }
}
