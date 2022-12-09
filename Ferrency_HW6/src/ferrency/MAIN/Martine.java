package ferrency.MAIN;

import java.io.IOException;

import ferrency.CLASSES.ImperialDrone;
import ferrency.DATA_GENERATOR.DroneDataGenerator;
import ferrency.FACILITY.DroneFactory;
import ferrency.FACILITY.DroneWharehouse;
import ferrency.FACILITY.ImperialDroneFacility;
import ferrency.INTERFACES.DroneOperations;

public class Martine {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		//build drone data generator
		DroneDataGenerator DG = new DroneDataGenerator("Ferrency_1",DroneOperations.dir2,"DroneData");
		//build drone factory
		DroneFactory DF = new DroneFactory("Ferrency_FAC",DroneOperations.dir2 + "DroneData",DroneOperations.dir2 + "CleanDroneData");
		//build drone warehouse
		DroneWharehouse DWH = new DroneWharehouse("Ferrency_WH",DroneOperations.dir + "DStore");
		
		//build imperial drone facility
		ImperialDroneFacility IDF = new ImperialDroneFacility("Ferrency_IDF",DF,DWH,DG);
		//build and store drones
		IDF.ProduceAndStoreDrones(100);
		ImperialDrone ID = DroneOperations.retrieveDrone(IDF.getFacilityWharehouse().getStoreFilePath());
		ID.displayDroneSpecs();
	}
	

}
