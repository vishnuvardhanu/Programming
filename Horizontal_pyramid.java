//horizontal pyramid

import java.util.*;

public class Horizontal_pyramid {

	public static void main(String[] args) {	
  
    int i,j,n;

		Scanner inp = new Scanner(System.in);

		System.out.println("enter any number");

		n=inp.nextInt();

		for(i=1;i<=n;i++)

		{

		    for(j=1;j<=i;j++)

		    {

		        System.out.print("*");

		    }

		    System.out.println();

		}

		for(i=n-1;i>0;i--)

		{

		for(j=1;j<=i;j++)

		{

		 System.out.print("*");

		}

		System.out.println();

		}

	}

}
