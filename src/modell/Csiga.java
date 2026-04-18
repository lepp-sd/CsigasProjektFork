package modell;

import java.util.Objects;
import main.Szinek;

public class Csiga {
    private static final char UT_SZIMPLA = '-';
    private static final char UT_DUPLA = '=';
    private static final String ABRA_CSIGA_EMOJI = "\ud83d\udc0c";
    private static final String ABRA_KUKAC_JEL = "@";

    public static char getUTJEL_1() {
        return UT_SZIMPLA;
    }

    public static char getUTJEL_2() {
        return UT_DUPLA;
    }

    public static String getABRA_1() {
        return ABRA_CSIGA_EMOJI;
    }

    public static String getABRA_2() {
        return ABRA_KUKAC_JEL;
    }
    
    // private static final String RESET = "\u001B[0m";
    // private static final String RED = "\u001B[31m";
    // private static final String BLUE = "\u001B[34m";
    // private static final String GREEN = "\u001B[32m";
    
    //private String szin;
    private Szinek szin;
    private String szinKod;
    private String megtettUt;
    private boolean gyorsito;

    public Csiga() {
        this(Szinek.PIROS, false);
    }
    
    public Csiga(Szinek szin) {
        this(szin, false);
    }
    
    public Csiga(Szinek szin, boolean gyorsito) {
        this.szin = szin;
        //this.szinKod = szinKod;
        //setSzinKod();
        szinKod = szin.getAnsiKod();
        this.megtettUt = "";
        this.gyorsito = gyorsito;
    }

    public Szinek getSzin() {
        return szin;
    }

    public String getSzinKod() {
        return szinKod;
    }

    public String getMegtettUt() {
        return megtettUt;
    }

    public boolean isGyorsito() {
        return gyorsito;
    }

    public void setGyorsito(boolean gyorsito) {
        this.gyorsito = gyorsito;
    }
    
   private void setSzinKod() {
       this.szinKod = (this.szin != null) ? this.szin.getAnsiKod() : "\u001B[31m";
    }
   
    public void megy(){
        int tav = (int)(Math.random()*4);
        tav = gyorsito ? tav*2 : tav;
        tav = gyorsito && tav == 0 ? 1 : tav;
        char jel = gyorsito ? Csiga.UT_DUPLA : Csiga.UT_SZIMPLA;
        for (int i = 0; i < tav; i++) {
            megtettUt += jel;
        }
    }

    @Override
    public String toString() {
        return "Csiga{" + "szin=" + szin + ", megtettUt=" + megtettUt + ", gyorsito=" + gyorsito + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.szin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Csiga other = (Csiga) obj;
        return Objects.equals(this.szin, other.szin);
    }
    
}
