package arrays.java.zn;

import java.util.Arrays;

public class Arrays07 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int arr1[]=Arrays.copyOf(arr, 4);
		
		System.out.println("New Array is : "+Arrays.toString(arr1));
	}

}
