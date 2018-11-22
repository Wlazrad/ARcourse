package Builder;
//builder pomaga nam wprowadzac dane zamiast konstruktora
//kiedy mamy wiele parametrow

public class Main {

    public static void main(String[] args) {
        Pojazd p = new Pojazd.Builder()
                .id(1)
                .marka("Ford")
                .rejstracja("ABC12345")
                .predkoscMax(220)
                .poduszkipowietrzne(2)
                .kola(4)
                .build();

        System.out.println(p.getId());
        System.out.println(p.getMarka());
        System.out.println(p.getRejstracja());
        System.out.println(p.getPredkoscMax());
        System.out.println(p.getPoduszkipowietrzne());
        System.out.println(p.getKola());


        Pojazd p2 = new Pojazd.Builder()
                .id(1)
                .marka("Ford")
                .rejstracja("ABC12345")
                .predkoscMax(220)
                .poduszkipowietrzne(2)
                .kola(4)
                .build();

        System.out.println(p2.getId());
        System.out.println(p2.getMarka());
        System.out.println(p2.getRejstracja());
        System.out.println(p2.getPredkoscMax());
        System.out.println(p2.getPoduszkipowietrzne());
        System.out.println(p2.getKola());
    }
}

