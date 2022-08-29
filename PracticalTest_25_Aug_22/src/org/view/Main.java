package org.view;

import java.util.Scanner;

import org.service.ArrayService;

public class Main {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i=0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayService obj = new ArrayService();
		System.out.println(obj.calculateAverage(arr));
	}
}
