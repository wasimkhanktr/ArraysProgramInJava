package arrays.java.zn;

import java.util.Arrays;

public class Arrays09 {

	public static void main(String[] args) {
		int arr[]= {9,2,7,4,11,8};
		
		int min=arr[0];
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(min>arr[i])
				min=arr[i];
			
			if(max<arr[i])
				max=arr[i];	
		}
		
		System.out.println("Maximum Element of array is : "+max);
		System.out.println("Minimum Element of array is : "+min);
		
	}

}
