package io.javabrains.javabasics;
        public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
      int[] arr={10,20,30,40,50};
        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
int sum=0,largest=arr[0];
for(int i=0;i<arr.length;i++){
    sum+=arr[i];
    if(arr[i]>largest){
        largest=arr[i];
    }
}
double avg= (double)sum/arr.length;
System.out.println("Sum is: "+sum);
System.out.println("Average is: "+avg);
System.out.println("Largest is: "+largest);


    }
}
