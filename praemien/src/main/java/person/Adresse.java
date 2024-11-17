package person;

public class Adresse {

	public int adresseId;
	public int adressePersonId;
	public String adresseStrasse;
	public int adresseNummer;
	public int adressePlz;
	public String adresseOrt;


	/**
	 * Konstruktor für die Adressdaten mit dem Fremdschlussel zum Objekt Person
	 *
	 * @param adresseId
	 * @param adressePersonId
	 * @param adresseStrasse
	 * @param adresseNummer
	 * @param adressePlz
	 * @param adresseOrt
	 */

	public Adresse(int adresseId, int adressePersonId, String adresseStrasse, int adresseNummer, int adressePlz, String adresseOrt) {

		this.adresseId = new Integer(adresseId);
		this.adressePersonId = new Integer(adressePersonId);
		this.adresseStrasse = new String(adresseStrasse);
		this.adresseNummer = new Integer(adresseNummer);
		this.adressePlz = new Integer(adressePlz);
		this.adresseOrt = new String (adresseOrt);

	}


	public Adresse() {

	}


	public int getAdresseId() {
		return adresseId;
	}


	public void setAdresseId(int adresseId) {
		this.adresseId = adresseId;
	}


	public int getAdressePersonId() {
		return adressePersonId;
	}


	public void setAdressePersonId(int adressePersonId) {
		this.adressePersonId = adressePersonId;
	}


	public String getAdresseStrasse() {
		return adresseStrasse;
	}


	public void setAdresseStrasse(String adresseStrasse) {
		this.adresseStrasse = adresseStrasse;
	}


	public int getAdresseNummer() {
		return adresseNummer;
	}


	public void setAdresseNummer(int adresseNummer) {
		this.adresseNummer = adresseNummer;
	}


	public int getAdressePlz() {
		return adressePlz;
	}


	public void setAdressePlz(int adressePlz) {
		this.adressePlz = adressePlz;
	}


	public String getAdresseOrt() {
		return adresseOrt;
	}


	public void setAdresseOrt(String adresseOrt) {
		this.adresseOrt = adresseOrt;
	}

}
