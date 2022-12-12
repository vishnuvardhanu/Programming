//plus one

import java.util.*;

public class Plusone {

	public static void main(String[] args) {	  Scanner inp = new Scanner(System.in);

  System.out.println("enter size of the array");

  int s=inp.nextInt();

  int[] arr1=new int[s];

  int[] arr2 = new int[s+1];

  System.out.println("enter "+s+" elements into array");

  for(int i=0;i<arr1.length;i++)

  {

  	arr1[i]=inp.nextInt();

	}

    int j=1;

    int sum=0;

    for(int i=arr1.length-1;i>=0;i--)

    {

    	sum=sum+(arr1[i]*j);

    	j=j*10;

    }

    sum++;

    int rem;

    for(int i=arr2.length-1;i>=0;i--)

    {

     rem=sum%10;

     sum=sum/10;

     arr2[i]=rem;  

    }

    System.out.println("After perfoming plusone arrays is ");

    for(int i=0;i<arr2.length;i++)

    {

    	System.out.print(" "+arr2[i]);

    }

	}

}
