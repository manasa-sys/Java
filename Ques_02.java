import java.util.Scanner;

public class Ques_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("please enter a number");
		int number=scanner.nextInt();
		int reverse=0;
		int remainder;
		while(number!=0) {
		remainder=number%10;
		reverse=reverse*10+remainder;
		number=number/10;
		}
		System.out.println("the reversed number is "+ reverse);
		
		scanner.close();
		

	}

}
