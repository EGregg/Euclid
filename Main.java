//
//Compilation:  javac Euclid.java
//Execution:    java Euclid p q
//  
//Reads two user input or command-line arguments p and q and computes the greatest
//common divisor of p and q using Euclid's algorithm.
//
//
//
import java.util.Scanner;

public class Main {

	// Initial check for if recursion is needed
	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		else
			return gcd(q, p % q);
	}

	// recursive implementation
	public static int gcd2(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		try {
			System.out.println("Enter first number: ");
			int p = userInput.nextInt();
			// int p = Integer.parseInt(args[0]);
			System.out.println("Enter first number: ");
			int q = userInput.nextInt();
			// int q = Integer.parseInt(args[1]);
			int d = gcd(p, q);
			int d2 = gcd2(p, q);
			System.out.println("gcd(" + p + ", " + q + ") = " + d);
			System.out.println("gcd(" + p + ", " + q + ") = " + d2);
		} finally {
			userInput.close();
		}
	}
}