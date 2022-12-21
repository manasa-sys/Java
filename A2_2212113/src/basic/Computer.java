/***
 * Assignment2
 * Manasa Manohara Shetty
 * WrittenBY:Manasa Manohara Shetty
 * StudentId:2212113

 */
package basic;
import java.util.Scanner;

public class Computer
{
	protected String brand;
	protected String model;
	protected long SN;
	protected double price;
	private static int counter=0;
	
	Scanner scan=new Scanner(System.in);
	
public Computer(String br,String mod,long sn,double pr) 
{
	System.out.println("-----fully parameterised Constructor-----------");
	brand=br;
	model=mod;
	SN=sn;
	price=pr;
	counter++;
	
}

public Computer() 
{
	System.out.println("------default constructor------------");
	brand="HP";
	model="hp2314";
	SN=323455;
	price=1500;
	counter++;
}
public Computer(String brand) 
{
	System.out.println("-----partial parameterised Constructor-----------");
	brand=brand;
	model="";
	SN=0;
	price=1000;	
	counter++;
}

public Computer(String brand,String model) 
{
	System.out.println("-----partial parameterised Constructor-----------");
	brand=brand;
	model=model;
	SN=0;
	price=1000;	
	counter++;
}

public Computer(String brand,String model,long SN) 
{
	System.out.println("-----partial parameterised Constructor-----------");
	brand=brand;
	model=model;
	SN=SN;
	price=1000;	
	counter++;
}

public Computer(Computer  comp) 
{
	System.out.println("****computer copy constructor*********");
	brand=comp.brand;
	model=comp.model;
	SN=comp.SN;
	price=comp.price;
	
}



//accessors and mutators(getters and setters)
public String getbrand()
{
	return brand;
}
public String setbrand() 
{
	
	System.out.println("please enter the brand: ");
	String brand=scan.next();
	System.out.println("The brand is"+ brand);
	return brand;
}
public String getmodel() {
	return model;
}
public String setmodel() {
	
	System.out.println("please enter the model: ");
	String model=scan.next();
	System.out.println("The model is "+ model);
	return model;
	
}
public long getSN() 
{
	return SN;
}
public long setSN() 
{
	System.out.println("please enter the Serial number: ");
	long SN=scan.nextLong();
	if(SN>1000000000) {
		System.out.println("invalid SN");
	}else {
		System.out.println("The serial number is "+SN);
	}
	return SN;
}
public double getprice() 
{
	return price;
}
public double  setprice()

{
	System.out.println("please enter the price: ");
	double pr=scan.nextDouble();
	
	if(price>100)
	price=pr;
	else 
	{
		System.out.println("The price $"+price+"is not valid price");
	}
	return pr;
}
public void tostring() {
	System.out.println("The details of the computer you selected are:"+"\n"
			+ "brand: "+brand+"\n"
			+ "model:"+ model+"\n"
			+ "SN: "+ SN+"\n"
			+ "price: "+ price);
}
public static void noofObjects() 
{
	if(counter==0)
	{
		System.out.println("No computers are created....");
		
	}
	System.out.println("The number of created computers are"+ counter);
}


}

