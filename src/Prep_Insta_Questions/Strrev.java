package Prep_Insta_Questions;
import java.util.*;
public class Strrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = new String(sc.nextLine());
		sc.close();
		System.out.println(strrev(s));
	}

	private static char[] strrev(String s) {
		// TODO Auto-generated method stub
		char[] e = s.toCharArray();
		int start = 0;
		int end = s.length()-1;
		while(start<end) {
			e[start]^=e[end];
			e[end]^=e[start];
			e[start]^=e[end];
			start++;
			end--;
		}
		return e;
	}

}
