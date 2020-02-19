package com.suntechno.vedikas;
import java.util.*;

public class Primenumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number n vaue`:");
		int a=sc.nextInt();
		for(int i=1;i<=50;i++) {
		int count=0;
		for(int j=1;j<=i;j++)
		{
	         if(i%j==0) {
	        	 count=count+1;
	         }
		}
		if(count==2) {
			System.out.println(i);
		}
	}

}}
