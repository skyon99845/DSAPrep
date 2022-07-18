public class Problem13 {
    public static void main(String[] args) {
        String name="1 Adult,3 Child";
        String[] nameList=name.split(",");
        for(int i=0;i< nameList.length;i++)
        {
            System.out.println(nameList[i]);
        }
        System.out.println(nameList);
    }
}
