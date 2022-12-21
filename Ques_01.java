import java.util.Scanner;

public class Ques_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to find the biggest of the three numbers
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int num1=scanner.nextInt();
		System.out.println("Please enter the second number: ");
		int num2=scanner.nextInt();
		System.out.println("please enter the third number: ");
		int num3=scanner.nextInt();
		int temp;
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+ " is greater than "+ num2+" and "+ num3);
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2+ " is greater than "+ num1+" and "+ num3);
		}else {
			System.out.println(num3+ " is greater than "+ num1+" and "+ num2);
		}
		
		//to sort the array
		System.out.println("........Sorting in ascending order..............");
		
		
		if(num1<=num2 && num2<=num3)
		{
			System.out.printf("sorted numbers are"+" "+num1+" "+num2+" "+num3);
		}
		else if(num1<=num3 && num3<=num2)
		{
				System.out.println("sorted numbers are"+" "+num1+" "+num3+" "+num2);	
		}
		else if(num2<=num1 && num1<=num3 )
		{
			System.out.println("sorted numbers are"+" "+num2+" "+num1+" "+num3);
		}else if(num2<=num3 && num3<=num1) 
		{
			System.out.println("sorted numbers are"+" "+num2+" "+num3+" "+num1);
		}else if (num3<=num1 && num1<=num2)
		{
			System.out.println("sorted numbers are"+" "+num3+" "+num1+" "+num2);
		}else if(num3<=num2 && num2<=num1)
		{
			System.out.println("sorted numbers are"+" "+num3+" "+num2+" "+num1);
		}
		
		System.out.println();
		
		System.out.println("........Sorting in descending order..............");
		
		if(num1>=num2 && num2>=num3)
		{
			System.out.printf("sorted numbers are"+" "+num1+" "+num2+" "+num3);
		}
		else if(num1>=num3 && num3>=num2)
		{
				System.out.println("sorted numbers are"+" "+num1+" "+num3+" "+num2);	
		}
		else if(num2>=num1 && num1>=num3 )
		{
			System.out.println("sorted numbers are"+" "+num2+" "+num1+" "+num3);
		}else if(num2>=num3 && num3>=num1) 
		{
			System.out.println("sorted numbers are"+" "+num2+" "+num3+" "+num1);
		}else if (num3>=num1 && num1>=num2)
		{
			System.out.println("sorted numbers are"+" "+num3+" "+num1+" "+num2);
		}else if(num3>=num2 && num2>=num1)
		{
			System.out.println("sorted numbers are"+" "+num3+" "+num2+" "+num1);
		}
		
		
		
		scanner.close();
		

	}

}
