class ShubhamException extends Exception{}

public class UserException {
    public static void main(String[] args) {
        try{
            throw new ShubhamException();
        }
        catch (ShubhamException SE){
            System.out.println("Catching the exception");
        }
        finally {
            System.out.println("Inside the final block");
        }
    }
}
