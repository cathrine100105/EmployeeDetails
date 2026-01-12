package Day1;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {
   public static List<String> names = new ArrayList<>();
    public static void main(String[] args) {
        names.add("Arun");
        names.add("Madhu");
        names.add("Peter");
        names.add("helen");
        names.add("Kala");

        names.removeIf(names -> names.startsWith("A"));
        names.remove(1);
        names.remove(2);


        for (String Name : names){
            System.out.println("The names is " + Name);
        }
    }
}
