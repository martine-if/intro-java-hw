package ferrency.ENUMS;

import java.io.Serializable;

public enum Engine implements Serializable {
	AssaultEngine("Assault Drone Engine",1000,3000),
	StrikeEngine("Strike Drone Engine",1200,3100),
	ReconEngine("Recon Drone Engine",1400,3200);

	public String engineType;
	public int engineHP;
	public int engineCost;
	
	private Engine(String engineType, int engineHP, int engineCost) {
		this.engineType = engineType;
		this.engineHP = engineHP;
		this.engineCost = engineCost;
	}
	
	public String showSpecs() {
		String display = "	Engine Type: " + engineType + " Engine HP: " + engineHP + " Engine Cost: " + engineCost;
		return display;
		
	}
}
