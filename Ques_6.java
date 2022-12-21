import java.util.Scanner;

public class Ques_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the number: ");
		int number=scanner.nextInt();
		int years,weeks,days,remainder;
		years=number/365;
		System.out.println("Number of years is: "+ years);
		weeks=(number%365)/7;
		System.out.println("Number of weeks is: "+ weeks);
		days=(number%365)%7;
		System.out.println("Number of days is: "+ days);
		
	
		
		scanner.close();
	}

}
