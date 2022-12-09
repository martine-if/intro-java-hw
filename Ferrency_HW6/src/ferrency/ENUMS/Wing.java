package ferrency.ENUMS;

import java.io.Serializable;

public enum Wing implements Serializable{
	AssaultWing("Assault Drone Wing",4200,18000),
	StrikeWing("Strike Drone Wing",4250,18100),
	ReconWing("Recon Drone Wing",4300,18200);

	public String wingType;
	public int wingLength;
	public int wingCost;
	
	private Wing(String wingType, int wingLength, int wingCost) {
		this.wingType = wingType;
		this.wingLength = wingLength;
		this.wingCost = wingCost;
	}
	
	public String showSpecs() {
		String display = "	Wing Type: " + wingType + " Wing Length: " + wingLength + " Wing Cost: " + wingCost;
		return display;
	}
}
