package stammdaten;

public class RennArt {
	
	public int  rennArtId;
	public String  rennArtName;
	
	
	public RennArt() {
		
	}
	
	public RennArt(int rennArtId, String rennArtName) {
		
		this.rennArtId = rennArtId;
		this.rennArtName = rennArtName;
	}

	public int getRennArtId() {
		return rennArtId;
	}

	public void setRennArtId(int rennArtId) {
		this.rennArtId = rennArtId;
	}

	public String getRennArtName() {
		return rennArtName;
	}

	public void setRennArtName(String rennArtName) {
		this.rennArtName = rennArtName;
	}

}
