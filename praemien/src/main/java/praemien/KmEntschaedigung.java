package praemien;

public class KmEntschaedigung {

	public int kmEndschId;
	public int kmEntschEinzelRennenId;
	public int kmEntschPersonId;
	public int kmEntschAnzahlFahrer;
	public double kmEntschKmGeld;
	public int kmEntschKm;

	public KmEntschaedigung() {

	}

	/**
	 *
	 * Konstruktor für die Berechnung der Kilometerbeiträge zu den Rennen
	 *
	 * @param kmEndschId
	 * @param kmEntschEinzelRennenId
	 * @param kmEntschPersonId
	 * @param kmEntschAnzahlFahrer
	 * @param kmEntschKmGeld
	 * @param kmEntschKm
	 */
	public KmEntschaedigung(int kmEndschId, int kmEntschEinzelRennenId, int kmEntschPersonId, int kmEntschAnzahlFahrer,
			double kmEntschKmGeld, int kmEntschKm) {
		// super();
		this.kmEndschId = kmEndschId;
		this.kmEntschEinzelRennenId = kmEntschEinzelRennenId;
		this.kmEntschPersonId = kmEntschPersonId;
		this.kmEntschAnzahlFahrer = kmEntschAnzahlFahrer;
		this.kmEntschKmGeld = kmEntschKmGeld;
		this.kmEntschKm = kmEntschKm;
	}

	public int getKmEndschId() {
		return kmEndschId;
	}

	public void setKmEndschId(int kmEndschId) {
		this.kmEndschId = kmEndschId;
	}

	public int getKmEntschEinzelRennenId() {
		return kmEntschEinzelRennenId;
	}

	public void setKmEntschEinzelRennenId(int kmEntschEinzelRennenId) {
		this.kmEntschEinzelRennenId = kmEntschEinzelRennenId;
	}

	public int getKmEntschPersonId() {
		return kmEntschPersonId;
	}

	public void setKmEntschPersonId(int kmEntschPersonId) {
		this.kmEntschPersonId = kmEntschPersonId;
	}

	public int getKmEntschAnzahlFahrer() {
		return kmEntschAnzahlFahrer;
	}

	public void setKmEntschAnzahlFahrer(int kmEntschAnzahlFahrer) {
		this.kmEntschAnzahlFahrer = kmEntschAnzahlFahrer;
	}

	public double getKmEntschKmGeld() {
		return kmEntschKmGeld;
	}

	public void setKmEntschKmGeld(double kmEntschKmGeld) {
		this.kmEntschKmGeld = kmEntschKmGeld;
	}

	public int getKmEntschKm() {
		return kmEntschKm;
	}

	public void setKmEntschKm(int kmEntschKm) {
		this.kmEntschKm = kmEntschKm;
	}

}
