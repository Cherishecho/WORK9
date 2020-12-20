package work9;
import java.util.Scanner;
class OutOfMemoryError extends Exception{
	OutOfMemoryError(String str){
        super(str);
    }
}
public class OutOfMemoryError1 {

	public static void main(String[] args) {
		
		 try {
             System.out.println("Input an integer");
             Scanner input = new Scanner(System.in);
             int len = input.nextInt();
             int largArray[] = new int[len];
             

         } 
		 catch (Exception e) {
           System.out.println("OutOfMemoryError");
         }   
    }
}
