package ferrency.CLASSES;

import java.text.DecimalFormat;

public class ImperialAnalysis {
	static DecimalFormat df = new DecimalFormat("#0.00");

	public static double convertToDouble(String s) {
		// ASK ABOUT CONVERT METHOD
		double d = Double.parseDouble(s);
		return d;
	}

	public static double fighterKillPoints(double kills) {
		double points = kills * 1.75;
		return points;
	}

	public static double bomberKillPoints(double kills) {
		double points = kills * 1.5;
		return points;
	}

	public static double assaultFighterPoints(double kills) {
		double points = kills * 1.25;
		return points;
	}

	// ASK ABOUT INPUTS
	public static double missionsKillsRatio(double kills, double missions) {
		double ratio = kills / missions;
		return ratio;
	}

	public static String pilotValue(double mkRatio, double[] killPoints) {
		String product = "";
		//
		return product;
	}

	public static String pilotRating(double pv) {
		String rating = "";
		// greater than 20 Rating is 'Elite’
		// greater than 12 and less than or equal to 20 Rating is ‘Veteran’
		// less than or equal to 12 Rating is ‘Standard’
		if (pv > 20) {
			rating = "Elite";
		} else if (pv > 12) {
			rating = "Veteran";
		} else {
			rating = "Standard";
		}
		return rating;
	}

	public static void displayMissionData(String[][] data) {
		//Header
		System.out.println("___________Imperial Tie Fighter Pilot Status Report___________");
		System.out.println("                                           *****************KILLS****************************");
		System.out.println(String.format("%-8s %-16s %-16s %-16s %-16s %16s", "Pilot", "Call Sign", "Missions",
				"Fighter", "Bomber", "Assault Fighter"));
		for (String[] array : data) {
			// Mission and Kill values
			System.out.println(String.format("%-8s %-16s %-16s %-16s %-2s %16s", array[0].substring(0, 4),
					array[0].substring(5), array[1], array[2], array[3], array[4]));
			// Mission Kill Ratio
			System.out.println("                          Mission Kill Ratio: " + df.format(missionsKillsRatio(
					(convertToDouble(array[2]) + convertToDouble(array[3]) + convertToDouble(array[4])),
					(int) convertToDouble(array[1]))));
			// Kill Points
			System.out.println(
					"                          Fighter Kill Points: " + fighterKillPoints(convertToDouble(array[2]))
							+ " Bomber Kill Points: " + bomberKillPoints(convertToDouble(array[3]))
							+ " Assault Fighter Kill Points: " + assaultFighterPoints(convertToDouble(array[4])));
			// Total Kill Points
			System.out.println("                          Total Kill Points: "
					+ (fighterKillPoints(convertToDouble(array[2])) + bomberKillPoints(convertToDouble(array[3]))
							+ assaultFighterPoints(convertToDouble(array[4]))));
			// Pilot Value
			// System.out.println(" Pilot Value: " +
			// pilotValue(missionsKillsRatio((convertToDouble(array[2]) +
			// convertToDouble(array[3]) + convertToDouble(array[4])),(int)
			// convertToDouble(array[1])),//));
			// Pilot Rating
			// System.out.println(" Pilot Rating: " + pilotRating(pilotValue()));
			System.out.println();
		}
	}
}
