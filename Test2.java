package com.raju.tandom;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		x=sc.nextInt();
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				if(j!=1)
				System.out.print("  *  ");
				if(i%2==0) {
					System.out.print(i+1-j);
				}
				else {
					System.out.print(j);
				}
				
			}
			System.out.println();
		}

	}

}
