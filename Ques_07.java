import java.util.Scanner;

public class Ques_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the grade : ");
		char grade=scanner.next().charAt(0);
		
		if(grade=='a' || grade=='A') {
			System.out.println("The student has got marks between 90 -100 out of 100");
		}
		if(grade=='b' || grade=='B') {
			System.out.println("The student has got marks between 80 -89 out of 100");
		}
		if(grade=='c' || grade=='C') {
			System.out.println("The student has got marks between 70 -79 out of 100");
		}
		if(grade=='d' || grade=='D') {
			System.out.println("The student has got marks between 60 -69 out of 100");
		}
		if(grade=='f' || grade=='F') {
			System.out.println("The student has got marks less than 60 out of 100 and failed the course");
		}

		
		scanner.close();
		
	}

}
