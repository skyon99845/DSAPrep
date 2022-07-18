package Strings;

public class String3 {
    public static void main(String[] args) {

        String password="321@11234.yzr2ShubhamKumar!@";
        String passCondition="[a-zA-Z0-1]";
        System.out.println(password.matches(passCondition.toString()));

    }
}
