package ferrency.FACILITY;

import java.io.IOException;

import ferrency.DATA_GENERATOR.DroneDataGenerator;

public class ImperialDroneFacility {
	public String facilityName;
	public DroneFactory facilityFactory;
	public DroneWharehouse facilityWharehouse;
	public DroneDataGenerator facilityGenerator;
	
	public ImperialDroneFacility(String facilityName, DroneFactory facilityFactory,
			DroneWharehouse facilityWharehouse, DroneDataGenerator facilityGenerator) {
		this.facilityName = facilityName;
		this.facilityFactory = facilityFactory;
		this.facilityWharehouse = facilityWharehouse;
		this.facilityGenerator = facilityGenerator;
	}
	
	public boolean ProduceAndStoreDrones(int count) throws IOException {
		this.getFacilityGenerator().generateDroneData(count);
		this.getFacilityFactory().cleanDataFile();
		this.getFacilityWharehouse().setStorageBin(this.getFacilityFactory().manufactureDrones());
		this.getFacilityWharehouse().persistStoreDrone();
		return true;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public DroneFactory getFacilityFactory() {
		return facilityFactory;
	}

	public void setFacilityFactory(DroneFactory facilityFactory) {
		this.facilityFactory = facilityFactory;
	}

	public DroneWharehouse getFacilityWharehouse() {
		return facilityWharehouse;
	}

	public void setFacilityWharehouse(DroneWharehouse facilityWharehouse) {
		this.facilityWharehouse = facilityWharehouse;
	}

	public DroneDataGenerator getFacilityGenerator() {
		return facilityGenerator;
	}

	public void setFacilityGenerator(DroneDataGenerator facilityGenerator) {
		this.facilityGenerator = facilityGenerator;
	}
	
	
}
