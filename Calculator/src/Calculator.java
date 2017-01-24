import java.util.Scanner;
public class Calculator
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What operation would you like to do? 1. Addition    2. Subtraction    3. Multiplication    4. Division    5. Exponents");
				double userChoice = userInput.nextDouble();
				
					System.out.println("What's the first number you would like to use?");
					double num1 = userInput.nextDouble( );
					System.out.println("What's the second number you would like to use?");
					double num2 = userInput.nextDouble( );
				
				if (userChoice == 1) 
					{
						System.out.println("The answer is " + add(num1,num2));
					}
				if (userChoice == 2)
			
					{
						System.out.println("The answer is " + subtract(num1, num2) );
					}
				if (userChoice == 3)
					{
						System.out.println("The answer is " + multiply(num1, num2));
					}
				if (userChoice == 4)
					{
						System.out.println("The answer is " + divide(num1, num2));
					}
				if (userChoice == 5)
					{
						System.out.println(Math.pow(num1,num2 ));
					}
			}
					public static double add(double x, double y)
							{
								
								return x + y;
							}
					public static double subtract(double x, double y)
							{
								return x - y;
							}
					public static double multiply(double x, double y)
							{
								return x * y;
							}
					public static double divide(double x, double y)
							{
								return x / y;
							}
					// hello
					

	
}