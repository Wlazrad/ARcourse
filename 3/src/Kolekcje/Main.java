package Kolekcje;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	String[] tabStr = new String[3];

	    tabStr[0] = "aa";
        tabStr[1] = "bb";
        tabStr[2] = "cc";

        for(int x=0;x<tabStr.length;x++){
            System.out.println(tabStr[x]);
        }
        tabStr[1] ="zz";

        for(int x=0; x<tabStr.length;x++)
        {
            System.out.println(tabStr[x]);
        }

        System.out.println("=======Kolekcje=======");

        List<String> listaStr = new ArrayList<>();

        listaStr.add("jeden");
        listaStr.add("dwa");
        listaStr.add("trzy");

        for(String s : listaStr){
            System.out.println(s);
        }
        for(int x=0;x<listaStr.size();x++)
        {
            System.out.println(listaStr.get(x));
        }

        listaStr.add(1,"zero");

        for(int x=0;x<listaStr.size();x++)
        {
            System.out.println(listaStr.get(x));
        }
        listaStr.remove(1);

        for (int x=0;x<listaStr.size();x++)
        {
            System.out.println(listaStr.size());
        }
        System.out.println(listaStr.contains("dwa"));

        System.out.println("======MAPA=====");

        Map<Integer,String> mapa = new HashMap<>();

        mapa.put(1,"jeden");
        mapa.put(2,"dwa");
        mapa.put(3,"trzy");

        mapa.size();
        System.out.println(mapa.containsValue("piec"));
        System.out.println(mapa.values());


        for (Map.Entry<Integer, String> m: mapa.entrySet())
        {
            int klucz = m.getKey();
            String wartosc = m.getValue();
            System.out.println(klucz+":" +wartosc);

        }




    }
}
