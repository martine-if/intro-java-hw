package ferrency.FACILITY;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

import ferrency.CLASSES.ImperialDrone;
import ferrency.INTERFACES.DroneOperations;

public class DroneFactory implements DroneOperations{
	public String facName;
	public String dataFilePath;
	public String cleanDataFile;

	public DroneFactory(String facName, String dataFilePath, String cleanDataFile) {
		this.facName = facName;
		this.dataFilePath = dataFilePath;
		this.cleanDataFile = cleanDataFile;
	}

	public void cleanDataFile() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(dataFilePath));
		BufferedWriter writer = new BufferedWriter(new FileWriter(cleanDataFile, false));
		
		/*Assault Drone,Drone ID:,AD-1,Assault Code:,AS-29,ADV:,A0534
		Strike Drone,Drone ID:,SD-1,Strike Code:,SS-806,SDV:,S0724
		Recon Drone,Drone ID:,RD-1,Recon Code:,RS-668,RDV:,R0574*/
		String line = reader.readLine();
		String[] arr = new String[7];
		while (line != null) {
			arr = line.split(",");
			line = String.join(" ", arr[0],arr[2],arr[4],arr[6]);
			writer.append(line);
			writer.newLine();
			line = reader.readLine();
		}
		reader.close();
		writer.close();
	}

	public TreeMap<String, ImperialDrone> manufactureDrones() throws IOException {
		TreeMap<String, ImperialDrone> drones = DroneOperations.buildAllDrones(this.getCleanDataFile());
		return drones;
	}

	public String getFacName() {
		return facName;
	}

	public void setFacName(String facName) {
		this.facName = facName;
	}

	public String getDataFilePath() {
		return dataFilePath;
	}

	public void setDataFilePath(String dataFilePath) {
		this.dataFilePath = dataFilePath;
	}

	public String getCleanDataFile() {
		return cleanDataFile;
	}

	public void setCleanDataFile(String cleanDataFile) {
		this.cleanDataFile = cleanDataFile;
	}
	
	
	
}
