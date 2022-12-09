package ferrency.FACILITY;

import java.util.TreeMap;

import ferrency.CLASSES.ImperialDrone;
import ferrency.INTERFACES.DroneOperations;

public class DroneWharehouse implements DroneOperations{
	public String whName;
	public String storeFilePath;
	public TreeMap<String,ImperialDrone> storageBin;
	
	public DroneWharehouse(String whName, String storeFilePath) {
		this.whName = whName;
		this.storeFilePath = storeFilePath;
	}

	public void persistStoreDrone() {
		for(int i=1;i<=(this.getStorageBin().size())/3;i++) {
			this.getStorageBin().get("AD-" + i).storeDrone(storeFilePath);
			this.getStorageBin().get("SD-" + i).storeDrone(storeFilePath);
			this.getStorageBin().get("RD-" + i).storeDrone(storeFilePath);
		}
	}
	
	
	public String getWhName() {
		return whName;
	}

	public void setWhName(String whName) {
		this.whName = whName;
	}

	public String getStoreFilePath() {
		return storeFilePath;
	}

	public void setStoreFilePath(String storeFilePath) {
		this.storeFilePath = storeFilePath;
	}

	public TreeMap<String, ImperialDrone> getStorageBin() {
		return storageBin;
	}

	public void setStorageBin(TreeMap<String, ImperialDrone> storageBin) {
		this.storageBin = storageBin;
	}
	
	
	
	
}
