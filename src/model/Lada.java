package model;

public class Lada {

    public static final String TALALT = "talált";
    public static final String MELLE = "mellé";

    private boolean ladamegvan;

    public void setLadamegvan(boolean ladamegvan) {
        this.ladamegvan = ladamegvan;
    }

    public boolean kincsMegvan() {
        System.out.println(ladamegvan);
        return ladamegvan;
    }

    public Lada() {
        ladamegvan = false;
    }

}
