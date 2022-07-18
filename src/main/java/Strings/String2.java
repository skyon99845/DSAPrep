package Strings;

import OOPS.Parent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String2 {
    public static void main(String[] args) {
        String name="My name is Shubham Kumar 411014";
        String name1="Shubham";

        boolean check = name.contains(name1);
        System.out.println("Checking whether the string name contains name2:"+check);
        String[] aa = name.split("[^a-zA-Z]+");
        for(String a1:aa){
            System.out.println(a1);
        }
        String userName="Shubham";

        System.out.println("Whether username only contains the Alphabets");
        System.out.println(userName.matches("[a-zA-Z]+"));

        System.out.println("Checking whether username only contains small alphabets");
        System.out.println(userName.matches("[a-z]"));


    }
}
