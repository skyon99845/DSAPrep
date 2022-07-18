import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args )throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Post Office");
        System.out.println("Please enter the pincode");
        String Pincode=sc.nextLine();
        if(Pincode.length()<6){
            throw new Exception("Pincode Must be of size 6");
        }
        System.out.println(Pincode);

        try{
            int a=2/0;
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
