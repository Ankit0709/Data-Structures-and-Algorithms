import java.util.Scanner;

public class MergeSort {
 static void MergeLeftSort(int[] a, int lowerIndex, int middle) {
		
		
	}
  static void MergeRightSort(int[] a, int i, int higherIndex) {
		// TODO Auto-generated method stub
		
	  
	}

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of array:");
int size=s.nextInt();
int[] a=new int[size];
		System.out.println("Enter the values for the array");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		int lowerIndex=0,higherIndex=a.length-1,middle=(lowerIndex+higherIndex)/2;
		MergeSort.MergeLeftSort(a,lowerIndex,middle);
		MergeSort.MergeRightSort(a,middle+1,higherIndex);
	}

	

	

}
