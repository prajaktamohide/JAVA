package Day1;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=in.nextInt();
		int []arr;
		arr=new int[size];
		int temp=0;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the element :");
			arr[i]=in.nextInt();
			
			}
		System.out.println(" Array elements are :");
    	for(int i=0; i<arr.length; i++)
    	{
    		System.out.println(arr[i]);
    	}
    	
    	for(int i=0; i<arr.length; i++)
    	{
    		for(int j=i+1; j<arr.length; j++)
    		{
    			if(arr[i]>arr[j])
    			{
    				temp=arr[i];
    			    arr[i]=arr[j];
    			    arr[j]=temp;
    			}
    		}
    			}
    	System.out.println("Sorted Array Elememts are :");
    	for(int i=0; i<arr.length; i++)
    	{
    		System.out.println(arr[i]);
    		
    	}
    	System.out.println("Maximum element of an array is :"+arr[size-1]);
    	
 

	}

}
