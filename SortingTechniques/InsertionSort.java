import java.util.Scanner;

public class InsertionSort {
	
	
	static void sort(int[] arr,int size)
	{for (int i = 1; i <=size-1 ; i++) 
	{
	int j=i-1;
	int key=arr[i];
	while(j>=0&& arr[j]>key)
	{arr[j+1]=arr[j];
		j--;
	}
	arr[j+1]=key;
		int a=10;
	
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+"\t");
	}
		
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size=s.nextInt();
	int[] arr=new int[size];
	System.out.println("Enter the elements: ");
	for (int i = 0; i < arr.length; i++) {
		arr[i]=s.nextInt();
	}
	InsertionSort.sort(arr,size);
	
}
}
