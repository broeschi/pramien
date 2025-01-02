
package person;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personId;

	@Column(name = "person_vorname")
	private String personVorname;

	@Column(name = "person_name")
	private String personName;

	@Column(name = "person_jahrgang")
	private int personJahrgang;

	@Column(name = "person_lizenz")
	private int personLizenz;

	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Adresse> adressen;

	public Person(int personId, String personName, String personVorname, int personLizenz) {
		this.personId = personId;
		this.personName = personName;
		this.personVorname = personVorname;
		this.personLizenz = personLizenz;
		this.adressen = new ArrayList<>();
	}

	public Person() {
		this.adressen = new ArrayList<>();
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonVorname() {
		return personVorname;
	}
	
    public int getPersonId() {
        return personId;
    }

	public int personId() {
		return personId;
	}

	public void setPersonVorname(String personVorname) {
		this.personVorname = personVorname;
	}

	public int getPersonJahrgang() {
		return personJahrgang;
	}

	public void setPersonJahrgang(int personJahrgang) {
		this.personJahrgang = personJahrgang;
	}

	public int getPersonLizenz() {
		return personLizenz;
	}

	public void setPersonLizenz(int personLizenz) {
		this.personLizenz = personLizenz;
	}

	public List<Adresse> getAdressen() {
		return adressen;
	}

	public void addAdresse(Adresse adresse) {
		this.adressen.add(adresse);
	}

	public StringProperty personNameProperty() {
		return new SimpleStringProperty(personName);
	}

	public StringProperty personVornameProperty() {
		return new SimpleStringProperty(personVorname);
	}
}
