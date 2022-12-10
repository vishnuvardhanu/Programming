//Two sum 

import java.util.*;

public class Twosum{

	public static void main(String[] args) {		Scanner inp = new Scanner(System.in);

		System.out.println("enter the size of the array");

		int n= inp.nextInt();

		System.out.println("enter"+n+"elements into array");

		int[] arr = new int[n];

		for(int i=0;i<arr.length;i++)

		{

		    arr[i]=inp.nextInt();

		}

		System.out.println("enter target element");

		int target=inp.nextInt();

		

		for(int i=0;i<arr.length;i++)

		{

			for(int j=0;j<arr.length;j++)

			{

				if(arr[i]+arr[j]==target)

				{

					System.out.println("["+i+","+j+"]");

					}

			}

		}		    	    

	}

}
