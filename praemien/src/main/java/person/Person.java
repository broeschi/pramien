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

	private IntegerProperty adrId;
	private StringProperty adrVorname;
	private StringProperty adrName;
	//private final StringProperty adrStrasse;
	//private final StringProperty adrNr;
	//private final IntegerProperty adrPLZ;
	//private final StringProperty adrWohnort;
	public IntegerProperty adrJahrgang;


	/**
	 * Konstruktor für eine Person (Modell)
	 * 
	 * @param adrId
	 * @param adrName
	 * @param adrVorname

	 * @param adrJahrgang


	 */
	public Person(IntegerProperty adrId, StringProperty adrName, StringProperty adrVorname, StringProperty adrStrasse, IntegerProperty adrJahrgang) {
		this.adrId = new SimpleIntegerProperty(adrId);
		this.adrName = new SimpleStringProperty(adrName);
		this.adrVorname = new SimpleStringProperty(adrVorname);
		this.adrJahrgang = new SimpleIntegerProperty(adrJahrgang);

	}

	/**
	 * Konstruktor für die Erfassung von Vorname und Name
	 * 
	 * @param adrName
	 * @param adrVorname
	 */
	public Person(StringProperty adrName, StringProperty adrVorname) {
		this.adrId = new SimpleIntegerProperty();
		this.adrName = new SimpleStringProperty(adrName);
		this.adrVorname = new SimpleStringProperty(adrVorname);
		//this.adrJahrgang = new SimpleIntegerProperty(adrJahrgang);

	}
	public Person(IntegerProperty adrId, StringProperty adrName, StringProperty adrVorname) {
		this.adrId = new SimpleIntegerProperty();
		this.adrName = new SimpleStringProperty(adrName);
		this.adrVorname = new SimpleStringProperty(adrVorname);
		//this.adrJahrgang = new SimpleIntegerProperty(adrJahrgang);

	}

	/**
	 * leerer Konstruktor
	 */
	public Person() {
		this(null, null);
	}

	public StringProperty AdrNameProperty() {
		return adrName;
	}

	public StringProperty getAdrName() {
		return adrName.get();
	}

	public void setAdrName(StringTring adrName) {
		this.adrName.set(adrName);
	}

	public StringProperty getAdrVorname() {
		return adrVorname.get();
	}

	public StringProperty VornameProperty() {
		return adrVorname;
	}

	public void setAdrVorname(StringProperty adrVorname) {
		this.adrVorname.set(adrVorname);
	}


	public IntegerProperty getAdrId() {
		return adrId.get();
	}

	public IntegerProperty adrIdProperty() {
		return adrId;
	}

	public void setAdrId(Integer adrId) {
		this.adrId.set(adrId);
		;
	}

	public IntegerProperty getAdrJahrgang() {
		return adrJahrgang;
	}

	public void setAdrJahrgang(IntegerProperty adrJahrgang) {
		this.adrJahrgang = adrJahrgang;
	}

	public void setAdrId(IntegerProperty adrId) {
		this.adrId = adrId;
	}

	public void setAdrVorname(StringProperty adrVorname) {
		this.adrVorname = adrVorname;
	}

	public void setAdrName(StringProperty adrName) {
		this.adrName = adrName;
	}


}