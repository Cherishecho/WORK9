package work9;
import java.util.Scanner;
public class NumberFormatExceprion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			String hex = input.nextLine();
			System.out.println(hexToDec(hex));
		} 
		catch (NumberFormatException ex){
			System.out.println(ex);
		}
	}

public static String hexToDec(String hex) throws NumberFormatException {
	int data = Integer.parseInt(hex, 16);
	return Integer.toString(data, 10);
}
}
