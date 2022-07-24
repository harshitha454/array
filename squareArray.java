import java.util.*;
public class squareArray
{
	public static void main(String args[])
	{
		int n,tmp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in increasing order:");
		for(int i=0;i<n;i++)
		 	a[i]=sc.nextInt();
		System.out.println("Original array:");
		for(int i=0;i<n;i++)
		  	System.out.println(a[i]);
		
	   	for(int i=0;i<n;i++)
		 {
		     a[i]=(a[i]*a[i]);
		 }
		Arrays.sort(a);
		System.out.println("Square of array in non-decreasing order:");
		System.out.println(Arrays.toString(a));
				 
		
	 }
}
		
		