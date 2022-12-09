package ferrency.CLASSES;

import java.io.Serializable;

import ferrency.ENUMS.*;
import ferrency.INTERFACES.DroneOperations;

public abstract class ImperialDrone implements Serializable, DroneOperations{

	private static final long serialVersionUID = 1L;
	public String DroneID;
	public String DroneType;
	public Fuselage fuselage;
	public Wing wings;
	public Engine engine;
	
	public ImperialDrone(String droneID, String droneType) {
		this.DroneID = droneID;
		this.DroneType = droneType;
	}
	
	public String getDroneID() {
		return DroneID;
	}

	public void setDroneID(String droneID) {
		DroneID = droneID;
	}

	public String getDroneType() {
		return DroneType;
	}

	public void setDroneType(String droneType) {
		DroneType = droneType;
	}

	public Fuselage getFuselage() {
		return fuselage;
	}

	public void setFuselage(Fuselage fuselage) {
		this.fuselage = fuselage;
	}

	public Wing getWings() {
		return wings;
	}

	public void setWings(Wing wings) {
		this.wings = wings;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void displayDroneSpecs() {
		System.out.println("droneID: " + DroneID);
		System.out.println("Drone Type: " + DroneType);
	}
}
