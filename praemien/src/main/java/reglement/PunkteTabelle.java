package reglement;



public class PunkteTabelle {
    public int punktId;
    public int punktRennartId;
    public int punktRang;
    public int punktPunkte;

    /**
     * Datenmodell für die Aufnahme der Tabelle für die Punkteberechnung.
     *
     * @param punktId
     * @param punktRennartId Die Rennart ID definiert die Art des Rennens, International, National oder Regional
     * @param punktRang Dem Rang sind je nach Rennart unterschiedlcihe Wertungspunkte zugewiesen.
     * @param punktPunkte die eigentlichen Wertungspunkte
     */
    public PunkteTabelle(int punktId, int punktRennartId, int punktRang, int punktPunkte) {
        this.punktId = punktId;
        this.punktRennartId = punktRennartId;
        this.punktRang = punktRang;
        this.punktPunkte = punktPunkte;
    }

    public PunkteTabelle() {


    }

    public int getPunktId() {
        return punktId;
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
