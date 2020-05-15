package com.raju.tandom;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter then number:");
		x = sc.nextInt();
		for (int i = 1; x > 0; i++) {
			if (i % 2 == 1 && i % 5 != 0) {
				System.out.print(i + " ");
				x--;
			}
		}

	}

}
