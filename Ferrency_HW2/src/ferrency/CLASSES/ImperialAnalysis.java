package ferrency.CLASSES;

import java.text.DecimalFormat;

public class ImperialAnalysis {
	static DecimalFormat df = new DecimalFormat("#0.00");

	// convert from string to double
	public static double convertToDouble(String s) {
		double d = Double.parseDouble(s);
		return d;
	}

	// calculate fighter kill points
	public static double fighterKillPoints(double kills) {
		double points = kills * 1.75;
		return points;
	}

	// calculate bomber kill points
	public static double bomberKillPoints(double kills) {
		double points = kills * 1.5;
		return points;
	}

	// calculate assault fighter kill points
	public static double assaultFighterPoints(double kills) {
		double points = kills * 1.25;
		return points;
	}

	// calculate the ratio of kills to missions
	public static double missionsKillsRatio(int kills, int missions) {
		double ratio = (double) kills / (double) missions;
		return ratio;
	}

	// calculate the pilot's "value"
	public static String pilotValue(double mkRatio, double[] killPoints) {
		double product = 0;
		for (double i : killPoints) {
			product += i;
		}
		product *= mkRatio;
		return Double.toString(product);
	}

	// return the fighter's rating
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
		// Header
		System.out.println("___________Imperial Tie Fighter Pilot Status Report___________");
		System.out.println(
				"                                           *****************KILLS****************************");
		System.out.println(String.format("%-8s %-16s %-16s %-16s %-16s %16s", "Pilot", "Call Sign", "Missions",
				"Fighter", "Bomber", "Assault Fighter"));
		for (String[] array : data) {
			double[] killPoints = new double[3];
			killPoints[0] = fighterKillPoints(convertToDouble(array[2]));
			killPoints[1] = bomberKillPoints(convertToDouble(array[3]));
			killPoints[2] = assaultFighterPoints(convertToDouble(array[4]));
			double killSum = killPoints[0] + killPoints[1] + killPoints[2];
			// Mission and Kill values
			System.out.println(String.format("%-8s %-16s %-16s %-16s %-2s %16s", array[0].substring(0, 4),
					array[0].substring(5), array[1], array[2], array[3], array[4]));
			// Mission Kill Ratio
			System.out
					.println(
							"                          Mission Kill Ratio: "
									+ df.format(missionsKillsRatio(
											((int) convertToDouble(array[2]) + (int) convertToDouble(array[3])
													+ (int) convertToDouble(array[4])),
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
			double pv = convertToDouble(pilotValue(missionsKillsRatio(((int) convertToDouble(array[2]) + (int) convertToDouble(array[3])
					+ (int) convertToDouble(array[4])), (int) convertToDouble(array[1])), killPoints));
			System.out.println("                          Pilot Value: " + df.format(pv));
			// Pilot Rating
			System.out.println("                          Pilot Rating: " + pilotRating(pv));
			System.out.println();
		}
	}
}
