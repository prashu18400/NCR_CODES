package Prep_Insta_Questions;

import java.util.*;

public class MaxDiff {
	public static int max_diff_arr(int[] arr,int n) {
		int res = arr[1] - arr[0];
		int min_ele = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]-min_ele>res)
				res = arr[i] - min_ele;
			if(arr[i]<min_ele)
				min_ele = arr[i];
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		sc.close();
		System.out.println(max_diff_arr(arr,n));

	}

}
