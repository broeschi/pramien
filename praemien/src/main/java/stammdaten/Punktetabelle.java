package stammdaten;



public class Punktetabelle {
    public int punktid;
    public int punktRennartId;
    public int punktRang;
    public int punktPunkte;

    public Punktetabelle(int punktid, int punktRennartId, int punktRang, int punktPunkte) {
        this.punktid = punktid;
        this.punktRennartId = punktRennartId;
        this.punktRang = punktRang;
        this.punktPunkte = punktPunkte;
    }
    
    public Punktetabelle() {
    	;
    	
    }

    public int getPunktId() {
        return punktid;
    }

    public int getPunktRennartId() {
        return punktRennartId;
    }

    public int getPunktRang() {
        return punktRang;
    }

    public int getPunktPunkte() {
        return punktPunkte;
    }
}
