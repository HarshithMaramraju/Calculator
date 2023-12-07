package Practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("WELCOME TO CALCULATOR");

		System.out.println("enter num1");
		int num1 = scanner.nextInt();
 		System.out.println("enter num2");
		int num2 = scanner.nextInt();

		System.out.println("press 1 for addition");
		System.out.println("press 2 for subtraction");
		System.out.println("press 3 for multiplication");
		System.out.println("press 4 for devision");
		System.out.println("press 5 for modules");
		
		int calculate = scanner.nextInt();
		switch (calculate) {
		case 1:
		{
			System.out.println("Addition of two numbers");
			System.out.println(num1+num2);
		}
		break;

		case 2:
		{
			System.out.println("Subraction of two numbers");
			System.out.println(num1-num2);
		}
		break;
		case 3:
		{
			System.out.println("Multiplication of two numbers");
			System.out.println(num1*num2);
		}
		break;
		case 4:
		{
			System.out.println("Division of two numbers");
			System.out.println(num1/num2);
		}
		break;
		case 5:
		{
			System.out.println("Modluse of two numbers");
			System.out.println(num1%num2);
		}
		break;

		default:
		{
			System.out.println("INVALID SELECTION");
		}
			break;
		}
	}
}
