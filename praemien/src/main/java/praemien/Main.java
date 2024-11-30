
package praemien;

import converter.TableCreator;

public class Main {
    public static void main(String[] args) {
        TableCreator tableCreator = new TableCreator();

        String createPersonTableSQL = "CREATE TABLE Person (" +
                "personId INT PRIMARY KEY AUTO_INCREMENT, " +
                "personVorname VARCHAR(255) NOT NULL, " +
                "personName VARCHAR(255) NOT NULL, " +
                "personJahrgang INT, " +
                "personLizenz INT)";
        tableCreator.createTable("Person", createPersonTableSQL);

        String createAdresseTableSQL = "CREATE TABLE Adresse (" +
                "adresseId INT PRIMARY KEY AUTO_INCREMENT, " +
                "adressePersonId INT NOT NULL, " +
                "adresseStrasse VARCHAR(255) NOT NULL, " +
                "adresseNummer INT NOT NULL, " +
                "adressePlz INT NOT NULL, " +
                "adresseOrt VARCHAR(255) NOT NULL)";
        tableCreator.createTable("Adresse", createAdresseTableSQL);

        String createFaktorTableSQL = "CREATE TABLE Faktor (" +
                "faktorId INT PRIMARY KEY AUTO_INCREMENT, " +
                "faktorKatId INT NOT NULL, " +
                "faktorFaktor DOUBLE NOT NULL)";
        tableCreator.createTable("Faktor", createFaktorTableSQL);

        String createKilometerGeldTableSQL = "CREATE TABLE KilometerGeld (" +
                "kmgId INT PRIMARY KEY AUTO_INCREMENT, " +
                "kmgAnzahlFahrer INT NOT NULL, " +
                "kmgFrankenProKm DOUBLE NOT NULL)";
        String createPunkteTabelleTableSQL = "CREATE TABLE PunkteTabelle (" +
                "punktId INT PRIMARY KEY AUTO_INCREMENT, " +
                "punktRennartId INT NOT NULL, " +
                "punktRang INT NOT NULL, " +
                "punktPunkte INT NOT NULL)";
        tableCreator.createTable("PunkteTabelle", createPunkteTabelleTableSQL);

        String createMeisterschaftenTableSQL = "CREATE TABLE Meisterschaften (" +
                "meisterId INT PRIMARY KEY AUTO_INCREMENT, " +
                "meisterName VARCHAR(255) NOT NULL, " +
                "meisterAbk VARCHAR(255) NOT NULL)";
        tableCreator.createTable("Meisterschaften", createMeisterschaftenTableSQL);

        String createRennArtTableSQL = "CREATE TABLE RennArt (" +
                "rennArtId INT PRIMARY KEY AUTO_INCREMENT, " +
                "rennArtName VARCHAR(255) NOT NULL)";
        tableCreator.createTable("RennArt", createRennArtTableSQL);

        String createKmEntschaedigungTableSQL = "CREATE TABLE KmEntschaedigung (" +
                "kmEndschId INT PRIMARY KEY AUTO_INCREMENT, " +
                "kmEntschEinzelRennenId INT NOT NULL, " +
                "kmEntschPersonId INT NOT NULL, " +
                "kmEntschAnzahlFahrer INT NOT NULL, " +
                "kmEntschKmGeld DOUBLE NOT NULL, " +
                "kmEntschKm INT NOT NULL)";
        tableCreator.createTable("KmEntschaedigung", createKmEntschaedigungTableSQL);

        String createDisziplinTableSQL = "CREATE TABLE Disziplin (" +
                "disziplinId INT PRIMARY KEY AUTO_INCREMENT, " +
                "disziplinName VARCHAR(255) NOT NULL, " +
                "disziplinAbk VARCHAR(255) NOT NULL)";
        tableCreator.createTable("Disziplin", createDisziplinTableSQL);

        String createEinzelRennenTableSQL = "CREATE TABLE EinzelRennen (" +
                "einzelRennenId INT PRIMARY KEY AUTO_INCREMENT, " +
                "einzelRennenRennDatum DATE NOT NULL, " +
                "einzelRennenName VARCHAR(255) NOT NULL, " +
                "einzelRennenDisziplinId INT NOT NULL, " +
                "einzelRennenSaisonId INT NOT NULL, " +
                "einzelRennenPersonId INT NOT NULL, " +
                "einzelRennenRennArtId INT NOT NULL, " +
                "einzelRennenRang INT NOT NULL, " +
                "einzelRennenLink VARCHAR(255), " +
                "einzelRennenPunkte INT NOT NULL)";
        tableCreator.createTable("EinzelRennen", createEinzelRennenTableSQL);

        String createPraemienTableSQL = "CREATE TABLE Praemien (" +
                "praemieId INT PRIMARY KEY AUTO_INCREMENT, " +
                "praemienSaisonId INT NOT NULL, " +
                "praemienEinzelRennenId INT NOT NULL, " +
                "praemienHelfereinsatz BOOLEAN NOT NULL, " +
                "praemienEm BOOLEAN NOT NULL, " +
                "praemienWm BOOLEAN NOT NULL, " +
                "praemienOs BOOLEAN NOT NULL, " +
                "praemienTsp BOOLEAN NOT NULL, " +
                "praemienEmBetrag INT NOT NULL, " +
                "praemienWmBetrag INT NOT NULL, " +
                "praemienOsBetrag INT NOT NULL, " +
                "praemienTspBetrag INT NOT NULL, " +
                "praemienLizenzbeitrag INT NOT NULL, " +
                "praemienTalentsichtung INT NOT NULL)";
        tableCreator.createTable("Praemien", createPraemienTableSQL);

        String createSaisonTableSQL = "CREATE TABLE Saison (" +
                "saisonId INT PRIMARY KEY AUTO_INCREMENT, " +
                "saisnonJahr INT NOT NULL, " +
                "saisonVon DATE NOT NULL, " +
                "saisonBis DATE NOT NULL)";
        tableCreator.createTable("Saison", createSaisonTableSQL);
    }
}
