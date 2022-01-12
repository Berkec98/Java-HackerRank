package addOddNum;

import java.util.Scanner;

public class sumofOdd {

	public static void main(String[] args) 
	{
		int number, i, oddSum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Give me the number! ");
		number = scan.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 != 0)
			{
				oddSum = oddSum + i; // berke
				System.out.println(i); // To show all odd numbers including 9
			}
		}
		System.out.println("The sum of all odd numbers including 9 is " + oddSum);
	}
}
