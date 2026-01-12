package Day1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapTopic {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> details = new LinkedHashMap<>();
        details.put(1,"madhu");
        details.put(2,"kani");
        details.put(3,"mala");
        details.putIfAbsent(4,"MANU");
        System.out.println(details);
        details.remove(3);

        details.put(1,"Madhu R");

        System.out.println(details.containsValue("Kani")?"found" : "Not Found");
        for (Map.Entry<Integer,String> Detail : details.entrySet()){
            System.out.println("Id: " + "--->"+Detail.getKey()+"  " + "Name: "+ Detail.getValue());
        }
    }
}
