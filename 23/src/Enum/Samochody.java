package Enum;

public enum Samochody {

    OPEL_CORSA(1998, 2),
    FORD_FIESTA(1993, 2),
    VW_POLO(2010, 4),
    TOYOTA_AVENSIS(2017, 4);

    private int rok;
    private int ilDrzwi;

    Samochody(int rok, int ilDrzwi){
        this.rok = rok;
        this.ilDrzwi= ilDrzwi;
    }

    @Override
    public String toString() {
        return super.toString() +"Samochody{" +
                "rok=" + rok +
                ", ilDrzwi=" + ilDrzwi +
                '}';
    }

    public int getRok() {
        return rok;
    }

    public int getIlDrzwi() {
        return ilDrzwi;
    }
}
