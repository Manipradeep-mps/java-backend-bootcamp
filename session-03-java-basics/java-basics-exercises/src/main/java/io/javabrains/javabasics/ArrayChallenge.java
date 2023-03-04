package io.javabrains.javabasics;
public class ArrayChallenge
{
	public static void main(String[] args) {
// Step 1: Create an array of integers
		int[] arr={1,4,8,5,9,3};
		int sum=0;
		int largest=arr[0];
// Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
		for(int i=0;i<arr.length;i++)
		{
		    sum+=arr[i];
		    if(arr[i]>largest)
		    {
		        largest=arr[i];
		    }
		}
		double average=(double)sum/arr.length;
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+average);
		System.out.print("Largest is "+largest);
	}
}
