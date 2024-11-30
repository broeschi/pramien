package person;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "adresse")
public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adresseId;
	
	@ManyToOne
	@JoinColumn(name =  "person_id")
	private Person person;
	
	@Column(name = "strasse")
	private String adresseStrasse;
	
	@Column(name = "strassennummer")
	private int adresseNummer;
	
	@Column (name = "plz")
	private int adressePlz;
	
	@Column (name = "ort")
	private  String adresseOrt;
	
	@Column (name = "gueltig_ab)")
	private LocalDate adresseGueltigAb;


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

	public Adresse(int adresseId, int adressePersonId, String adresseStrasse, int adresseNummer, int adressePlz, String adresseOrt, LocalDate adresseGueltigAb) {

		this.adresseId = new Integer(adresseId);
		
		this.adresseStrasse = new String(adresseStrasse);
		this.adresseNummer = new Integer(adresseNummer);
		this.adressePlz = new Integer(adressePlz);
		this.adresseOrt = new String (adresseOrt);
		this.adresseGueltigAb =  adresseGueltigAb;

	}


	public Adresse() {

	}

    // New constructor
    public Adresse(int id, int number, String street, int postalCode, int cityCode, String city) {
        this(id, number, street, postalCode, cityCode, city, LocalDate.now());
    }


	public int getAdresseId() {
		return adresseId;
	}


	public void setAdresseId(int adresseId) {
		this.adresseId = adresseId;
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
	
	public Person getPerson()  {
		return person;
	}
	
	public void setPerson (Person person) {
		this.person =person;
	}


	public void setGueltigAb(LocalDate now) {
		this.adresseGueltigAb = now;
		
	}

}
