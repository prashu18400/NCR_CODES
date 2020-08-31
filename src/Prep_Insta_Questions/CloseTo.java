package Prep_Insta_Questions;
import java.util.*;
public class CloseTo {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		System.out.println(close_to_divideby(n,m));
	}

		private static int close_to_divideby(int n, int m) {
			// TODO Auto-generated method stub
			int q = n/m;
			int n1 = q*m;
			int n2;
			if(q*m>0)
				n2 = m*(q+1);
			else
				n2 = m*(q-1);
			if(Math.abs(n-n1)>Math.abs(n-n2))
				return n2;
			return n1;
		}
}
