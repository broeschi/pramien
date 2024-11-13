package person;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/** Klasse zum Bilden der Teilnehmer */
public class Person {

	public int personId;
	public String personVorname;
	public String personName;
	//private final StringProperty adrStrasse;
	//private final StringProperty adrNr;
	//private final IntegerProperty adrPLZ;
	//private final StringProperty adrWohnort;
	public int personJahrgang;
	public int personLizenz;


//	/**
//	 * Konstruktor für eine Person (Modell)
//	 * 
//	 * @param personId
//	 * @param personName
//	 * @param personVorname
//
//	 * @param personJahrgang
//
//
//	 */
//	public Person(int personId, String personName, String personVorname, int personJahrgang) {
//		this.personId = new Integer(personId);
//		this.personName = new String(personName);
//		this.personVorname = new String(personVorname);
//		this.personJahrgang = new Integer(personJahrgang);
//
//	}

	/**
	 * Konstruktor für die Erfassung von Vorname und Name
	 * 
	 * @param personName
	 * @param personVorname
	 */
//	public Person(String personName, String personVorname) {
//		this.personId = new Integer(personId);
//		this.personName = new String(personName);
//		this.personVorname = new String(personVorname);
//
//		//this.adrJahrgang = new SimpleIntegerProperty(adrJahrgang);
//
//	}
	
	/**
	 * Konstruktor für den Cucumpertest 
	 * 
	 * abgefragt werden die ID, der Name und Vorname des Rennfahrers und seine Lizenznummer
	 * 
	 * 
	 * @param personId
	 * @param personName
	 * @param personVorname
	 * @param personLizenz
	 */
	public Person(int personId, String personName, String personVorname, int personLizenz) {
		this.personId = new Integer(personId);
		this.personName = new String(personName);
		this.personVorname = new String(personVorname);
		this.personLizenz = new Integer(personLizenz);
			//this.adrJahrgang = new SimpleIntegerProperty(adrJahrgang);

	}

	/**
	 * leerer Konstruktor
	 */
	public Person() {
		;
	}

	public String personName() {
		return personName;
	}

	public String Vorname() {
		return personVorname;
	}

	public Integer personIdProperty() {
		return personId;
	}

	public int personId() {
		return personId;
	}
	
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int adrId) {
		this.personId = adrId;
	}

	public String getPersonVorname() {
		return personVorname;
	}

	public void setPersonVorname(String personVorname) {
		this.personVorname = personVorname;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String adrName) {
		this.personName = adrName;
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

	public void setPersonLizenz(int adrLizenz) {
		this.personLizenz = adrLizenz;
	}


}