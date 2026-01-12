package Day1;

import java.util.LinkedList;

public class LinkedListTopic {
    static LinkedList<String> cities = new LinkedList<>();
    public static void main(String[] args) {
        cities.addFirst("Dindigul");
        cities.addLast("Chennai");
        cities.addFirst("Coimbatore");
        cities.addFirst("Thanjavur");
        cities.addLast("Trichy");

        cities.push("Goa");
        System.out.println(cities);
        cities.remove("Trichy");
    for (String city: cities){
        System.out.println(city);
    }
    }
}
