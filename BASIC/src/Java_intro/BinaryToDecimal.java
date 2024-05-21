package Java_intro;

import java.util.*;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a binary number: ");
		int number = sc.nextInt();
		
		sc.close();
		
		int digit = 0;
		int temp = number;
		int i = 0;
		
		while(temp > 0) {
			int remainder = temp % 10;
			temp = temp / 10;
			digit = digit + remainder * (int) Math.pow(2, i++);
		}
		
		System.out.println("Decimal number of the given binary number is: "+digit);
		

	}

}
