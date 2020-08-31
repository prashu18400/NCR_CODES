package Geeks_For_Geeks;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int order = (int) (Math.log10(n))+1;
		int temp = n;
		int r,s=0;
		while(n>0) {
			r = n%10;
			s =s +(int) Math.pow(r, order);
			n/=10;
		}
		if(s-temp==0)
			System.out.println(s+" is a Armstrong Number");
		else
			System.out.println(temp+" is not an Armstrong Number");
		sc.close();
	}
}
