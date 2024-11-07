package Person;

import java.time.LocalDate;

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

	private final IntegerProperty adrId;
	private final StringProperty adrVorname;
	private final StringProperty adrName;
	//private final StringProperty adrStrasse;
	//private final StringProperty adrNr;
	//private final IntegerProperty adrPLZ;
	//private final StringProperty adrWohnort;
	public final IntegerProperty adrJahrgang;


	/**
	 * Konstruktor für eine Person (Modell)
	 * 
	 * @param adrId
	 * @param adrName
	 * @param adrVorname

	 * @param adrJahrgang


	 */
	public Person(Integer adrId, String adrName, String adrVorname, String adrStrasse, Integer adrJahrgang) {
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
	public Person(String adrName, String adrVorname) {
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

	public String getAdrName() {
		return adrName.get();
	}

	public void setAdrName(String adrName) {
		this.adrName.set(adrName);
	}

	public String getAdrVorname() {
		return adrVorname.get();
	}

	public StringProperty VornameProperty() {
		return adrVorname;
	}

	public void setAdrVorname(String adrVorname) {
		this.adrVorname.set(adrVorname);
	}


	public Integer getAdrId() {
		return adrId.get();
	}

	public IntegerProperty adrIdProperty() {
		return adrId;
	}

	public void setAdrId(Integer adrId) {
		this.adrId.set(adrId);
		;
	}


}