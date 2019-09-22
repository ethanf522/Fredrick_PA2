import java.util.Scanner;

public class integerDecryption {
	public static void main(String[] args) {
		int userInt;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the encrypted 4-digit integer: ");
		userInt = scan.nextInt();
		System.out.println();
		decrypt(userInt);
	}
	
	static void decrypt(int userInt) {
		int manipulatedInt = userInt, digit1, digit2, digit3, digit4;
		digit4 = manipulatedInt % 10;
		manipulatedInt = manipulatedInt / 10;
		digit3 = manipulatedInt % 10;
		manipulatedInt = manipulatedInt / 10;
		digit2 = manipulatedInt % 10;
		manipulatedInt = manipulatedInt / 10;
		digit1 = manipulatedInt % 10;
		digit1 = ((digit1 + 10) - 7) % 10;
		digit2 = ((digit2 + 10) - 7) % 10;
		digit3 = ((digit3 + 10) - 7) % 10;
		digit4 = ((digit4 + 10) - 7) % 10;
		System.out.print("Decrypted Integer: ");
		System.out.printf("%d%d%d%d", digit3, digit4, digit1, digit2);
	}
}
