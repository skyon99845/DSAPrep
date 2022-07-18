import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        String s1= new String("Hello");
        String s2="Hello";
        System.out.println("Output of Line number 5 :"+s1.equals(s2));
        System.out.println("Output of Line number 6 :"+(s1==s2));

        String s3="Hello";
        String s4="Hello";
        System.out.println("Output of the line number 10 :"+(s3==s4));

        String s5=" I am proud of Myself ";

        System.out.println("Utility of trim() function :"+s5.trim());
        String[] ss = s5.split(" ",2);
        System.out.println("Printing the split string");
        for(int i=0;i< ss.length;i++)
        {
            System.out.println(ss[i]);
        }



        String s23 = "Java String Split Example";
        String[] str1 = s23.split(" ");
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]); // output
            //Java
            //String
            //Split
            //Example
        }

        //using contains() function to check String s23 contains Split
        System.out.println("Checking the String contains Spilt word :"+(s23.contains("Split")));


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name=sc.nextLine();
        String intro="My name is :";
        System.out.println(intro.concat(name));

    }
}
