import java.util.ArrayList;
import java.util.List;

public class ArrayListDetail {
    public static void main(String[] args) {
        ArrayList<String> studentName=new ArrayList<>();
        System.out.println("The length of ArrayList is :"+studentName.size());

        studentName.add("Shubham");
        studentName.add("Shubham Kumar");
        studentName.add("Shubham Yadav");
        System.out.println("The length of ArrayList is :"+studentName.size());


        List<Integer>List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        System.out.println("THe List is :"+List);

        System.out.println("Adding element 4 at the end of the List");
        List.add(4);
        System.out.println("The List is "+List);

        //The list is [1,2,3,4]
        System.out.println("Inserting element at index 1 of the List");
        List.add(1,4);
        System.out.println("Inserting element at the index 1 which is 4, the new List is :"+List);


        System.out.println("Creating new list newList and adding the all the elements of the List");
        ArrayList<Integer> newList = new ArrayList<Integer>();
        System.out.println("Addding the 150 and 160 into the newList");
        newList.add(150);
        newList.add(160);
        System.out.println("The newList is :"+newList);
        System.out.println("Adding the elements into the newList from the arrayList List");
        newList.addAll(List);
        System.out.println("The newList is :"+newList);

        //removing the elements from the index
        System.out.println("The newList is "+newList);
        newList.remove(1);
        System.out.println("The newList after removing the elment at the index 1");
        System.out.println(newList);

        //removing the element from the list
        System.out.println("Removing the element 150 from the newList"+newList.remove(Integer.valueOf(150)));
        System.out.println("After removing the 150 the newList is :"+newList);
        System.out.println("Updating the value at the index 1 with 200"+newList.set(1,200));

        System.out.println("Checking the the newList contains 2300 or not :"+newList.contains(2300));


        System.out.println("The size of the newList :"+newList);

    }

}
