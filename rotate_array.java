import java.util.*;

public class rotate_array{

	static void rotate(int arr[])	{

		int temp= arr[0];

		int a=0;

		for(int i=1;i<arr.length;i++)

		{

			arr[a]=arr[i];

			a++;

		}

		arr[arr.length-1]=temp;

		

	}

	

	public static void main(String[] args) {

	Scanner inp = new Scanner(System.in);

	System.out.println("enter size of the array");

	int n=inp.nextInt();

	System.out.println("enter elements into array");

	int[] arr = new int[n];

	for(int i=0;i<n;i++)

	{

		arr[i]=inp.nextInt();

	}

	System.out.println("enter no of rotation to perform ");

	int r=inp.nextInt();

	for(int i=0;i<r;i++)

	{

		rotate(arr);

	}

	for(int i=0;i<arr.length;i++)

	{

		System.out.print(" "+arr[i]);

	}

}

}
