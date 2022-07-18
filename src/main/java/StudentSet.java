import java.util.HashSet;
import java.util.Set;


public class StudentSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Shubham", 2));
        studentSet.add(new Student("Anuj", 2));
        studentSet.add(new Student("Ramesh", 4));
        System.out.println("Printing the student set :"+studentSet);
    }
}
