package week1.day2;

import java.util.Arrays;

@SuppressWarnings("unused")
public class FindMissingElementInAnArray {
	
		public static void main(String[] args) {
			int arr[]= {1,2,3,4,7,6,8};
			int n=arr.length;
			int sum=(n+2)*(n+1)/2;
			for(int i=0;i<n;i++) {
				sum=sum-arr[i];
			}
			System.out.println("Missing element is: "+sum);
		}
	

}
