import java.util.Scanner;

public class BMICalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double weight, height, bmi = 0;
		
		String userInput;
		System.out.print("Calculate BMI in imperial or metric? Enter 'I' or 'M': ");
		
		userInput = scan.nextLine();
		userInput = userInput.toUpperCase();
		
		if(userInput.equals("I")) {
			System.out.print("Enter your weight in pounds: ");
			weight = scan.nextDouble();
			
			System.out.print("Enter your height in inches: ");
			height = scan.nextDouble();
			
			weight *= 703.0;
			bmi = calcBMI(weight, height);
		}
		
		else if(userInput.equals("M")) {
			System.out.print("Enter your weight in kilograms: ");
			weight = scan.nextDouble();
			
			System.out.print("Enter your height in meters: ");
			height = scan.nextDouble();
			
			bmi = calcBMI(weight, height);
		}
		
		else {
			System.out.println("Enter 'I' or 'M' for correct calculation.");
		}
		
		System.out.println();
		System.out.println("Here are the BMI Categories from the National Heart Lung and Blood Institute: ");
		System.out.println("Underweight: <18.5");
		System.out.println("Average weight: 18.5-24.9");
		System.out.println("Overweight: 25.0-29.9");
		System.out.println("Obesity: >30.0");
		System.out.println();
		System.out.printf("Your BMI is %.2f\n", bmi);
	}
	
	static double calcBMI(double weight, double height) {
		return weight/Math.pow(height, 2);
	}

}
		
	
