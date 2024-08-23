import java.util.*;
import java.util.HashMap;
public class HashMap1{

    public static void main(String args[]){
        HashMap <String,Integer> hm = new  HashMap<>();
        hm.put("India",100);
        hm.put("China",200);
        hm.put("Indonasia",40);

        System.out.println(hm);

        int population=hm.get("India");
        System.out.println(population);

        System.out.println(hm.containsKey("India"));

        System.out.println(hm.remove("India"));

        System.out.println(hm);

        System.out.println(hm.size());

        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
        //System.out.println(hm.containsKey(Autralia));

    }

}
