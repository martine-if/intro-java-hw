package ferrency.CLASSES;

import ferrency.ENUMS.Engine;
import ferrency.ENUMS.Fuselage;
import ferrency.ENUMS.Wing;

public class StrikeDrone extends ImperialDrone {

	private static final long serialVersionUID = 1L;
	public String strikeCode;
	public String SDV;
	
	public StrikeDrone(String droneID) {
		super(droneID, "Strike");
		this.setSDV(null);
		this.setStrikeCode(null);
		this.setFuselage(Fuselage.StrikeFuselage);
		this.setWings(Wing.StrikeWing);
		this.setEngine(Engine.StrikeEngine);
	}

	public String getStrikeCode() {
		return strikeCode;
	}

	public void setStrikeCode(String strikeCode) {
		this.strikeCode = strikeCode;
	}

	public String getSDV() {
		return SDV;
	}

	public void setSDV(String sDV) {
		SDV = sDV;
	}

	public void displayDroneSpecs() {
		System.out.println("____STRIKE DRONE____");
		super.displayDroneSpecs();
		System.out.println("Fuselage: ");
		System.out.println(this.getFuselage().showSpecs());
		System.out.println("Wings: ");
		System.out.println(this.getWings().showSpecs());
		System.out.println("Engine: ");
		System.out.println(this.getEngine().showSpecs());
	}
}
