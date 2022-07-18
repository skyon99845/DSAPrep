import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("add",12);
        mp.put("sub",15);
        mp.put("mul",20);
        mp.put("div",30);

        System.out.println("The Map is :"+mp);
        System.out.println("Printing the entry set ");
        for(Map.Entry<String,Integer> e:mp.entrySet())
        {

            System.out.println(e);

        }
        System.out.println("Printing the key of the Map");
        for(Map.Entry<String,Integer> e:mp.entrySet())
        {
            System.out.println(e.getKey());
        }

        System.out.println("Printing the Value of the Map");
        for(Map.Entry<String,Integer> e:mp.entrySet())
        {
            System.out.println(e.getValue());
        }



    }
}
