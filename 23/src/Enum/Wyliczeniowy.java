package Enum;

import java.net.Socket;
import java.sql.SQLOutput;

// do przechowywania staych w osobnym plikow
// typ wyliczniowy ktory mozna zamienic na obiek i wypisac
public class Wyliczeniowy {

    public static void main(String[] args) {
        Samochod sam = new Samochod(Samochody.TOYOTA_AVENSIS.getRok(), Samochody.TOYOTA_AVENSIS.getIlDrzwi());


        if (Samochody.FORD_FIESTA.getRok() == 1993){
            System.out.println("Troche stary");
        }

        int rok = Samochody.FORD_FIESTA.getRok();
        System.out.println(rok);


        for (Samochody s : Samochody.values()) {
            System.out.println(s.getRok() + "," + s.getIlDrzwi());
        }

        switch (rok){
            case 1993:
                System.out.println("trochestary");
                break;
            case 1998:
                System.out.println("nie bardzo");
                break;
            case 2010:
                System.out.println("calkiem calkiem");
                break;
            case 2017:
                System.out.println("nowka jeszcze pojezdzi");
                break;
        }



    }
}
