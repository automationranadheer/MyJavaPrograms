package rana;

import java.util.Scanner;

public class Amgstrong 
{

	public static void main(String[] args) 
	{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int a=num;
	int x=0;
	while(num>0)
	{		
		int rem=num%10;
		x=x+rem*rem*rem;
		num=num/10;
	}
	if(a==x)
	{
		System.out.println(a+" == "+x);
	}
	}

}
