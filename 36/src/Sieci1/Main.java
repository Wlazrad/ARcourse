package Sieci1;

import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception{
//odczytanie swojego
        InetAddress adres = InetAddress.getLocalHost();
        System.out.println(adres);
//odczytanie ip domeny
        adres = InetAddress.getByName("onet.pl");
        System.out.println(adres);

        InetAddress adresy[] = InetAddress.getAllByName("amazon.com");
        for (int x = 0 ; x< adresy.length; x++) {
            System.out.println(adresy[x]);

        }

//finalna klasa nie mozliwa do rozszezenia
        URL url = new URL( "http://onet.pl/sport");

        //konstruktor
        //podstawowe
        System.out.println("Protokol: "+url.getProtocol());
        System.out.println("Komputer: "+url.getHost());
        System.out.println("Port: " +url.getPort());
        System.out.println("Plik: " + url.getFile());
        System.out.println("Calosc: " + url.toExternalForm());


        URL u = new URL ("http://amazon.com");
        //polaczenie do serwera
        URLConnection urlConection = u.openConnection();

        long data = urlConection.getDate();
        System.out.println(new Date(data));

        System.out.println(urlConection.getContentType());

        // pobierac daty waznosci

        data = urlConection.getExpiration();
        System.out.println(new Date(data));

        // data ostatniej modyfikacji
        data = urlConection.getLastModified();
        System.out.println(new Date(data));

        int x = urlConection.getContentLength();
        System.out.println(x);
    }
}
