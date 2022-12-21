/***
 * Assignment2

 */

package basic;

import java.util.Scanner;

import basic.Computer;

public class main 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("****Welcome to computer store****");
		System.out.println("////----------------------------------///");
		Scanner scan =new Scanner(System.in);
		
		System.out.println(" Hello Owner!!What is the maximum number of"
				+ " computers your store can have? ");
		int maxcomp=scan.nextInt();
		Computer[] inventory=new Computer[maxcomp];

		int choice;
		char ans;
		do {
		
			do{
				System.out.println("What you want to do??");
				mainmenu();
				System.out.println("Please enter your choice....");
				choice=scan.nextInt();
				if(choice<1 || choice>5) 
					{
					System.out.println(" Invalid input!! enter a valid choice ");
					}	
				}while(choice<1 || choice>5);
			
			
			switch(choice) 
			{
				case 1:
		
					do {
						String str="password";
						for(int nooftries=1;nooftries<=3;nooftries++)
						{
							
						 System.out.println("please enter your password");
						 String passwd=scan.next();
							if(!(passwd.equals(str)))
							{
							System.out.println("invalid password! please try again!!!");
								if(nooftries==3) 
								{
								System.out.println("You exeeced limit ");
								mainmenu();
//								System.out.println("Please enter your choice....");
//								choice=scan.nextInt();
								}
							}
							
						else
							{
							
							System.out.println("how many computers you want to enter?");
							int nocomputer=scan.nextInt();
							Computer[] comp1=new Computer[nocomputer];
							int remspace=maxcomp-nocomputer;
							int counter=0;
							if(remspace<0) {
								System.out.println("there is no space!!");
							}else {
								System.out.println("remianing number of spaces are "+remspace);
							}
							
							for(int i=0;i<comp1.length;i++) 
							{
								System.out.println("please enter the brand");
								String brand= scan.next();
								System.out.println("please enter the model");
								String model= scan.next();
								System.out.println("please enter the SN");
								long SN= scan.nextLong();
								System.out.println("please enter the price");
								double price=scan.nextDouble();		
								inventory[counter]=new Computer(brand,model,SN,price);
								counter++;
								
							
								
							}
						System.out.println("Displaying the computers.....");
							for(int i=0;i<comp1.length;i++) 
							{
								
								inventory[i].tostring();	
							}
							break;	
			}
						}
					
		}while(choice<1|| choice>5);
		break;
		
		case 2:
			char update ='y',yes;
			int answer;
				do {
					String str="password";
					for(int nooftries=1;nooftries<=3;nooftries++)
					{
								
						System.out.println("please enter your password");
						String passwd=scan.next();
						if(!(passwd.equals(str)))
							{
								System.out.println("invalid password! please try again!!!");
								if(nooftries==3) 
									{
									System.out.println("You exeeded limit ");
									mainmenu();
									
									}
								}	
							else
								{
								
								do {
									
									System.out.println("please enter the computernumber  you want to update ?");
									int compno=scan.nextInt();
									Computer[] newcomp=new Computer[10];
									int found=0;
							
									for(int i=0;i<inventory.length;i++)
									{
									if(inventory[i]==inventory[compno])
									{
										newcomp[found]=inventory[compno];
										
										for(int j=0;j<newcomp.length;j++) {
											
											if(newcomp[j]!=null) {
											System.out.println("Computer "+ j);

											newcomp[j].tostring();
										}
										
									}
										do {
											
											do {
												System.out.println("Which attribute would you like to change??");
												updatemenu();
												answer=scan.nextInt();
												if(answer<1 || answer>5)
												{
												System.out.println("Invalid choice please try again");
												}
												}while(answer<1 || answer >5);
										
									
											
									switch(answer)
									{
									case 1:
										String brand=inventory[i].setbrand();
										inventory[i].brand=brand;
										System.out.println("Updated computer information....");
										inventory[i].tostring();
										break;
									case 2:
										String model=inventory[i].setmodel();
										inventory[i].model=model;
										System.out.println("Updated computer information....");
										inventory[i].tostring();
										break;
									case 3:
										long SN=inventory[i].setSN();
										inventory[i].SN=SN;
										System.out.println("Updated computer information....");
										inventory[i].tostring();
										break;
									case 4:
										double price=inventory[i].setprice();
										inventory[i].price=price;
										System.out.println("Updated computer information....");
										inventory[i].tostring();
										break;
									case 5:
										System.out.println("please quit the program");
										System.exit(0);
										break;
									   
									}
										System.out.println("do you wish to change another attribute(Y/N): ");
										yes=scan.next().charAt(0);
										
									
										}while(yes=='y' || yes=='Y');
									
									}else {
										
										System.out.println("do you wish to update another computer(Y/N): ");
										update=scan.next().charAt(0);
										
											
										}
										
						
								}}while(update=='Y'|| update=='y');
								}
						}
								}while(choice<1|| choice>5);
				break;
						
			case 3:
				//findComputerBy();
				Computer [] strarray=new Computer[10];
				System.out.println("please enter the brand which you want to search");
				String str=scan.next();
				int index=0;
				for(int i=0;i<inventory.length;i++) 
				{
						if(inventory[i]!=null) {
						if(str.equals(inventory[i].brand)) 
					{
						 {
						strarray[index]=inventory[i];
						index++;
						}
					}}
							
				 else {
								System.out.println("brand not found");
							}
						}
							for(int j=0;j<strarray.length;j++) 
								if(strarray[j]!=null){
									{
										strarray[j].tostring();
									}
									
								}
							
						
						break;
					case 4:
						Computer[] comp=new Computer[10];
						System.out.println("please enter the price ");
						double Price=scan.nextDouble();
						int ind=0;
						for(int i=0;i<inventory.length;i++) 
						{
							if(inventory[i]!=null) {
								if(inventory[i].price<Price) 
								{
									
									comp[ind]=inventory[i];
									ind++;
									
								}
			
							}
							else 
							{
								System.out.println("the entered price not found");
							}
						}
							for(int j=0;j<comp.length;j++) 
							{
								if(comp[j]!=null) {	
							comp[j].tostring();
								}
							}
					break;
					
					case 5:
					System.out.println("Thank you!!!");
						System.exit(0);
					break;			
			}
		
			System.out.println("do you wish to perform another operation?(y/n): ");
			ans=scan.next().charAt(0);
			if(ans=='n'|| ans=='N')
			{
			System.exit(0);
			}
		
		}while(ans=='y' || ans=='Y');
	
	}
						
							
						
	static Scanner scan=new Scanner(System.in);	

