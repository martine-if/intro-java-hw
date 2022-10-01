package ferrency.CLASSES;

public class ImperialAnalysis {
	public static double convertToDouble(String s) {
		double d = 0;
		//
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

	public static double missionsKillsRatio(int kills, int missions) {
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
		//greater than 20 Rating is 'Elite’
		//greater than 12 and less than or equal to 20 Rating is ‘Veteran’
		//less than or equal to 12 Rating is ‘Standard’
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

	}
}
