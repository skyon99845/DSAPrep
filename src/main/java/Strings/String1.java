package Strings;

//import static jdk.vm.ci.meta.JavaKind.Char;

public class String1 {
    public static void main(String[] args) {
        String nam1="$%#@Abhijit &(((%$#@Vartak";
        String[] mike=nam1.split("[^a-zA-z]+");
        for(String mmine:mike){
            System.out.println(mmine);
        }
//
//

        String name="$#!@$Shubham1443332Kumar...33";
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", -1);
        //trailing space would not be there
        System.out.println("The string one");
        for(int j=0;j<arrOfStr.length;j++)
        {
            System.out.println(j+" place :"+arrOfStr[j]);
        }
//
//        arrOfStr = str.split("@", 0);
//        //trailling space would be there
//        System.out.println("The string one");
//        for(int j=0;j<arrOfStr.length;j++)
//        {
//            System.out.println(j+" place :"+arrOfStr[j]);
//        }
//
//
//        String actualString = "word1-word2-word3-word4-word5";
//        System.out.println("Smile");
//        String[] arr=actualString.split("[- ]",0);
//        for(String aa:arr){
//            System.out.println(aa);
//        }

        String str2="1.2344#%$.3321@fjgk";
        System.out.println("The usage of . in spilt :");
        String[] strr = str2.split("[.]",0);
        for(String ss:strr){
            System.out.println(ss);
        }

    }

}
