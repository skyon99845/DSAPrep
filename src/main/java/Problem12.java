import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word :");
        String word = sc.next();
        System.out.println("\nThe word entered by the user is :"+word);

        for(int i=0;i<word.length();i++)
        {
            System.out.print(word.charAt(i)+" ");
        }

        Map<Character,Integer> slist=new HashMap<>();

        for(int i=0;i<word.length();i++)
        {
            if(slist.containsKey(word.charAt(i))){
                slist.put(word.charAt(i),slist.get(word.charAt(i))+1);
            }
            else
            {
                slist.put(word.charAt(i),1);
            }
        }
        System.out.println("\nThe Count of Each word is :"+slist);

    }
}
