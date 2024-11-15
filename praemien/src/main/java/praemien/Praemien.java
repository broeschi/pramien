package praemien;

public class Praemien {
	
	public int praemieId;
	public int praemienSaisonId;
	public int praemienEinzelRennenId;
	public boolean praemienHelfereinsatz;
	public boolean praemienEm;
	public boolean praemienWm;
	public boolean praemienOs;
	public boolean praemienTsp;
	public int praemienEmBetrag;
	public int praemienWmBetrag;
	public int praemienOsBetrag;
	public int praemienTspBetrag;
	public int praemienLizenzbeitrag;
	public int praemienTalentsichtung;
	
	public Praemien () {
		
	}

	public Praemien(int praemieId, int praemienSaisonId, int praemienEinzelRennenId, boolean praemienHelfereinsatz,
			boolean praemienEm, boolean praemienWm, boolean praemienOs, boolean pramienTsp, int praemienEmBetrag,
			int praemienWmBetrag, int praemienOsBetrag, int praemienTspBetrag, int praemienLizenzbeitrag,
			int pramienTalentsichtung) {
		//super();
		this.praemieId = praemieId;
		this.praemienSaisonId = praemienSaisonId;
		this.praemienEinzelRennenId = praemienEinzelRennenId;
		this.praemienHelfereinsatz = praemienHelfereinsatz;
		this.praemienEm = praemienEm;
		this.praemienWm = praemienWm;
		this.praemienOs = praemienOs;
		this.praemienTsp = praemienTsp;
		this.praemienEmBetrag = praemienEmBetrag;
		this.praemienWmBetrag = praemienWmBetrag;
		this.praemienOsBetrag = praemienOsBetrag;
		this.praemienTspBetrag = praemienTspBetrag;
		this.praemienLizenzbeitrag = praemienLizenzbeitrag;
		this.praemienTalentsichtung = pramienTalentsichtung;
	}

	public int getPraemieId() {
		return praemieId;
	}

	public void setPraemieId(int praemieId) {
		this.praemieId = praemieId;
	}

	public int getPraemienSaisonId() {
		return praemienSaisonId;
	}

	public void setPraemienSaisonId(int praemienSaisonId) {
		this.praemienSaisonId = praemienSaisonId;
	}

	public int getPraemienEinzelRennenId() {
		return praemienEinzelRennenId;
	}

	public void setPraemienEinzelRennenId(int praemienEinzelRennenId) {
		this.praemienEinzelRennenId = praemienEinzelRennenId;
	}

	public boolean isPraemienHelfereinsatz() {
		return praemienHelfereinsatz;
	}

	public void setPraemienHelfereinsatz(boolean praemienHelfereinsatz) {
		this.praemienHelfereinsatz = praemienHelfereinsatz;
	}

	public boolean isPraemienEm() {
		return praemienEm;
	}

	public void setPraemienEm(boolean praemienEm) {
		this.praemienEm = praemienEm;
	}

	public boolean isPraemienWm() {
		return praemienWm;
	}

	public void setPraemienWm(boolean praemienWm) {
		this.praemienWm = praemienWm;
	}

	public boolean isPraemienOs() {
		return praemienOs;
	}

	public void setPraemienOs(boolean praemienOs) {
		this.praemienOs = praemienOs;
	}

	public boolean isPramienTsp() {
		return praemienTsp;
	}

	public void setPramienTsp(boolean pramienTsp) {
		this.praemienTsp = pramienTsp;
	}

	public int getPraemienEmBetrag() {
		return praemienEmBetrag;
	}

	public void setPraemienEmBetrag(int praemienEmBetrag) {
		this.praemienEmBetrag = praemienEmBetrag;
	}

	public int getPraemienWmBetrag() {
		return praemienWmBetrag;
	}

	public void setPraemienWmBetrag(int praemienWmBetrag) {
		this.praemienWmBetrag = praemienWmBetrag;
	}

	public int getPraemienOsBetrag() {
		return praemienOsBetrag;
	}

	public void setPraemienOsBetrag(int praemienOsBetrag) {
		this.praemienOsBetrag = praemienOsBetrag;
	}

	public int getPraemienTspBetrag() {
		return praemienTspBetrag;
	}

	public void setPraemienTspBetrag(int praemienTspBetrag) {
		this.praemienTspBetrag = praemienTspBetrag;
	}

	public int getPraemienLizenzbeitrag() {
		return praemienLizenzbeitrag;
	}

	public void setPraemienLizenzbeitrag(int praemienLizenzbeitrag) {
		this.praemienLizenzbeitrag = praemienLizenzbeitrag;
	}

	public int getPramienTalentsichtung() {
		return praemienTalentsichtung;
	}

	public void setPramienTalentsichtung(int pramienTalentsichtung) {
		this.praemienTalentsichtung = pramienTalentsichtung;
	}
	

}
