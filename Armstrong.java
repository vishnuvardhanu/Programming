//is armstrong 
import java.util.*;
public class Armstrong{
	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	System.out.println("enter a number");
	int n=inp.nextInt();
	int[] arr = new int[10];
	int l=n;
	int sum=0,m,i=0,rem=0;
	
	while(n!=0)
	{
		m=n%10;
		arr[i]=m;
		i++;
		n=n/10;
		rem++;			
	}
	for(int j=rem-1;j>=0;j--)
	{
		sum=sum+(int)Math.pow(arr[j],rem);		
	}
   if(sum==l)
   {
   System.out.println(l+" is armstrong");
   }
   else
   System.out.println(l+" is not armstrong");		
	}
}
