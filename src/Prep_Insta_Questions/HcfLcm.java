package Prep_Insta_Questions;
import java.util.*;
public class HcfLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int c = gcd(a,b);
		System.out.println("GCD is: "+c);
		System.out.println("LCM is: "+(a*b)/c);
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(b!=0)
			return gcd(b,a%b);
		else
			return a;
	}

}
