import java.util.*;

public class Main {

	public static void main(String[] args) {	
      int n;

	    Scanner inp = new Scanner(System.in);

	    System.out.println("enter any number");

	    n=inp.nextInt();

	    for(int i=n;i>=0;i--)

	    {

	        for(int j=1;j<=i;j++)

	        {

	            System.out.print("*");        

	        }

	        System.out.println();	        

	    }	    	    

	}

}
