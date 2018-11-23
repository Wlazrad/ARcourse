package Czas;
// strefy czasowe
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//pobieranie stref czasowych
        System.out.println(ZoneId.getAvailableZoneIds());
        ZoneId strefa1 = ZoneId.of("Europe/Oslo");
        ZoneId strefa2 = ZoneId.of("America/Los_Angeles");

        System.out.println(strefa1.getRules());
        System.out.println(strefa2.getRules());

        LocalTime local1 = LocalTime.now(strefa1);
        LocalTime local2 = LocalTime.now(strefa2);
// siegam po czas w innych strefach czasowych
        System.out.println(local1);
        System.out.println(local2);

        long roznicaGodziny = ChronoUnit.HOURS.between(local1,local2);
        System.out.println("Roznica w godz.: " +roznicaGodziny);
        long roznicawminutach = ChronoUnit.MINUTES.between(local1,local2);

        System.out.println("Roznica w minutach :"+roznicawminutach);


        // mozemy zbudowac czas

        //LocalTime czas = LocalTime.of(12,9);

       // System.out.println(czas);

       // DateTimeFormatter formatter =
           //     DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
           //     .withLocale(Locale.US);
    //    LocalTime czas1 = LocalTime.parse("07:37 PM",formatter);
     //   System.out.println(czas1);

        LocalTime czas2 =local1.minusHours(3);
        LocalTime czas3 = local2.plusMinutes(45);
        System.out.println(czas2);
        System.out.println(czas3);

        System.out.println("====LOCAL DATA====");

        LocalDate dzis = LocalDate.now();
        System.out.println(dzis);

        LocalDate jutro = dzis.plusDays(0);
        System.out.println(jutro);

        LocalDate wczoraj = dzis.minusDays(1);
        System.out.println(wczoraj);

        LocalDate dzien = LocalDate.of(2018, Month.MAY,17);
        System.out.println(dzien);
        DayOfWeek dzienTygodnia = dzien.getDayOfWeek();
        System.out.println(dzienTygodnia);

//niedziala formatter
       // DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.getDefault());

        //LocalDate data = LocalDate.parse("17.12.2018",formatter);
       // System.out.println("Data sformatowana:" +data);


        LocalDateTime ldt =LocalDateTime.of(2018,12,31,23,59,59);
        System.out.println(ldt);
        DayOfWeek dow = ldt.getDayOfWeek();
        System.out.println(dow);







    }
}
