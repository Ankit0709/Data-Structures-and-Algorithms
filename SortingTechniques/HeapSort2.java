import java.util.Scanner;

public class HeapSort2 {

	void mergeLeftSort(int[] arr,int left,int right)
{int size=right-left+1,middle;
System.out.println("Size of new array=  "+size);

while(size!=1)
	{middle=(left+right)/2;
	mergeLeftSort(arr, left, middle);
	}

if(arr[left]>arr[right+1])
	{
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	System.out.println(".....");
	}
	
}
	

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	//Enter the size of array
	System.out.println("Enter the size of array:  ");
	HeapSort2 h1=new HeapSort2();
	int size=s.nextInt();
	//array of int type of size m
	int[] arr=new int[size];
	//Insert the elements in the array
	for (int i = 0; i < arr.length; i++) {
		arr[i]=s.nextInt();
	}
	
	h1.mergeLeftSort(arr,0,size);
}
}
