package work9;
import java.util.Scanner;
class BinaryFormatException extends Exception{
	BinaryFormatException(String str){
        super(str);
    }
}
public class BinaryFormatException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String hex = input.nextLine();
		bin2Dec(hex);
	}
	public static void bin2Dec(String hex){
        int num = 0;
        try{
            for(int i = 0;i < hex.length(); ++i){
                char Char = hex.charAt(i);
                if(Char == '1' || Char == '0'){
                    num = num * 2 + Char - '0';
                }
                else{
                    throw new BinaryFormatException("It is false!");
                }
            }
            System.out.println(num);
        }
        catch (Exception e){
            System.out.println("BinaryFormatException");
        }
    }
}
