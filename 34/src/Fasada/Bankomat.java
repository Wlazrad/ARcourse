package Fasada;

import java.util.Scanner;

public class Bankomat {

    private BankomatFacade bankomatFacade = new BankomatFacade();
    private static Bankomat bankomat = new Bankomat();


    public static void main(String[] args) {
        bankomat.bankomatStart();
    }

    public void bankomatStart() {
        int pin = 0;
        boolean autoryzacja = false;

        System.out.println("------WITAJ W BANKOMACIE SZEMRANEGO BANKU------");
        System.out.println("--------Wloz karte i podaj kod PIN-------");
        Scanner sc = new Scanner(System.in);
        System.out.println("kod PIN: ");
        pin = sc.nextInt();

        System.out.println("Autoryzacja...\n");

        autoryzacja = bankomatFacade.identyfikacja(1234567890, pin);
        if (autoryzacja) {
            bankomat.pokazMenu();
        } else {
            System.out.println("Autoryzacja nie powiodla sie ");
            bankomat.koniec();
        }
    }
    public void pokazMenu(){
        System.out.println("====MENU====");
        System.out.println("1.Stan konta");
        System.out.println("2.Wyplata gotowki");
        System.out.println("3.Koniec\n");

        System.out.print("Wybierz: ");
        Scanner sc = new Scanner(System.in);
        int wybor = sc.nextInt();

        switch(wybor){
            case 1: bankomat.pokazStanKonta(1234567890);
            break;
            case 2: bankomat.wyplacGotowke(200);
            break;
            case 3: bankomat.koniec();
            break;
            default:
                bankomat.pokazMenu();
        }
    }

    public void pokazStanKonta(long nrKarty){
        System.out.println(bankomatFacade.sprawdzStanKontaBankomat(nrKarty));
        bankomat.pokazMenu();
    }
    public void wyplacGotowke(int kwota){
        String wyplata = bankomatFacade.wyplacGotowke(kwota);
        System.out.println(wyplata);
        System.out.println("Odbierz kartę.");
        bankomat.koniec();

    }
    public void koniec(){
        System.exit(0);
    }
}

