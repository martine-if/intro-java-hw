package ferrency.ENUMS;

import java.io.Serializable;

public enum Fuselage implements Serializable{
	AssaultFuselage("Assault Drone Fuselage",200,8000),
	StrikeFuselage("Strike Drone Fuselage",250,8100),
	ReconFuselage("Recon Drone Fuselage",150,8200);

	public String fuselageType;
	public int fuselageLength;
	public int fuselageCost;
	
	
	private Fuselage(String fuselageType, int fuselageLength, int fuselageCost) {
		this.fuselageType = fuselageType;
		this.fuselageLength = fuselageLength;
		this.fuselageCost = fuselageCost;
	}
	
	public String showSpecs() {
		String display = "	Fuselage Type: " + fuselageType + " Fuselage Length: " + fuselageLength + " Fuselage Cost: " + fuselageCost;
		return display;
		
	}
}
