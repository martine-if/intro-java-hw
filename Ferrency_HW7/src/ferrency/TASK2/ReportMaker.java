package ferrency.TASK2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReportMaker {
		
	public static String[][] buildPlayerDataArray(String fn) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(fn));
		String line = reader.readLine();
		String[][] data = new String[15][4];
		String[] arr;
		int count=0;
		while (line != null) {
			int wins = 0;
			int losses = 0;
			int draws = 0;
			arr = line.split(" ");
			data[count][0] = arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i].equals("W")) {
					wins+=1;
				}else if(arr[i].equals("L")) {
					losses +=1;
				}else {
					if(arr[i].equals("T")) {
						draws += 1;
					}
				}
				
			}
			data[count][1] = Integer.toString(wins);
			data[count][2] = Integer.toString(losses);
			data[count][3] = Integer.toString(draws);
			line = reader.readLine();
			count++;
		}
		reader.close();
		return data;
	}
	
	public static void buildPlayerAnalysisReport(String fn) throws IOException{
		String[][] data = buildPlayerDataArray(fn);
		System.out.println("			GO Player vs. AI Analysis");
		System.out.println();	
		System.out.println("__________________PHASE ANALYSIS____________________");
		System.out.println("PHASE 1 Analysis			PHASE 2 Analysis			PHASE 3 Analysis");
		System.out.println("Player		Wins	Losses	Ties	Player		Wins	Losses	Ties	Player		Wins	Losses	Ties");
		for(int i=0;i<5;i++) {
			System.out.println(data[i][0] + "		" + data[i][1] + "	" + data[i][2] + "	" + data[i][3] + "	" + data[i+5][0] + "		" + data[i+5][1] + "	" + data[i+5][2] + "	" + data[i+5][3] + "	" + data[i+10][0] + "		" + data[i+10][1] + "	" + data[i+10][2] + "	" + data[i+10][3]);
		}
		System.out.println("__________________AGGREGATE PERFORMANCE_____________");
		System.out.println("PLAYER		WINS	LOSSES	TIES");
		System.out.println("ALPHA PLAYER:	" + (Integer.parseInt(data[0][1])+Integer.parseInt(data[5][1])+Integer.parseInt(data[10][1])) + "	" +(Integer.parseInt(data[0][2])+Integer.parseInt(data[5][2])+Integer.parseInt(data[10][2])) + "	" + (Integer.parseInt(data[0][3])+Integer.parseInt(data[5][3])+Integer.parseInt(data[10][3])));
		System.out.println("BETA PLAYER:	" + (Integer.parseInt(data[1][1])+Integer.parseInt(data[6][1])+Integer.parseInt(data[11][1])) + "	" +(Integer.parseInt(data[1][2])+Integer.parseInt(data[6][2])+Integer.parseInt(data[11][2])) + "	" + (Integer.parseInt(data[1][3])+Integer.parseInt(data[6][3])+Integer.parseInt(data[11][3])));
		System.out.println("GAMMA PLAYER:	" + (Integer.parseInt(data[2][1])+Integer.parseInt(data[7][1])+Integer.parseInt(data[12][1])) + "	" +(Integer.parseInt(data[2][2])+Integer.parseInt(data[7][2])+Integer.parseInt(data[12][2])) + "	" + (Integer.parseInt(data[2][3])+Integer.parseInt(data[7][3])+Integer.parseInt(data[12][3])));
		System.out.println("DELTA PLAYER:	" + (Integer.parseInt(data[3][1])+Integer.parseInt(data[8][1])+Integer.parseInt(data[13][1])) + "	" +(Integer.parseInt(data[3][2])+Integer.parseInt(data[8][2])+Integer.parseInt(data[13][2])) + "	" + (Integer.parseInt(data[3][3])+Integer.parseInt(data[8][3])+Integer.parseInt(data[13][3])));
		System.out.println("AI PLAYER:	" + (Integer.parseInt(data[4][1])+Integer.parseInt(data[9][1])+Integer.parseInt(data[14][1])) + "	" +(Integer.parseInt(data[4][2])+Integer.parseInt(data[9][2])+Integer.parseInt(data[14][2])) + "	" + (Integer.parseInt(data[4][3])+Integer.parseInt(data[9][3])+Integer.parseInt(data[14][3])));
		System.out.println("______________________________Report Prepared By Martine Ferrency	");
		System.out.println();
	}
	
	
	
	
	
	
	
	
}
