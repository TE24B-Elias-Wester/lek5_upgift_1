public class Bil {

    private String marke; 
    private String modell; 
    private String reg_nr; 
    private int ars_modell; 
    private int max_hast; 
    private int hast;
    

    Bil(String marke, String modell, String reg_nr, int ars_modell, int max_hast) {
        setMarke(marke);
        setModell(modell);
        this.reg_nr=reg_nr;
        setArs_modell(ars_modell);
        setMax_hast(max_hast);
        this.hast=0;
    }


    public String getMarke() {
        return marke;
    }


    public void setMarke(String marke) {
        if (marke.isBlank())
            throw new IllegalArgumentException("Ogiltig input");
        this.marke = marke;
    }


    public String getModell() {
        return modell;
    }


    public void setModell(String modell) {
        if (modell.isBlank())
            throw new IllegalArgumentException("Ogiltig input");
        this.modell = modell;
    }


    public String getReg_nr() {
        return reg_nr.toUpperCase();
    }


    public int getArs_modell() {
        return ars_modell;
    }


    public void setArs_modell(int ars_modell) {
        if (ars_modell > 2026 || ars_modell < 1860)
            throw new IllegalArgumentException("Årsmodell ej inom ramarna");
        this.ars_modell = ars_modell;
    }


    public int getMax_hast() {
        return max_hast;
    }


    public void setMax_hast(int max_hast) {
        if (max_hast < 0)
            throw new IllegalArgumentException("Hastigheten får ej vara negativ");
        this.max_hast = max_hast;
    }


    public int getHast() {
        return hast;
    }


    public void setHast(int hast) {
        this.hast=hast;
    }


    public void oka_hast(int hast) {
        if (hast < 0) 
            throw new IllegalArgumentException("Hastighet får ej vara negativ");
        if (hast > max_hast) {
            setHast(max_hast);
        }
        else {
            setHast(this.hast + hast);
        }
        IO.println("Efter att ha ökat hastigheten färdas bilen nu i: " + this.hast);
    }


    public void minska_hast(int hast) {
        if (this.hast - hast < 0) {
            setHast(0);
        }
        else {
            setHast(this.hast - hast);
        }
        IO.println("Efter att ha minskat hastigheten färdas bilen nu i: " + this.hast);
    }


    public String toString() {
        return "Bilen: Märke: " + getMarke() + ", Modell: " + getModell() + ", Reg rn: " + getReg_nr() + ", Årsmodell: " + getArs_modell();
    }
    
    




}
