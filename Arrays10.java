package arrays.java.zn;

import java.util.Arrays;

public class Arrays10 {

	public static void main(String[] args) {
		int arr[]= {9,2,7,4,11,8};
		
		for(int i=0; i<arr.length; i++)
		{
			int min=arr[i];
			for(int j=i+1; j<arr.length; j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
					arr[j]=arr[i];
					arr[i]=min;
				}
				
			}
		}
		
		System.out.println("New Array is : "+Arrays.toString(arr));
	}

}
