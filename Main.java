import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome
	public void checkPalindrome() {
		System.out.println("\nEnter A Number To Check Palindrome : ");
		int num=sc.nextInt();
		int temp=num,reverseNum=0,rem=0;
		while(temp!=0) {
			rem=temp%10;
			reverseNum=reverseNum*10+rem;
			temp/=10;
		}
		if(reverseNum == num){
			System.out.println(num+" is a Palindrom Number.\n");
		}else {
			System.out.println(num+" is NOT a Palindrom Number.\n");
		}
	}

	// function to printPattern
	public void printPattern() {
		System.out.println("\nEnter A Number To Print N no. of Row For The Invert Star Pattren: ");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=num-i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// function to check no is prime or not
	public void checkPrimeNumber() {
		System.out.println("\nEnter A Nuumber To Check Prime Number: ");
		int num=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				System.out.println(num+" is Not a Prime Number.\n");
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num+" is a Prime Number.\n");
	}

	// function to print Fibonaci Series
	public void printFibonacciSeries() {
		// initialize the first and second value as 0,1 respectively.
		int first = 0, second = 1;
		System.out.println("\nEnter a Number To Find the N no of Fibonanci term: ");
		int num=sc.nextInt();
		System.out.print(first+" , "+second);
		for(int i=1;i<=num-2;i++) {
			int sum=first+second;
			System.out.print(" , "+sum);
			first=second;
			second=sum;
		}
		System.out.println();
	}

	// main method which contains switch and do while loop
	public static void main(String[] args) {
		Main obj = new Main();
		Scanner sc = new Scanner(System.in);

		int choice;

		do {
			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
			
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				choice = 0;
				break;
			case 1:
				obj.checkPalindrome();
				break;
			case 2:
				obj.printPattern();
				break;
			case 3:
				obj.checkPrimeNumber();
				break;
			case 4:
				obj.printFibonacciSeries();
				break;
			default:
				System.out.println("Invalid choice. Enter a valid no.\n");
			}
		} while (choice != 0);

		System.out.println("Exited Successfully!!!");
		sc.close();
	}
}
/*
	A program that performs multiple operations:

	1) Check for palindrome number
	2) Prints the pattern of stars in decreasing order based on the input
	3) Check whether the input number is a prime number
	4) Print Fibonacci series of size n with first two numbers as 0, 1
 
	Using Switch case and do-While loop provide all the above functionality, 
	such that user can select the functions that he/she needs to perform 
	and exit the program based on the input by typing '0'.

*/