package org.service;

public class ArrayService {
       public float calculateAverage(int arr[]) {
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum = sum + arr[i];
		}
		float average = sum/5;
		return average;
	}
}
