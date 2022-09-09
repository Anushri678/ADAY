package org.practicaltest.view;

import java.util.Scanner;

import org.practicaltest.model.QuestionAnswer;

public class Main {
	static Scanner sc = new Scanner(System.in);
 	private static void displayQuestion(QuestionAnswer arr) {
 		System.out.println(arr.getQuestion());
 		System.out.println(arr.getOption1());
 		System.out.println(arr.getOption2());
 		System.out.println(arr.getOption3());
 		System.out.println(arr.getOption4());
		System.out.println("Enter your answer : ");
		String ans = sc.next();
			if(ans.equals(arr.getAnswer())) {
				System.out.println("Your answer is correct");
			}
			else {
				System.out.println("Your answer is wrong");
			}
		
		
		
		
	}

    public static void main(String[] args) {
   System.out.println("Enter Number of Question you want to play");	
   int n = sc.nextInt();
   QuestionAnswer[] arr = new QuestionAnswer[n];
   arr[0] = new QuestionAnswer("Nagpur is in which State?", "MH", "UP", "MP", "AP", "MH");
   for(int i=0; i<n; i++) {
   displayQuestion(arr[i]);
   }
   
    }
}
