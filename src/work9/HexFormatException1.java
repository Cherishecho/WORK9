package work9;
import java.util.Scanner;
class HexFormatException extends Exception{
    HexFormatException(String str){
        super(str);
    }
}
public class HexFormatException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String hex = input.nextLine();
		hexToDec(hex);
	}
	public static void hexToDec(String hex){
        int num = 0;
        try{
            for(int i = 0;i < hex.length(); ++i){
                char Char = hex.charAt(i);
                if(Char >= '0' && Char <= '9'){
                    num = num * 16 + Char - '0';
                }
                else if( Char >= 'A' && Char <= 'F'){
                    num = num * 16 + Char - 'A' + 10;
                }
                else{
                    throw new HexFormatException("It is false!");
                }
            }
            System.out.println(num);
        }
        catch (Exception e){
            System.out.println("HexFormatException");
        }
    }
}
