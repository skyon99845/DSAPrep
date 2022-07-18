import java.util.HashMap;
import java.util.Map;

public class Problem9 {
    public static void main(String[] args) {
        System.out.println("To count the number of words in the sentence");
        Map<String,Integer>mp = new HashMap<>();
        mp.put("Shubham",1);
        mp.put("Suraj",2);
        mp.put("Surya",3);
        mp.put("Saya",4);

        for (Map.Entry<String,Integer> entry : mp.entrySet())
            System.out.println("Key = " + entry.getKey());
       /* Map<String, Integer> newHash = new HashMap<String,Integer>();
        mp.put("A",1);
        mp.put("B",2);
        mp.put("C",3);
        mp.put("D",4);
        mp.put("E",5);

        System.out.println("Printing the Elements of the Second List ");
        for( Map.Entry<String,Integer>e : newHash.entrySet())
        {
            System.out.println("Level1");
            System.out.println(e.getKey());
        }

        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,String> entry : gfg.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        System.out.println("alpha");
        for(Map.Entry<String,Integer> mppentry:newHash.entrySet())
        {
            System.out.println("The key :"+mppentry.getKey()+" and the value of :"+mppentry.getValue());
        }
        System.out.println("The Map is :"+mp.get("Shubham"));
        System.out.println("Clearing the Map ");
        mp.clear();
        System.out.println("Checking Whether Map contains key Surya");
        System.out.println(mp.containsKey("Shubham"));

        System.out.println("Checking whether Map contains value 6");
        System.out.println(mp.containsValue(6));

        */

        HashMap<String,Integer> mi = new HashMap<>();
        mi.put("Shubham",11);
        mi.put("Si ",22);
        mi.put("Raj",33);
        System.out.println("Printing the Second List");
        for(Map.Entry<String,Integer> ep:mi.entrySet())
        {
            System.out.println(ep.getKey()+ep.getValue());
        }
    }
}
