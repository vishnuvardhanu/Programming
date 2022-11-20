//hollow square pattern

import java.util.*;

public class hollowsqr_pattern{

	public static void main(String[] args) {
    int i;

	  int n;

	  Scanner inp = new Scanner(System.in);

	  System.out.println("enter any number");

	  n=inp.nextInt();

 	for(i=1;i<=n;i++)

 	{

 	    for(int j=1;j<=n;j++)

 	    {

 	        if(i==1 || j==1 || i==n || j==n)

 	        {

 	            

 	        System.out.print("*");

 	        }

 	        else

            {

 	            System.out.print(" ");

 	            }

 	        

 	    }

 	    System.out.println("");

 	}

 	

	}

}
