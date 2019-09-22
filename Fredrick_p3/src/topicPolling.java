import java.util.Scanner;

public class topicPolling {
	public static void main(String[] args) {
		String topics[] = new String[]{"Global Warming","Possible Invasion of US by Chinese Forces","The Economy","Possible Invasion of US by Alien Forces","Dogs"};
		int responses[][] = new int[5][10];
		int scoreCount[] = new int[5];
		int pointCount[] = new int[5];
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int rating;
			System.out.println("Please enter a rating of importance for each topic on a scale from 1 (least important) to 10 (most important).");
			System.out.println();
			for(int i = 0; i<topics.length;i++) {
				System.out.print(topics[i] + ": ");
				rating = scan.nextInt();
				responses[i][rating-1]++;
				pointCount[i] += rating; 
				scoreCount[i]++;
			}
			System.out.println();
			String userInput;
			scan.nextLine();
			System.out.print("Rate again? Y/N: ");
			userInput = scan.nextLine();
			if(userInput.equals("Y")) {
				System.out.println("Continuing..");
				System.out.println();
			}
			else if(userInput.equals("N")) {
				break;
			}
		}
        
		System.out.printf("%s%3d%3d%3d%3d%3d%3d%3d%3d%3d%3d%8s\n","                                   Rating", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "| Average");
		System.out.println("                                   =============================================");
		for(int i = 0; i<topics.length; i++) {
			int averageSum = 0;
			int average = 0;
			System.out.printf("%41s",topics[i]);
			for(int j = 0; j<10;j++) {
				averageSum += (j+1) * responses[i][j];
				System.out.printf("%3d",responses[i][j]);
			}
			average = averageSum / scoreCount[i];
			System.out.printf("%9d", average);
			System.out.println();
		}
		int high = 0, low = 0, highIndex = 0, lowIndex = 0;
		for(int i = 0; i<pointCount.length; i++) {
			if(i == 0) {
				high = pointCount[i];
				low = pointCount[i];
			}
			else if(pointCount[i] > high) {
				high = pointCount[i];
				highIndex = i;
			}
			else if(pointCount[i] < low) {
				low = pointCount[i];
				lowIndex = i;
			}
		}
		
		System.out.println("\"" + topics[highIndex]+ "\" had the highest point total at " + high);
		System.out.println("\"" + topics[lowIndex]+ "\" had the lowest point total at " + low);
	}
}
