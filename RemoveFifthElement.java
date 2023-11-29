package Arraylist;


import java.util.*;
//. Write a Java program to remove the fifth element from an array list


    public class RemoveFifthElement{


        public static void main(String[] args)
        {
            List<String> ArrayList_Str = new ArrayList<String>();
            ArrayList_Str.add("Black");
            ArrayList_Str.add("White");
            ArrayList_Str.add("Orange");
            ArrayList_Str.add("Purple");
            ArrayList_Str.add("Green");
           ArrayList_Str.add("Yellow");
            ArrayList_Str.add("Red");
           ArrayList_Str.add("Blue");
           ArrayList_Str.add("Pink");
//            Collections.sort(ArrayList_Str);
            System.out.println("Before Removing : "+ArrayList_Str);
            ArrayList_Str.remove(5);
            Collections.sort(ArrayList_Str);
            System.out.println("\nAfter Removing : "+ArrayList_Str);
        }
    }


