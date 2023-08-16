package com.dyson.engage.QA;


public class App {
	public static void main(String[] args) {
		int arr[] = { 23, 2, 13, 55, 6 };
		int max1 = 0;
		int max2 = 0;
		for (int num : arr) {
			if (max1 < num) {
				max2 = max1;
				max1 = num;

			} else if (max2 < num) {
				max2 = num;
			}

		}

		System.out.println("max1:" + max1);
		System.out.println("max2:" + max2);
	}
}
