package Fasada;

public class BankSystem {

    public float sprawdzStanKontaBankomat(long nrKarty){
        if (nrKarty == 1234567890){
            return 356.78f;
        }else{
            return 0.00f;

        }
    }
    public String wyplacGotwke(int kwota) {
        return "Z konta wyplacono: " + kwota + "PLN";
    }
    public String aktywojKarte(long numerKarty){
        return "Karta"+numerKarty+"aktywna.";
    }
    public void platnoscWeb(){
        //platnosc przez web
    }
    public void platnoscInternet(){
        //platnosc karta przez internet
    }
    public void wykonajPrzelew(long zKonta, long naKonto, float kwota){
        // przelej pieniadze
    }
}
