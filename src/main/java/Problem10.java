import java.util.HashMap;
import java.util.Map;

public class Problem10 {
    public static void main(String[] args) {
        String sentence = "I am proud of my Country country proud";
        System.out.println("The sentence enetered by the user is :"+sentence);
        String[] spplit = sentence.split(" ");
        for(int i=0;i<spplit.length;i++)
        {
            System.out.print(spplit[i]+" ");
        }
        Map<String,Integer> slist=new HashMap<>();

        for(int i=0;i<spplit.length;i++)
            {
                if(slist.containsKey(spplit[i])){
                    slist.put(spplit[i],slist.get(spplit[i])+1);
                }
                else
                {
                    slist.put(spplit[i],1);
                }
            }
        System.out.println("\nThe Count of Each word is :"+slist);


    }
}
