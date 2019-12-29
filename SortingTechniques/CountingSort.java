package sorting;

import java.util.Scanner;

public class CountingSort
{
	static void countingSort(int arr[],int n)
	{int max=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		int[] c=new int[max+1];
		for(int i=0;i<n;i++)
		{
			c[arr[i]]++;
		}
		for(int i=1;i<=max;i++)
		{
			c[i]=c[i]+c[i-1];
		}
	
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		{
			b[c[arr[i]]-1]=arr[i];
			
			c[arr[i]]--;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		   int n=s.nextInt();
		   int[] arr=new int[n];
		   for(int i=0;i<n;i++)
		   {
			   arr[i]=s.nextInt();
		   }
		   countingSort(arr, n);
	}

}
