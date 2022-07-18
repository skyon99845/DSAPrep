public class StringPatternOne {
    public static void main(String[] args) {
        int count=1;
        for (int i=65;i<=70;i++)
        {
            int j=0;
            while(j<count) {
                System.out.print((char) i);
                j++;
            }
            count++;
            System.out.println("");
        }
    }
}
