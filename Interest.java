//Write a program by using method overriding Calculate SI for saving account and current account
package Polymorphism;

import java.util.Scanner;

public class Interest
{
	Scanner sc = new Scanner(System.in);
	int p,r,t,si;
	public void inter()
	{
		System.out.println("\nThis is Saving Account Simple Interest : ");
		System.out.print("Principal Amount :  ");
		p = sc.nextInt();
		System.out.print("Rate of Inerest  :  ");
		r = sc.nextInt();
		System.out.print("Time Period :  ");
		t = sc.nextInt();
		si = (p*r*t)/100;
		System.out.print("Simple Interest : "+si);		
	}
}