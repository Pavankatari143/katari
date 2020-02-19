package com.suntechno.vedikas;

public class Reverse {

	public static void main(String[] args) {
		int digit=0,reverse=0,n=153;
		while(n>0)
		{
		digit=n%10;
		reverse=reverse*10+digit;
		n=n/10;
		}
		System.out.println(reverse);
	}

}
