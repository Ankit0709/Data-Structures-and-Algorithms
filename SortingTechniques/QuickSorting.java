package sorting;


import java.util.Scanner;

public class QuickSorting 
{
	
	static void QuickSort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int k=Partition(arr, low, high);
			QuickSort(arr,low,k-1);
			QuickSort(arr,k+1, high);
		}
	}
	
	static int Partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;
		for(int j=low;j<=high-1;j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				if(i!=j)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
		
	}
	
   public static void main(String[] args)
   {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int[] arr=new int[n];
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=s.nextInt();
	   }
	   QuickSort(arr,0, n-1);
	   System.out.println("Sorted array");
	   for(int i=0;i<n;i++)
	   {
		   System.out.print(arr[i]+" ");
	   }
	   
	
   }
}
