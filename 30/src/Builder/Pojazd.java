package Builder;

import java.nio.Buffer;

// duzo zmiennych mozemy sie pomylic w czasie wypelniana konstruktora
public class Pojazd {
    private Integer id;
    private String marka;
    private  Integer kola;
    private Integer poduszkipowietrzne;
    private Integer predkoscMax;
    private String rejstracja;


    public static class Builder {
        private Integer id =null;
        private String marka=null;
        private  Integer kola=0;
        private Integer poduszkipowietrzne=0;
        private Integer predkoscMax=0;
        private String rejstracja=null;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }
        public Builder marka(String marka){
            this.marka=marka;
            return this;
        }
        public Builder kola(Integer kola){
            this.kola=kola;
            return this;
        }
        public Builder poduszkipowietrzne(Integer poduszkipowietrzne){
            this.poduszkipowietrzne=poduszkipowietrzne;
            return this;
        }
        public Builder predkoscMax(Integer predkoscMax){
            this.predkoscMax=predkoscMax;
            return this;
        }
        public Builder rejstracja(String rejstracja){
            this.rejstracja=rejstracja;
            return this;
        }
        public Pojazd build(){
            return new Pojazd(this);
        }

    }
    private Pojazd(Builder builder){
        this.id = builder.id;
        this.marka= builder.marka;
        this.kola= builder.kola;
        this.poduszkipowietrzne=builder.poduszkipowietrzne;
        this.predkoscMax=builder.predkoscMax;
        this.rejstracja=builder.rejstracja;
    }

    public Integer getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public Integer getKola() {
        return kola;
    }

    public Integer getPoduszkipowietrzne() {
        return poduszkipowietrzne;
    }

    public Integer getPredkoscMax() {
        return predkoscMax;
    }

    public String getRejstracja() {
        return rejstracja;
    }


}

