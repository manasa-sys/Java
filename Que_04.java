import java.util.Scanner;

public class Que_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("please enter the character: ");
		char val=scanner.next().charAt(0);
		
		
		if(val=='a' || val=='A'|| val=='e' ||val=='E'|| val=='i'|| val=='I' || 
				val=='o' ||val=='O'||  val=='u' || val=='U') {
			System.out.println("Entered character is a vowel");
		}
		else {
			System.out.println("Entered character is a consonant");
		}
		scanner.close();
		}
	
	}


