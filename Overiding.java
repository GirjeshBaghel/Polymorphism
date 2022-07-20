//Write a program by using method overriding Calculate SI for saving account and current account
package Polymorphism;

public class Overiding extends Interest{
	
	public void inter()
	{
		System.out.println("\nThis is Current Account Simple Interest : ");
		System.out.print("Principal Amount : ");
		p = sc.nextInt();
		System.out.print("Rate of Inerest  : ");
		r = sc.nextInt();
		System.out.print("Time Period : ");
		t = sc.nextInt();
		si = (p*r*t)/100;
		System.out.print("Simple Interest : "+si);		
	}
	
	public static void main(String[] args)
	{
		Interest ob = new Overiding();
		ob.inter();
		Overiding ob1 = new Overiding();
		ob1.inter();		
	}
}
