public class Pallindrome {
    public static void main(String[] args) {
        System.out.println("Writing code to check the Pallindrome");
        //Radar
        String n = "Radar";
        String nn=n.toLowerCase();
        System.out.println("The value of nn is "+nn);
        int left=0;
        int flag=0;
        int right=n.length()-1;
        while(left<right){
            if(nn.charAt(left)!=nn.charAt(right)){
                    flag=1;
                System.out.println("Status check"+nn.charAt(left)+nn.charAt(right));
            }
            right-=1;
            left+=1;
            if(flag!=0){
                System.out.println("String is not Pallindrome");
                System.exit(0);
            }
        }
        System.out.println("String is Pallindrome");
    }
}
