package Geeks_For_Geeks;

import java.util.Scanner;

public class Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		bin(n);
	}

	private static void bin(int n) {
		// TODO Auto-generated method stub
		if(n>1)
			bin(n/2);
		System.out.print(n%2);
		
	}

}
