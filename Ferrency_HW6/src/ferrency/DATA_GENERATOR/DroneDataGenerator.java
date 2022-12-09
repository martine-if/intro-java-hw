package ferrency.DATA_GENERATOR;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DroneDataGenerator {
	String genName;
	String storeDirectory;
	String storeFile;

	public DroneDataGenerator(String genName, String storeDirectory, String storeFile) {
		this.genName = genName;
		this.storeDirectory = storeDirectory;
		this.storeFile = storeFile;
	}

	/*
	 * Assault Drone,Drone ID:,AD-1,Assault Code:,AS-897,ADV:,A091 Strike
	 * Drone,Drone ID:,SD-1,Strike Code:,SS-597,SDV:,S092 Recon Drone,Drone
	 * ID:,RD-1,Recon Code:,RS-497,RDV:,R093
	 */
	public String generateAssaultDroneString(int sn, int code, int value) {
		String str = "Assault Drone,Drone ID:,AD-" + sn + ",Assault Code:,AS-" + code + ",ADV:,A0" + value;
		return str;
	}

	public String generateStrikeDroneString(int sn, int code, int value) {
		String str = "Strike Drone,Drone ID:,SD-" + sn + ",Strike Code:,SS-" + code + ",SDV:,S0" + value;
		return str;
	}

	public String generateReconDroneString(int sn, int code, int value) {
		String str = "Recon Drone,Drone ID:,RD-" + sn + ",Recon Code:,RS-" + code + ",RDV:,R0" + value;
		return str;
	}

	public void generateDroneData(int count) throws IOException {
	    BufferedWriter writer = new BufferedWriter(new FileWriter(storeDirectory+storeFile, false));

		for(int i=0;i<count;i++) {
		    writer.append(generateAssaultDroneString(i+1,(int)(Math.random()*1000),(int)(Math.random()*1000)));
		    writer.newLine();
		    writer.append(generateStrikeDroneString(i+1,(int)(Math.random()*1000),(int)(Math.random()*1000)));
		    writer.newLine();
		    writer.append(generateReconDroneString(i+1,(int)(Math.random()*1000),(int)(Math.random()*1000)));
		    writer.newLine();
		    
		}
		writer.close();
	}

}
