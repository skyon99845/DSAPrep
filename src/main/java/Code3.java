public class Code3 {
    public static void main(String[] args) {
        String name="My name is Shubham Kumar";
        String[] s1=name.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            System.out.println(s1[i]);
        }


        String[] s2 = name.split(" ",4);
        for(int i=0;i< s2.length;i++)
        {
            System.out.println(s2[i]);
        }
    }


}
