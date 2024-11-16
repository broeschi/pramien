package praemien;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Praemien {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "praemie_id")
    private int praemieId;

    @Column(name = "praemien_saison_id")
    private int praemienSaisonId;

    @Column(name = "praemien_einzel_rennen_id")
    private int praemienEinzelRennenId;

    @Column(name = "praemien_helfereinsatz")
    private boolean praemienHelfereinsatz;

    @Column(name = "praemien_em")
    private boolean praemienEm;

    @Column(name = "praemien_wm")
    private boolean praemienWm;

    @Column(name = "praemien_os")
    private boolean praemienOs;

    @Column(name = "praemien_tsp")
    private boolean praemienTsp;

    @Column(name = "praemien_em_betrag")
    private int praemienEmBetrag;

    @Column(name = "praemien_wm_betrag")
    private int praemienWmBetrag;

    @Column(name = "praemien_os_betrag")
    private int praemienOsBetrag;

    @Column(name = "praemien_tsp_betrag")
    private int praemienTspBetrag;

    @Column(name = "praemien_lizenzbeitrag")
    private int praemienLizenzbeitrag;

    @Column(name = "praemien_talentsichtung")
    private int praemienTalentsichtung;
	
	public Praemien () {
		
	}

	public Praemien(int praemieId, int praemienSaisonId, int praemienEinzelRennenId, boolean praemienHelfereinsatz,
			boolean praemienEm, boolean praemienWm, boolean praemienOs, boolean praemienTsp, int praemienEmBetrag,
			int praemienWmBetrag, int praemienOsBetrag, int praemienTspBetrag, int praemienLizenzbeitrag,
			int praemienTalentsichtung) {
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
		this.praemienTalentsichtung = praemienTalentsichtung;
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

	public boolean isPraemienTsp() {
		return praemienTsp;
	}

	public void setPraemienTsp(boolean praemienTsp) {
		this.praemienTsp = praemienTsp;
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

	public void setPraemienTalentsichtung(int praemienTalentsichtung) {
		this.praemienTalentsichtung = praemienTalentsichtung;
	}
	

}
