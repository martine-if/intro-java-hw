package ferrency.INTERFACES;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.TreeMap;

import ferrency.CLASSES.AssaultDrone;
import ferrency.CLASSES.ImperialDrone;
import ferrency.CLASSES.ReconDrone;
import ferrency.CLASSES.StrikeDrone;

public interface DroneOperations {
	public static final String dir = "C:\\Users\\marti\\git\\intro-java-hw\\Ferrency_HW6\\src\\ferrency\\STORAGE\\";
	public static final String dir2 = "C:\\Users\\marti\\git\\intro-java-hw\\Ferrency_HW6\\src\\ferrency\\DATA\\";

	default void storeDrone(String filename) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
			out.writeObject(this);
			out.flush();
			out.close();
		} catch (Exception e) {
			System.out.println("e");
		}
	}

	static ImperialDrone retrieveDrone(String filename) {
		ImperialDrone drone = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));
			drone = (ImperialDrone)in.readObject();
			in.close();
		} catch (Exception e) {
			System.out.println("e");
		}
		return drone;
	}

	static TreeMap<String, ImperialDrone> buildAllDrones(String filename) throws IOException {

		// for each line in file
		// read line
		// create drone with substring as ID
		// set other values with substring
		// add drone to TreeMap
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		TreeMap<String, ImperialDrone> drones = new TreeMap<>();
		String[] arr = new String[5];
		String line = reader.readLine();

		/*
		 * Assault Drone AD-1 AS-724 A0415 Strike Drone SD-1 SS-169 S0151 Recon Drone
		 * RD-1 RS-536 R0298
		 */
		AssaultDrone a;
		StrikeDrone s;
		ReconDrone r;
		while (line != null) {
			// Assault, Strike, Recon
			arr = line.split(" ");
			a = new AssaultDrone(arr[2]);
			a.setADV(arr[4]);
			a.setAssaultCode(arr[3]);
			drones.put(arr[2], a);
			line = reader.readLine();
			arr = line.split(" ");
			s = new StrikeDrone(arr[2]);
			s.setSDV(arr[4]);
			s.setStrikeCode(arr[3]);
			drones.put(arr[2], s);
			line = reader.readLine();
			arr = line.split(" ");
			r = new ReconDrone(arr[2]);
			r.setRDV(arr[4]);
			r.setReconCode(arr[3]);
			drones.put(arr[2], s);
			line = reader.readLine();
		}
		reader.close();
		return drones;
	}
}
