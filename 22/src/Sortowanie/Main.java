package Sortowanie;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        HashSet<String> slowa = new HashSet<>();
        slowa.add("Jeden");
        slowa.add("Dwa");
        slowa.add("Trzy");
        slowa.add("Cztery");

        System.out.println("\n Slowa HashSet:"+slowa);


// mapa tez nie sortuje
        Map<String, String> slowa1 = new HashMap<>();
        slowa1.put("one", "Jeden");
        slowa1.put("two", "dwa");
        slowa1.put("three", "Trzy");
        slowa1.put("four","Cztery");

        Map<String, String> slowa3 = sortByValues(slowa1);

        for (Map.Entry<String, String> entry : slowa1.entrySet()){
            System.out.println("K:"+entry.getKey() +"V: " +entry.getValue());
        }


        for (Map.Entry<String, String> entry2 : slowa3.entrySet()){
            System.out.println("K:"+entry2.getKey() +"V: " +entry2.getValue());
        }





//treeset sam sortoje
        TreeSet<String> slowa2 = new TreeSet<>();
        slowa2.add("Jeden");
        slowa2.add("Dwa");
        slowa2.add("Trzy");
        slowa2.add("Cztery");

        System.out.println("\n Slowa TreeSet:"+slowa2);




    }
    private static HashMap sortByValues(Map map)
    {
        List list = new LinkedList(map.entrySet());

        Collections.sort(list, new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                return ((Comparable)((Map.Entry)(o1)).getValue())
                        .compareTo(((Map.Entry)(o2)).getValue());
            }

        });

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();){
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(),entry.getValue());

        }
return sortedHashMap;
    }
}
