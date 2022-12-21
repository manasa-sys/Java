package basicClasses;

import java.util.Scanner;

public class Vehicle {
	
	protected String name;
	protected String bodyType;
	protected int currentVelocity=0;
	protected int currentDirection=0;
	static Scanner scan=new Scanner(System.in);
	
	public Vehicle(String n,String bT) 
	{
		name=n;
		bodyType=bT;
		currentVelocity=0;
		currentDirection=0;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bT) {
		this.bodyType = bT;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public void setCurrentVelocity(int cV) {
		currentVelocity = cV;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(int cD) {
		currentDirection = cD;
	}
	
	public void display() {
		System.out.println("this vehicle has name:"+name+" bodytype:"+bodyType+" "
				+ "current direction: "+
	currentDirection+" currentVelocity: "+currentVelocity);
		
	}
	
	public void steer() {
		//cd=0=north cd=1=east cd=2=south cd=3=west
		
		
		
		System.out.println("please enter the diection :");
		int cd=scan.nextInt();
		
		 if(cd==0)
		 {
		
			System.out.println("current direction is north" );
		}
		 else if(cd==1) {
			System.out.println("current direction is east ");
		}else if(cd==2) {
			System.out.println("current direction is south ");
		}else if(cd==3) {
			System.out.println("current direction is west");
		}else if(cd<0 || cd>3) {
			System.out.println("invalid direction");
		}
		scan.close();
	}
	
//	public void steer(int cd) {
//		//cd=1=north cd=2=east cd=3=south cd=4=west
//		this.currentDirection = cd;
//		
//	}
	
	public void move(int cd,int cv)
	{
		if(cd==0 && cv==0) {
			System.out.println("not valid direction or velocity...");
		}else {
			this.currentDirection=cd;
			this.currentVelocity=cv;
			
			System.out.println("current direction is: "+cd+" current Velocity is: "
					+ " "+ cv);
		}
	}
	
	public void stop(int cv) {
		
		if(cv>0) {
			System.out.println("velocity is not zero and vehicle is moving");
			
		}else if(cv==0) {
			System.out.println("velocity is zero break is applied....");
		}
		
	}

}
