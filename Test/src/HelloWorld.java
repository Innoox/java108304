import java.util.Scanner;

public class HelloWorld {
	
	Scanner scan = new Scanner(System.in);
	
	public static void main(String []args) {
		String hello = "Hello wordl!";
		
		System.out.println(hello);
		
		System.out.println("Napis "+hello+", ma "+hello.length()+" znakow.");
		
	}
}
