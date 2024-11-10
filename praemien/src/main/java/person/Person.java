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

	private int adrId;
	private String adrVorname;
	private String adrName;
	//private final StringProperty adrStrasse;
	//private final StringProperty adrNr;
	//private final IntegerProperty adrPLZ;
	//private final StringProperty adrWohnort;
	public int adrJahrgang;
	public int adrLizenz;


//	/**
//	 * Konstruktor für eine Person (Modell)
//	 * 
//	 * @param adrId
//	 * @param adrName
//	 * @param adrVorname
//
//	 * @param adrJahrgang
//
//
//	 */
//	public Person(int adrId, String adrName, String adrVorname, int adrJahrgang) {
//		this.adrId = new Integer(adrId);
//		this.adrName = new String(adrName);
//		this.adrVorname = new String(adrVorname);
//		this.adrJahrgang = new Integer(adrJahrgang);
//
//	}

	/**
	 * Konstruktor für die Erfassung von Vorname und Name
	 * 
	 * @param adrName
	 * @param adrVorname
	 */
	public Person(String adrName, String adrVorname) {
		this.adrId = new Integer(adrId);
		this.adrName = new String(adrName);
		this.adrVorname = new String(adrVorname);

		//this.adrJahrgang = new SimpleIntegerProperty(adrJahrgang);

	}
	
	/**
	 * Konstruktor für den Cucumpertest 
	 * 
	 * abgefragt werden die ID, der Name und Vorname des Rennfahrers und seine Lizenznummer
	 * 
	 * 
	 * @param adrId
	 * @param adrName
	 * @param adrVorname
	 * @param adrLizenz
	 */
	public Person(int adrId, String adrName, String adrVorname, int adrLizenz) {
		this.adrId = new Integer(adrId);
		this.adrName = new String(adrName);
		this.adrVorname = new String(adrVorname);
		this.adrLizenz = new Integer(adrLizenz);
			//this.adrJahrgang = new SimpleIntegerProperty(adrJahrgang);

	}

	/**
	 * leerer Konstruktor
	 */
	public Person() {
		this(null, null);
	}

	public String adrName() {
		return adrName;
	}

	public String Vorname() {
		return adrVorname;
	}

	public Integer adrIdProperty() {
		return adrId;
	}

	public int getAdrId() {
		return adrId;
	}

	public void setAdrId(int adrId) {
		this.adrId = adrId;
	}

	public String getAdrVorname() {
		return adrVorname;
	}

	public void setAdrVorname(String adrVorname) {
		this.adrVorname = adrVorname;
	}

	public String getAdrName() {
		return adrName;
	}

	public void setAdrName(String adrName) {
		this.adrName = adrName;
	}

	public int getAdrJahrgang() {
		return adrJahrgang;
	}

	public void setAdrJahrgang(int adrJahrgang) {
		this.adrJahrgang = adrJahrgang;
	}

	public int getAdrLizenz() {
		return adrLizenz;
	}

	public void setAdrLizenz(int adrLizenz) {
		this.adrLizenz = adrLizenz;
	}


}