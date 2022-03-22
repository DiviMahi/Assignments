package com.dv.codingjava;

import java.util.Scanner;
public class Assignment1 
{
	public void test()
	{
		System.out.println("hello");
		return ;
	}
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		//======EVEN OR ODD======
		System.out.println("Enter a particular number");
		int num = obj.nextInt();
		for (int i = 0; i <= num; i++) 
		{
			if (i % 2 == 0) 
			{
				System.out.println(i + "-Even");
			}
			else
			{
				System.out.println(i + "-Odd");
			}
		}
		//======TABLE PRINTING======
		System.out.println("Enter the table number");
		int num2=obj.nextInt();
		for(int j=1;j<=10;j++) 
		{
			System.out.println(j+"*"+num2+"="+(j*num2));
		}
		
		//=====FINDING POWER OF THE NUMBER
		int answer=1;
		System.out.println("Enter a number to be powered");
		int num3=obj.nextInt();
		System.out.println("enter the value of power");
		int num4=obj.nextInt();
		for(int k=1;k<=num4;k++)
		{
			answer=answer*num3;
		}
				
		System.out.println("result of power is:"+answer);
		
	//======SERIES PRINTING=====
	     System.out.println("enter a value of m");
	     int m=obj.nextInt();
	     System.out.println("enter a value of n");
	     int n=obj.nextInt();
	     System.out.println("enter the limit");
	     int lim=obj.nextInt();
	     double result=0;
	     System.out.print("(");
	     for(int x=0;x<lim;x++)
	     {
	    	 if (x==0)
	    	 {
	    		 result=m+Math.pow(2, x)*n;
	    		 System.out.print((int)result+",");
	    	 }
	    	 else {
	 
	    	   result=result+(Math.pow(2,x)*n);
	    	   System.out.print((int)result+",");
	    	 }
	     }
	     System.out.print(")");
	     Assignment1 b=new Assignment1();
	     b.test();
	
	}   
	
	
	}

