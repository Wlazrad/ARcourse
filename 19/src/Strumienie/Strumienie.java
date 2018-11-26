package Strumienie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Strumienie {

    public static void main(String[] args) {
        List<Mieszkanie> mList = Arrays.asList(
                new Mieszkanie("Wroclaw", "Psie Pole",
                        "Ulica na Psim Polu",3,67.0f,
                        true,456000),
                new Mieszkanie("Wroclaw", "Krzyki","Ulica na Krzakach",
                        2,54.0f, false, 381000),
                new Mieszkanie("Warszawa", "Bialoleka",
                        "Ulica w Bialolence",4,74.0f,
                        false,622000),
                new Mieszkanie("Poznan", "Dzielnica", "Ulica w Dzielnicy",
                        5,84.0f, false, 901000)
        );
/*
        for (Mieszkanie m : mList){
            if (m.getMiasto().equals("Wroclaw")){
                if (m.getPokoje()>2){
                    if (m.getCena()<500000){
                        System.out.println(m.getMiasto()+" "+m.getCena()+" "+m.getPokoje());
                    }
                }
            }
        }*/

    mList.stream().filter(mieszkanie -> mieszkanie.getMiasto().equals("Wroclaw"))
            .filter(mieszkanie -> mieszkanie.getPokoje()>1)
            .filter(mieszkanie -> mieszkanie.getCena()<500000)
            .map(mieszkanie -> mieszkanie.getMiasto()+" "+mieszkanie.getPokoje()+" "
            +mieszkanie.getCena())
            .forEach(System.out::println);
// drugi sposob
        Predicate<Mieszkanie> mNazwa = m->m.isPiwnica()==false;

        List<Mieszkanie> lista = new ArrayList<>();
        lista = mList.stream().filter(mNazwa).collect(Collectors.toList());


        System.out.println(lista);
    }
}
