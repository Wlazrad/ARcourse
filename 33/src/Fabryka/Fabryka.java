package Fabryka;

import java.util.Scanner;

public class Fabryka {
    public static void main (String[] arg){

        Fabryka f = new Fabryka();

        System.out.println("Podaj markę: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String marka  = f.dajSamochod(str).getMarka();
        String klasa = f.dajSamochod(str).getClass().getName();

        System.out.println(marka);
        System.out.println(klasa);


    }
    public Samochody dajSamochod(String marka){
        Samochody samochod;
        //jak jest else too warunek nie jest sprawdzany dalej jak true
        if (marka.equals("fiat")) {
            samochod = new Fiat();
        }else if (marka.equals("ford")){
            samochod = new Ford();
        }else if(marka.equals("mercedes")) {
            samochod = new Mercedes();
        }else{
            samochod = new Samochody();
        }
        return samochod;
    }
}
