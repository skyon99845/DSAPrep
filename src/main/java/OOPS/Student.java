package OOPS;

public class Student {
    public static void main(String[] args) {
        Profile obj=new Profile() {
            @Override
            public void Name() {
                Profile.super.Name();
            }
            @Override
            public void getRollNo(){
                Profile.super.getRollNo();
            }
        };
        System.out.println("Accessing obj of Name from Student");
        obj.Name();
        System.out.println("Accessing obj of getRollNo from Student");
        obj.getRollNo();
    }
}

interface getName{
    void Name();
}

interface getRollNo{
    void getRollNo();
}

interface Profile extends getName,getRollNo{
    @Override
    default void Name(){
        System.out.println("Response from Name------------------------------->");
    }

    @Override
    default void getRollNo(){
        System.out.println("Response from getRollNo------------------------------->");
    }
}

