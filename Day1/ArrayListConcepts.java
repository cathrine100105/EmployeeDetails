package Day1;

import java.util.ArrayList;

public class ArrayListConcepts {
   private static int n=3;
   public static ArrayList<String> homeManaging = new ArrayList<>();

    public static void main(String[] args) {

        homeManaging.add("Cleaning Room");
        homeManaging.add("Wash the dishes");
        homeManaging.add("cook the dishes");
        System.out.println(homeManaging);
        homeManaging.remove(0);
        homeManaging.add(1,"Folding a cloths");
        for (String managing : homeManaging){
            System.out.println("The Works is " + managing);
        }
    }
}
