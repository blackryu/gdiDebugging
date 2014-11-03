package fibonacci;

import static gdi.MakeItSimple.*;
public class Fibonacci {
	public static void main(String[] args) {
		
		int n = 0;
		do {
			System.out.print("Enter a number (n>2): ");
			n = readInt();
			readLine();
		} while (n < 2);

		printArray(getFiboArrayIterativ(n));
		System.out.println();
		printFibo(n);
	}

	private static int[] getFiboArrayIterativ(int n) {
		int[] f = new int[n];
		f[0] = 1;
		f[1] = 1;

		for (int i = 2; i < n; i++)
			f[i] = f[i - 1] + f[i - 2];
		return f;
	}
	
	private static int getFiboRec(int n){
		if(n == 0 || n == 1){
			return n;
		} else {
			return getFiboRec(n - 1) + getFiboRec(n -2);
		}
	}
	
	private static void printFibo(int n) {
		for(int i = 0; i <= n; i++){
			System.out.printf("Fibbonacci of %d is: %d\n",i, getFiboRec(i));
		}
	}

	private static void printArray(int[] fiboArray) {
		for (int i = 0; i < fiboArray.length; i++) {
			System.out.printf("%4d", fiboArray[i]);
		}
	}
}
