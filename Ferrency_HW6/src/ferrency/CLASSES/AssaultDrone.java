package ferrency.CLASSES;

import ferrency.ENUMS.*;

public class AssaultDrone extends ImperialDrone {
	
	private static final long serialVersionUID = 1L;
	public String assaultCode;
	public String ADV;

	public AssaultDrone(String droneID) {
		super(droneID, "Assault");
		this.setADV(null);
		this.setAssaultCode(null);
		this.setFuselage(Fuselage.AssaultFuselage);
		this.setWings(Wing.AssaultWing);
		this.setEngine(Engine.AssaultEngine);

	}

	public String getAssaultCode() {
		return assaultCode;
	}

	public void setAssaultCode(String assaultCode) {
		this.assaultCode = assaultCode;
	}

	public String getADV() {
		return ADV;
	}

	public void setADV(String aDV) {
		ADV = aDV;
	}

	public void displayDroneSpecs() {
		System.out.println("____ASSAULT DRONE____");
		super.displayDroneSpecs();
		System.out.println(this.getFuselage().showSpecs());
		System.out.println(this.getWings().showSpecs());
		System.out.println(this.getEngine().showSpecs());
	}

}