//private static void findComputerBy() {
//		// TODO Auto-generated method stub
//	
//	Computer [] strarray=new Computer[10];
//	
//	System.out.println("please enter the brand which you want to search");
//	String str=scan.next();
//
//	Computer[] inventory=new Computer[10];
//
//	int index=0;
//	for(int i=0;i<inventory.length;i++) 
//	{
//			if(inventory[i]!=null) {
//			if(str.equals(inventory[i].brand)) 
//		{
//			 {
//			strarray[index]=inventory[i];
//			index++;
//			}
//		}}
//				
//	 else {
//					System.out.println("brand not found");
//				}
//			}
//				for(int j=0;j<strarray.length;j++) 
//					if(strarray[j]!=null){
//						{
//							strarray[j].tostring();
//						}
//						
//					}
//				
//			
//	}








private static void mainmenu()
{
	System.out.println("1. Enter new computer(password required)..");
	System.out.println("2. Change information of a computer(password required)..");
	System.out.println("3. Display all the computers by a specific brand ");
	System.out.println("4. Display all the computers under a certain price ");
	System.out.println("5. Quit...");
}
private static void updatemenu() 
{
	System.out.println("1.Brand: ");
	System.out.println("2.Model: ");
	System.out.println("3.Serial Number: ");
	System.out.println("4.Price: ");
	System.out.println("5.Quit: ");
}


}



