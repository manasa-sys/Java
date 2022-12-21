package test;



import basicClasses.Vehicle;
import basicClasses.Car;
import basicClasses.Outlander;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********vehicle 1***********");
		Vehicle v1=new Vehicle("kia","hatchback");
		v1.display();
		v1.setName("toyota");
		v1.getName();
		System.out.println(v1.getName());
		v1.setBodyType("sedan");
		v1.getBodyType();
		System.out.println(v1.getBodyType());

		System.out.println("*******Steer method*********");
		v1.steer();
		System.out.println("*******Move method*********");
		v1.move(2, 40);
		System.out.println("*******stop method*********");
		v1.stop(20);
		
		System.out.println("*********car 1***********");
		Car c1=new Car("toyota","sudon",0,0,4,4,0,true,1);
		
		c1.setBodyType("SUV");
		System.out.println(c1.getBodyType());
		
		c1.setName("hyundai");
		System.out.println(c1.getName());
		
		c1.setWheels(8);
		System.out.println(c1.getWheels());
	
	
		c1.setDoor(-1);
		System.out.println(	c1.getDoor());
		
		c1.setGears(2);
		System.out.println(c1.getGears());
		
		c1.setCurrentGears(5);
		System.out.println(c1.getCurrentGears());
		

		c1.changeGear(2);
		c1.changeVelocity(2, 40);
		
		System.out.println("*********Oulander 1***********");
		
		Outlander o1=new Outlander("toyota","sudon",0,0,4,4,4,true,1,2);
		o1.Accelerate(15);
		o1.Accelerate(25);
		o1.Accelerate(45);
		o1.Accelerate(60);
		
		
	
		o1.setRoadServiceMonth(2);
		System.out.println(o1.getRoadServiceMonth());
		
		
		
		
		
		
	
	}

}
