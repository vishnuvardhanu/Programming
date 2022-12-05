//search operation
import java.util.*;
public class search {
	public static void main(String[] args) {
    Scanner inp= new Scanner(System.in);
    System.out.println("enter no of elements to be entered");
    int n=inp.nextInt();
 	int[] arr = new int[n];
 	System.out.println("enter"+n+" elements");
 	for(int i=0;i<arr.length;i++)
 	{
 	  arr[i]=inp.nextInt();
 	}
 	System.out.println("enter element to search");
 	int element=inp.nextInt();
 	for(int j=1;j<arr.length;j++)
 	{
 		if(arr[j]!=element)
 		{
 		}
 		else
 		{
 		 System.out.println("element "+element+" found at index"+j);
 		}
 	}
	}
}
