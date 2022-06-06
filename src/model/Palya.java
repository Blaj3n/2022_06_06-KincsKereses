package model;

public class Palya {
    
    public static final int PALYA_HOSSZ = 3;
    public static final char KINCS_JEL = 'X';
    public static final int TALALT_JEL = '1';
    public static final int NEMTALALT_JEL = '0';
    
    private Lada lada;
    private boolean megvanKincs;
    
    public Palya(){
        palyaReset();
    }

    private void palyaReset() {
        megvanKincs = true;
        palya = new char[PALYA_HOSSZ];
        for (int i = 0; i < PALYA_HOSSZ; i++) {
            palya[i] = '_';
        }
    }
}
