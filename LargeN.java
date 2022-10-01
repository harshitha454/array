//finding nth largest number from the array of numbers
import java.util.*;
class Nth_largest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the nth value:");
		int m=sc.nextInt();
		
		
	    System.out.println("Entered array is:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
			
		}
		
		Arrays.sort(a);
		int k=0;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[k++]=a[i];
				
			}
		}
		
		
		if(m<=k+1&&m>0)
		{
		
		System.out.println(m+"th largest number is:");
        System.out.println(a[n-m]);
		}
		else
		{
			System.out.println("Invalid n value");
		}
	}
}
		
		