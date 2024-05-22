package Java_intro;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int userInput = sc.nextInt();
		sc.close();
		
		int temp = userInput;
		int remainder;
		int sum = 0;
		
		while(temp > 0) {
			remainder = temp % 10;
			temp = temp /10;
			sum = (sum * 10) + remainder;
			
		}
		
		if(userInput == sum) {
			System.out.println("The given number "+userInput+" is palindrome");
		}else {
			System.out.println("The given number "+userInput+" is not palindrome");
			
		}

	}

}
