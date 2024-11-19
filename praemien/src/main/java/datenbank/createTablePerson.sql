
CREATE TABLE Faktor (
    faktorId INT PRIMARY KEY AUTO_INCREMENT,
    faktorKatId INT NOT NULL,
    faktorFaktor DOUBLE NOT NULL
);

CREATE TABLE Adresse (
    adresseId INT PRIMARY KEY AUTO_INCREMENT,
    adressePersonId INT NOT NULL,
    adresseStrasse VARCHAR(255) NOT NULL,
    adresseNummer INT NOT NULL,
    adressePlz INT NOT NULL,
    adresseOrt VARCHAR(255) NOT NULL
);

CREATE TABLE Person (
    personId INT PRIMARY KEY AUTO_INCREMENT,
    personVorname VARCHAR(255) NOT NULL,
    personName VARCHAR(255) NOT NULL,
    personJahrgang INT,
    personLizenz INT
);

CREATE TABLE KilometerGeld (
    kmgId INT PRIMARY KEY AUTO_INCREMENT,
    kmgAnzahlFahrer INT NOT NULL,
    kmgFrankenProKm DOUBLE NOT NULL
);

CREATE TABLE PunkteTabelle (
    punktId INT PRIMARY KEY AUTO_INCREMENT,
    punktRennartId INT NOT NULL,
    punktRang INT NOT NULL,
    punktPunkte INT NOT NULL
);

CREATE TABLE Meisterschaften (
    meisterId INT PRIMARY KEY AUTO_INCREMENT,
    meisterName VARCHAR(255) NOT NULL,
    meisterAbk VARCHAR(255) NOT NULL
);
