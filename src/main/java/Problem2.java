public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Program to Print reverse of String using the Reverse function");
        String name="I am proud of my Country";
        System.out.println("The string is :"+name);
        StringBuilder sbname = new StringBuilder();
        sbname.append(name);

        System.out.println("Printing the sbname :"+sbname);
        System.out.println("Printing the reverse of the String :"+sbname.reverse());
    }
}
