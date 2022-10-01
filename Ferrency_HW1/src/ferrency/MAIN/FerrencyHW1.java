package ferrency.MAIN;

import java.text.DecimalFormat;

public class FerrencyHW1 {
	public static void main(String[] args) {
		// round decimals to the hundredth place
		DecimalFormat df = new DecimalFormat("##.00");

		// stormtrooper locations
		int[] st_x = { 1, 2, 1 };
		int[] st_y = { 5, 4, 3 };

		// checkpoint + rebel locations
		int[] cp_x = { 3, 4, 5, 7, 6, 9, 8, 11, 10 };
		int[] cp_y = { 1, 3, 5, 3, 1, 5, 1, 5, 1 };

		// stormtrooper distance and time arrays
		double[][] st_distance = new double[3][9];
		long[][] st_time = new long[3][9];

		// checkpoint distance and time arrays
		double[][] cp_distance = new double[9][9];
		long[][] cp_time = new long[9][9];

		String[] letters = { "A", "B", "C", "D", "E", "F", "G" };

		// distance and time calculations

		// d = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2))
		// t = 20 minutes * kilometers

		// for each stormtrooper
		for (int i = 0; i < st_x.length; i++) {
			// for each checkpoint
			for (int j = 0; j < cp_x.length; j++) {
				// calculate distance and time and store in array
				st_distance[i][j] = Math.sqrt(Math.pow((cp_x[j] - st_x[i]), 2) + Math.pow((cp_y[j] - st_y[i]), 2));
				st_time[i][j] = Math.round(20 * st_distance[i][j]);
			}
		}
		// for each checkpoint
		for (int i = 0; i < cp_x.length; i++) {
			// for each checkpoint
			for (int j = 0; j < cp_x.length; j++) {
				// calculate distance and time and store in array
				cp_distance[i][j] = Math.sqrt(Math.pow((cp_x[j] - cp_x[i]), 2) + Math.pow((cp_y[j] - cp_y[i]), 2));
				cp_time[i][j] = Math.round(20 * cp_distance[i][j]);
			}
		}

		// output
		// header
		String output = String.format("%-30s %-10s", "TEAM", "DIRECT 2D EUCLIDIAN DISTANCE AND TIME TO");
		System.out.println(output);
		// column labels
		output = String.format("%-8s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s %-12s", "", "CP A", "CP B", "CP C",
				"CP D", "CP E", "CP F", "CP G", "R1", "R2");
		System.out.println(output);

		// for each stormtrooper
		for (int i = 0; i < st_x.length; i++) {
			// print distances
			System.out.print("ST " + i + "     ");
			for (int j = 0; j < cp_x.length; j++) {
				System.out.print(String.format("%-13s", df.format(st_distance[i][j]) + " km"));

			}
			System.out.println();
			// print times
			System.out.print("         ");
			for (int j = 0; j < cp_x.length; j++) {
				System.out.print(String.format("%-13s", st_time[i][j] + " mins"));
			}
			System.out.println();
			System.out.println();
		}

		// header
		output = String.format("%-30s %-10s", "CHECKPOINT", "DIRECT 2D EUCLIDIAN DISTANCE AND TIME TO");
		System.out.println(output);
		// column labels
		output = String.format("%-8s %-12s %-12s %-12s %-12s %-12s %-12s %-12s", "", "CP A", "CP B", "CP C", "CP D",
				"CP E", "CP F", "CP G");
		System.out.println(output);

		// for each checkpoint
		for (int i = 0; i < cp_x.length - 2; i++) {
			// print distances
			System.out.print("CP " + letters[i] + "     ");
			for (int j = 0; j < cp_x.length - 2; j++) {
				// if statement to standardize the 0.00 formatting, otherwise prints as ".00"
				if (cp_distance[i][j] == 0) {
					System.out.print(String.format("%-13s", "0.00 km"));
				} else
					System.out.print(String.format("%-13s", df.format(cp_distance[i][j]) + " km"));

			}
			System.out.println();
			// print times
			System.out.print("         ");
			for (int j = 0; j < cp_x.length - 2; j++) {
				System.out.print(String.format("%-13s", cp_time[i][j] + " mins"));
			}
			System.out.println();
			System.out.println();
		}

		// header
		System.out.println(String.format("%-8s %-22s %-22s %-20s", "TEAM", "ROUTE", "TOTAL DISTANCE", "TOTAL TIME"));
		// calculate and print route for st1
		System.out.println(String.format("%-8s %-22s %-22s %-20s", "ST1", "C to D to F to R1",
				df.format(st_distance[0][2] + cp_distance[2][3] + cp_distance[3][5] + cp_distance[5][7]) + " km",
				st_time[0][2] + cp_time[2][3] + cp_time[3][5] + cp_time[5][7] + " mins"));
		// calculate and print route for st2
		System.out.println(String.format("%-8s %-22s %-22s %-20s", "ST2", "B to E to G to R2",
				df.format(st_distance[1][1] + cp_distance[1][4] + cp_distance[4][6] + cp_distance[6][8]) + " km",
				st_time[1][1] + cp_time[1][4] + cp_time[4][6] + cp_time[6][8] + " mins"));
		// calculate and print route for st3
		System.out.println(String.format("%-8s %-22s %-22s %-20s", "ST3", "A to D to F to R1",
				df.format(st_distance[2][0] + cp_distance[0][3] + cp_distance[3][5] + cp_distance[5][7]) + " km",
				st_time[2][0] + cp_time[0][3] + cp_time[3][5] + cp_time[5][7] + " mins"));

	}
}
