package reglement;

public class Meisterschaften {
	
	public int meisterId;
	public String meisterName;
	public String meisterAbk;
	
	public Meisterschaften() {
		
	}
	
	public Meisterschaften(int meisterId, String meisterName, String meisterAbk) {
		this.meisterId = meisterId;
		this.meisterName = meisterName;
		this.meisterAbk = meisterAbk;
		
	}

	public int getMeisterId() {
		return meisterId;
	}

	public void setMeisterId(int meisterId) {
		this.meisterId = meisterId;
	}

	public String getMeisterName() {
		return meisterName;
	}

	public void setMeisterName(String meisterName) {
		this.meisterName = meisterName;
	}

	public String getMeisterAbk() {
		return meisterAbk;
	}

	public void setMeisterAbk(String meisterAbk) {
		this.meisterAbk = meisterAbk;
	}
	

}
