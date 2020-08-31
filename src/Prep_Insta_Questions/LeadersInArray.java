package Prep_Insta_Questions;
/*Given an array we need to print the leaders i.e a leader is an element which is greater than all elements
 * towards it right*/
import java.util.*;

public class LeadersInArray {
	public static StringBuffer leaders_of_array(int[] arr,int n) {
		StringBuffer s = new StringBuffer();
		int max_so_far = arr[n-1];
		s.append(max_so_far);
		s.append(" ");
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>max_so_far) {
				s.append(arr[i]);
				s.append(" ");
				max_so_far = arr[i];
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(leaders_of_array(arr,n));
	}

}
