package model;

public class Lada {
    
    public static final String TALALT = "talált";
    public static final String MELLE = "mellé";
    
    boolean ladamegvan;
    
    public Lada(){
        ladamegvan = false;
    }
    
    public boolean kincsMegvan(){
        int i = 0;
        if (ladamegvan) {
            System.out.println(ladamegvan);
        }else{
            System.out.println(!ladamegvan);
        }
        return ladamegvan;
    }
}
