import java.util.Scanner;

public class Ques_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the decimal number: ");
		int num=scanner.nextInt();
		int index=0;
		int binary[]=new int[50];
		
		while(num!=0) 
		{
			binary[index]=num%2;
			num=num/2;
			index++;
		}
		
		for(int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		
		

		scanner.close();
		

	}

}
