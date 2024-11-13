package reglement;

public class KilometerGeld {
	
	public int kmgId;
	public int kmgAnzahlFahrer;
	public double kmgFrankenProKm;
	
	public KilometerGeld() {
		
	}
	
	public KilometerGeld(int kmgId, int kmgAnzahlFaher, double kmgFrankenProKm) {
		this.kmgId = kmgId;
		this.kmgAnzahlFahrer = kmgAnzahlFaher;
		this.kmgFrankenProKm =  kmgFrankenProKm;
	}

	public int getKmgId() {
		return kmgId;
	}

	public void setKmgId(int kmgId) {
		this.kmgId = kmgId;
	}

	public int getKmgAnzahlFahrer() {
		return kmgAnzahlFahrer;
	}

	public void setKmgAnzahlFahrer(int kmgAnzahlFahrer) {
		this.kmgAnzahlFahrer = kmgAnzahlFahrer;
	}

	public double getKmgFrankenProKm() {
		return kmgFrankenProKm;
	}

	public void setKmgFrankenProKm(double kmgFrankenProKm) {
		this.kmgFrankenProKm = kmgFrankenProKm;
	}
	

}
