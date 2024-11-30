package reglement;

public class Faktor {
	public int faktorId;
	public int faktorKatId;
	public double faktorFaktor;

	/**
	 * Datenmodell für die Umrechnungsfaktoren nach Kategorien.
	 *
	 * @param faktorId
	 * @param faktorKatId
	 * @param faktorFaktor
	 */
	public Faktor(int faktorId, int faktorKatId, double faktorFaktor) {
		this.faktorId = faktorId;
		this.faktorKatId = faktorKatId;
		this.faktorFaktor = faktorFaktor;

	}
	public Faktor() {

	}
	public int getFaktorId() {
		return faktorId;
	}
	public void setFaktorId(int faktorId) {
		this.faktorId = faktorId;
	}
	public int getFaktorKatId() {
		return faktorKatId;
	}
	public void setFaktorKatId(int faktorKatId) {
		this.faktorKatId = faktorKatId;
	}
	public double getFaktorFaktor() {
		return faktorFaktor;
	}
	public void setFaktorFaktor(double faktorFaktor) {
		this.faktorFaktor = faktorFaktor;
	}

}
