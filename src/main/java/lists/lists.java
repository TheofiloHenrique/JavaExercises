package lists;

import java.util.ArrayList;
import java.util.List;

public class lists {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("Jorge");
        list.add("ALex");
        list.add("Tonny");
        list.add(2,"Ana");

        list.remove(1);
        System.out.println(list.size());
        list.remove("Tonny");

        for(String x : list){
            System.out.println(x);
        }
    }

}
