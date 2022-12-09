package ferrency.CLASSES;

import ferrency.ENUMS.Engine;
import ferrency.ENUMS.Fuselage;
import ferrency.ENUMS.Wing;

public class ReconDrone extends ImperialDrone{

	private static final long serialVersionUID = 1L;
	public String reconCode;
	public String RDV;
	
	public ReconDrone(String droneID) {
		super(droneID, "Recon");
		this.setRDV(null);
		this.setReconCode(null);
		this.setFuselage(Fuselage.ReconFuselage);
		this.setWings(Wing.ReconWing);
		this.setEngine(Engine.ReconEngine);
	}

	public String getReconCode() {
		return reconCode;
	}

	public void setReconCode(String reconCode) {
		this.reconCode = reconCode;
	}

	public String getRDV() {
		return RDV;
	}

	public void setRDV(String rDV) {
		RDV = rDV;
	}

	public void displayDroneSpecs() {
		System.out.println("____RECON DRONE____");
		super.displayDroneSpecs();
		System.out.println(this.getFuselage().showSpecs());
		System.out.println(this.getWings().showSpecs());
		System.out.println(this.getEngine().showSpecs());
	}
}
