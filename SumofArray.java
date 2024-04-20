package Day1;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner in = new Scanner(System.in);	
	 System.out.println("Enter the size of array :");
	 int size=in.nextInt();
     int []arr;
     arr=new int[size];
     int sum=0;
     for(int i=0; i<arr.length; i++)
     {
    	 System.out.println("Enter Element :");
    	 arr[i]=in.nextInt();
     }
     System.out.println("Array Elements are :");
     for(int i=0; i<arr.length; i++)
     {
    	 System.out.println(arr[i]);
    	 
     }
     for(int i=0; i<size; i++)
     {
    	 sum=sum+arr[i];
     }
     System.out.println("Sum of array elements :"+sum);
     
     
     
     
	}

}
