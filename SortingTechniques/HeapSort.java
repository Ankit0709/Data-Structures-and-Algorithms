import java.util.Scanner;

public class HeapSort {

	 static void mergeLeftSort(int[] arr,int left,int right)
{int size=right-left+1,middle;
System.out.println("Size of new array=  "+size);
System.out.println(left+" : "+right);
System.out.println(size);
while(size>1)
{System.out.println("Inside while");
	middle=(left+right)/2;
	mergeLeftSort(arr, left, middle);
}
if(arr[left]>arr[right+1])
	{
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
	

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	//Enter the size of array
	System.out.println("Enter the size of array:  ");
	
	int size=s.nextInt();
	//array of int type of size m
	int[] arr=new int[size];
	//Insert the elements in the array
	for (int i = 0; i < arr.length; i++) {
		arr[i]=s.nextInt();
	}
	
	HeapSort.mergeLeftSort(arr,0,size);

	
}
}
