package praemien;

import java.text.DateFormat;

public class EinzelRennen {
	
	public int einzelRennenId;
	public DateFormat einzelRennenRennDatum;
	public String einzelRennenName;
	public int einzelRennenDisziplinId;
	public int einzelRennenSaisonId;
	public int einzelRennenPersonId;
	public int einzelRennenRennArtId;
	public int einzelRennenRang;
	public String einzelRennenLink;
	public int einzelRennenPunkte;
	
	public  EinzelRennen () {
		
	}
/**
 * Konstruktor für das Objekt eines einzelnen Rennen zusammenzufassen
 * 
 * 
 * @param einzelRennenId
 * @param einzelRennenRennDatum
 * @param einzelRennenName
 * @param einzelRennenDisziplinId
 * @param einzelRennenSaisonId
 * @param einzelRennenPersonId
 * @param einzelRennenRennArtId
 * @param einzelRennenRang
 * @param einzelRennenLink
 * @param einzelRennenPunkte
 */
	
	public EinzelRennen(int einzelRennenId, DateFormat einzelRennenRennDatum, String einzelRennenName,
			int einzelRennenDisziplinId, int einzelRennenSaisonId, int einzelRennenPersonId, int einzelRennenRennArtId,
			int einzelRennenRang, String einzelRennenLink, int einzelRennenPunkte) {
		super();
		this.einzelRennenId = einzelRennenId;
		this.einzelRennenRennDatum = einzelRennenRennDatum;
		this.einzelRennenName = einzelRennenName;
		this.einzelRennenDisziplinId = einzelRennenDisziplinId;
		this.einzelRennenSaisonId = einzelRennenSaisonId;
		this.einzelRennenPersonId = einzelRennenPersonId;
		this.einzelRennenRennArtId = einzelRennenRennArtId;
		this.einzelRennenRang = einzelRennenRang;
		this.einzelRennenLink = einzelRennenLink;
		this.einzelRennenPunkte = einzelRennenPunkte;
	}

	public int getEinzelRennenId() {
		return einzelRennenId;
	}

	public void setEinzelRennenId(int einzelRennenId) {
		this.einzelRennenId = einzelRennenId;
	}

	public DateFormat getEinzelRennenRennDatum() {
		return einzelRennenRennDatum;
	}

	public void setEinzelRennenRennDatum(DateFormat einzelRennenRennDatum) {
		this.einzelRennenRennDatum = einzelRennenRennDatum;
	}

	public String getEinzelRennenName() {
		return einzelRennenName;
	}

	public void setEinzelRennenName(String einzelRennenName) {
		this.einzelRennenName = einzelRennenName;
	}

	public int getEinzelRennenDisziplinId() {
		return einzelRennenDisziplinId;
	}

	public void setEinzelRennenDisziplinId(int einzelRennenDisziplinId) {
		this.einzelRennenDisziplinId = einzelRennenDisziplinId;
	}

	public int getEinzelRennenSaisonId() {
		return einzelRennenSaisonId;
	}

	public void setEinzelRennenSaisonId(int einzelRennenSaisonId) {
		this.einzelRennenSaisonId = einzelRennenSaisonId;
	}

	public int getEinzelRennenPersonId() {
		return einzelRennenPersonId;
	}

	public void setEinzelRennenPersonId(int einzelRennenPersonId) {
		this.einzelRennenPersonId = einzelRennenPersonId;
	}

	public int getEinzelRennenRennArtId() {
		return einzelRennenRennArtId;
	}

	public void setEinzelRennenRennArtId(int einzelRennenRennArtId) {
		this.einzelRennenRennArtId = einzelRennenRennArtId;
	}

	public int getEinzelRennenRang() {
		return einzelRennenRang;
	}

	public void setEinzelRennenRang(int einzelRennenRang) {
		this.einzelRennenRang = einzelRennenRang;
	}

	public String getEinzelRennenLink() {
		return einzelRennenLink;
	}

	public void setEinzelRennenLink(String einzelRennenLink) {
		this.einzelRennenLink = einzelRennenLink;
	}

	public int getEinzelRennenPunkte() {
		return einzelRennenPunkte;
	}

	public void setEinzelRennenPunkte(int einzelRennenPunkte) {
		this.einzelRennenPunkte = einzelRennenPunkte;
	}
	
	

}
