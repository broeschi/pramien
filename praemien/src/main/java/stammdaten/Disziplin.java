package stammdaten;

public class Disziplin {

	public int disziplinId;
	public String disziplinName;
	public String disziplinAbk;


	/**
	 * leerer Konstruktor
	 *
	 */
	public Disziplin() {

	}

	public Disziplin(int disziplinId, String disziplinName, String dispziplinAbk)	{

		this.disziplinId = disziplinId;
		this.disziplinName = disziplinName;
		this.disziplinAbk = dispziplinAbk;

	}

	public int getDisziplinId() {
		return disziplinId;
	}

	public void setDisziplinId(int disziplinId) {
		this.disziplinId = disziplinId;
	}

	public String getDisziplinName() {
		return disziplinName;
	}

	public void setDisziplinName(String disziplinName) {
		this.disziplinName = disziplinName;
	}

	public String getDisziplinAbk() {
		return disziplinAbk;
	}

	public void setDisziplinAbk(String disziplinAbk) {
		this.disziplinAbk = disziplinAbk;
	}

}
