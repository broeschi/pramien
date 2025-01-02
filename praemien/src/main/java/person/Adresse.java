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
	private int adressePersonId;
	
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
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;


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

    public Adresse(int adresseId, int adressePersonId, String adresseStrasse, int adresseNummer, int adressePlz, String adresseOrt, LocalDate adresseDatum) {
        this.adresseId = adresseId;
        this.adressePersonId = adressePersonId;
        this.adresseStrasse = adresseStrasse;
        this.adresseNummer = adresseNummer;
        this.adressePlz = adressePlz;
        this.adresseOrt = adresseOrt;
        this.adresseGueltigAb = adresseDatum;
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
	
	public int getAdressePersonId() {
		return (adressePersonId);
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
	
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


	public void setGueltigAb(LocalDate now) {
		this.adresseGueltigAb = now;
		
	}


}
