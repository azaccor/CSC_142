import java.util.*;
import java.io.*;

public class Geiger {
	//Data Members
	
	public static void main(String[] args) {
			File file = new File(("4_22_18.txt"));
		
		try {
				Scanner scanner = new Scanner(file);
				
				//Loop through the observations in data set
				int maxCount = 0;
		
				while(scanner.hasNextLine()) {
				String currentLine = scanner.nextLine();
				int startIndex = currentLine.length() - 3;
				int endIndex = currentLine.length()-1;
					if(currentLine.substring(startIndex, startIndex + 1).equals(",")) {
						startIndex = startIndex + 1;
					}
					String currentCount = currentLine.substring(startIndex, endIndex);
					int currentNum = Integer.parseInt(currentCount);
						if(currentNum > maxCount) {
							maxCount = currentNum;
						}
					//System.out.println(currentLine.substring(startIndex, endIndex));
				}
				scanner.close();
				
				int lower = maxCount - 5;
				
				Scanner scanner2 = new Scanner(file);
				while(scanner2.hasNextLine()) {
					String currentLine = scanner2.nextLine();
					int startIndex = currentLine.length() - 3;
					int endIndex = currentLine.length()-1;
						if(currentLine.substring(startIndex, startIndex + 1).equals(",")) {
							startIndex = startIndex + 1;
						}
						String currentCount = currentLine.substring(startIndex, endIndex);
						int currentNum = Integer.parseInt(currentCount);
						
						if(currentNum >= lower) {
							System.out.println(currentLine);
						}
				}
				scanner2.close();	
				
				//Print out Histogram
				int rowCounter = 0;
				Scanner scanner3 = new Scanner(file);
				while(scanner3.hasNextLine()) {
					String currentLine = scanner3.nextLine();
					String dateTime = currentLine.substring(0, 15);
					int startIndex = currentLine.length() - 3;
					int endIndex = currentLine.length()-1;
						if(currentLine.substring(startIndex, startIndex + 1).equals(",")) {
							startIndex = startIndex + 1;
						}
						String currentCount = currentLine.substring(startIndex, endIndex);
						int currentNum = Integer.parseInt(currentCount);
					rowCounter++;
					if(rowCounter % 10 == 0) {
						System.out.print(dateTime + "|");
					} else {
						System.out.print("               |");
					}
					for(int i = 0; i<currentNum; i++) {
						System.out.print("**");
					}
					System.out.println("");
				}
				
				scanner3.close();
				
				
			} catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
			}
		
		
		
	}
	
	
	
}
