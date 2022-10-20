package question4;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the target");
	int target = sc.nextInt();
	System.out.println("Enter size of array");
	int size = sc.nextInt();
	int arr[] = new int [size];
	System.out.println("Enter elements of array");
	for(int i=0; i<size; i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0; i<size; i++) {
		for(int j=i+1; j<size; j++) {
			if(arr[i] + arr[j] == target) {
				System.out.print("indices are : ");
				System.out.println(i + " " + j);
			}
		}
	}
}
}
