package basicClasses;
import basicClasses.Vehicle;

import java.util.Scanner;

import basicClasses.Car;

public class Outlander extends Car {
	
	int roadServiceMonth;
	
	
public Outlander(String name,String bodyType,int cv,int cd,int wh,int door,int gears,
		boolean isManual,int cg,int rsm) 
{
	super(name,bodyType,cv,cd,wh,door,gears,isManual,cg);
	this.roadServiceMonth=rsm;
}


public int getRoadServiceMonth() 
{
	return roadServiceMonth;
}


public void setRoadServiceMonth(int roadServiceMonth) 
{
	if(roadServiceMonth<0) 
	{
		System.out.println("invalid number");
	}else 
	{
	this.roadServiceMonth = roadServiceMonth;
	System.out.println("road service per months is: "+roadServiceMonth);
	}
}


public void Accelerate(int speed) 
{
	int gear;
	//Scanner scan=new Scanner(System.in);
	/*
	 * System.out.println("please enter the speed :"); int speed=scan.nextInt();
	 */
    if(speed>=1 && speed<=20)
	{
		gear=1;
		System.out.println("gear position is " +gear);
	}else if(speed>=21 && speed<=30)
	{
		gear=2;
		System.out.println("gear position is " +gear);
	}else if(speed>=31 && speed<=50)
	{
		gear=3;
		System.out.println("gear position is " +gear);
	}else if(speed>50)
	{
		gear=4;
		System.out.println("gear position is " +gear);
	}
	
	//scan.close();
}

}

