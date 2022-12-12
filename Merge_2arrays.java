//merge two arrays

import java.util.*;

public class Merge_2arrays {

	public static void main(String[] args) {		Scanner inp = new Scanner(System.in);

		System.out.println("enter size of the first array");

		int n= inp.nextInt();

		int[] arr1 = new int[n];

		System.out.println("enter "+n+" elements into array");

		for(int i=0;i<n;i++)

		{

			arr1[i]=inp.nextInt();

		}

		System.out.println("enter size of the 2nd array");

		int m=inp.nextInt();

		int[] arr2 = new int[m];

		System.out.println("enter "+m+"elements into array");

		for(int i=0;i<m;i++)

		{

			arr2[i] = inp.nextInt();

		}

		System.out.println("Array 1");

			for(int i=0;i<n;i++)

		{

			System.out.print(" "+arr1[i]);

		}

		System.out.println("\nArray 2");

			for(int i=0;i<m;i++)

		{

			System.out.print(" "+arr2[i]);

		}

		System.out.println("\nAfter merging two arrays");

		int j=0;

		int[] arr3 = new int[m+n];

		for(int i=0;i<n;i++)

		{

			arr3[j] = arr1[i];

			j++;

		}

		for(int i=0;i<m;i++)

		{

			arr3[j]= arr2[i];

			j++;

		}

			System.out.println("merged array is");

		for(int i=0;i<m+n;i++)

		{

			System.out.print(" "+arr3[i]);

			}	

	}

}
