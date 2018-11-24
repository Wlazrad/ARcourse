package Sortowaniev2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Main {
    //sortowanie listy
    public static void main(String[] args) {
        List<String> slowa = new ArrayList<>();
        slowa.add("jeden");
        slowa.add("dwa");
        slowa.add("trzy");
        slowa.add("cztery");
        slowa.add("piec");
        slowa.add("szesc");
        slowa.add("siedem");
        slowa.add("osiem");
        slowa.add("dziewiec");

        System.out.println(slowa);

        Collections.sort(slowa, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(slowa);
        //latwiejszy sposob
        Collections.sort(slowa);

        System.out.println("===OSOBY====");

        List<Osoba> osoby = new ArrayList<>();

        osoby.add(new Osoba("Jan", "Kowalski"));
        osoby.add(new Osoba("Tadeusz", "Iksinski"));
        osoby.add(new Osoba("Jan", "Nowak"));
        osoby.add(new Osoba("Zygmunt", "Igregocki"));
        osoby.add(new Osoba("Sawomir", "Nowobogacki"));
// bez to string zle zwroci wartosci
        for (Osoba o : osoby){
            System.out.println(o);
        }

// dwie metody na posortowanie
       // Collections.sort(osoby, (Osoba o1, Osoba o2) -> o1.getImie().compareTo(o2.getImie()));
        osoby.sort(Comparator.comparing(Osoba::getImie));
        System.out.println("------");
        for (Osoba o : osoby){
            System.out.println(o);
        }
        Collections.sort(osoby, (Osoba o1, Osoba o2) -> o1.getNazwisko().compareTo(o2.getNazwisko()));
        System.out.println("-------");
        for (Osoba o: osoby){
            System.out.println(o);
        }
    }
}
