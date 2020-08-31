package Prep_Insta_Questions;

import java.util.*;

public class Hmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.nextLine());
		sc.close();
		int count = 1;
		char current= s.charAt(0),next;
		for(int i = 1; i <s.length(); i++){
			next=s.charAt(i);
			if(next==current) {
				s.deleteCharAt(i);
				i=i-1;
				count++;
			}
			else {
				s.insert(i,count);
				count=1;
				current=next;
				i=i+1;
			}
		}
		s.append(count);
		System.out.println(s);
	}

}
