package basicClasses;
import java.util.Scanner;

import basicClasses.Vehicle;

public class Car extends Vehicle{
	int wheels;
	int door;
	int gears;
	Boolean isManual;
	int currentGears=1;
	static Scanner scan=new Scanner(System.in);
public Car(String name,String bodyType,int cv,int cd,int wh,int door,int gears,
		boolean isManual,int cg)
{
	super(name,bodyType);
	this.wheels=wh;
	this.door=door;
	this.gears=gears;
	isManual=true;
	this.currentGears=cg;
	


}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		if(door<0) {
			System.out.println("inavlid number of doors");
		}else {
			
			this.door = door;
			System.out.println("number of doors is "+door);
		}
		
	}
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		if(gears<0) {
			System.out.println("invalid number of gears");
		}else {
		
		this.gears = gears;
		System.out.println("number of gears"+gears);
		}
	}
	public Boolean getIsManual() {
		return isManual;
	}
	public void setIsManual(Boolean isManual) {
		this.isManual = isManual;
	}
	public int getCurrentGears() {
		return currentGears;
	}
	public void setCurrentGears(int currentGears) {
		this.currentGears = currentGears;
	}
	
	public void changeGear(int currentGear) 
	{
		this.currentGears=currentGear;
		System.out.println("The current gear is "+currentGear);
	}
	
	public void changeVelocity(int cD,int cV)
	{
		this.currentDirection=cD;
		this.currentVelocity=cV;
		System.out.println("the current direction is "+cD +"the current velocity is: "
				+ cV);
	}
	

}
