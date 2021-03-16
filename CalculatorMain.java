package com.example;
import java.util.*;



public class CalculatorMain {
	
	//public	int a;
	//public	int b;
	//public	int n;
	// public  int ans;
	
	public void scanning()
	{

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the value for N:");
		int n=scn.nextInt();
		
		
		//scn.close();
		
		for(int i=0;i<n;i++) {
		     int a=scn.nextInt();
			 int b=scn.nextInt();
			 int ans=0;
			Calculator calc = new Calculator();
			
			ans = calc.multiplication(a, b);
			System.out.println(ans);
		}
		scn.close();
	}
	
}
