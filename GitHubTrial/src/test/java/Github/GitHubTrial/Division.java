package review3;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		System.out.println("Provide a number:");
	Scanner userInput= new Scanner(System.in);
	int N=userInput.nextInt();
	
	
	if(N%3==0 && N%5==0) {
		System.out.println("Boom-Baam");
	}
	else if(N%3==0) {
		System.out.println("Boom");
	}
	else if(N%5==0) {
	System.out.println("Baam");
	}

	else {
		System.out.println("The number isn't divisible");
	}
	}

}
