package Stack;

public class StockSpan {
	static void stockspan(int arr[],int size)
	{ int[] span=new int[size];
		for(int i=0;i<size;i++)
		{span[i]=1;
		  for(int j=i-1;j>=0&&(arr[i]>=arr[j]);j--)
		  {
			  
				 span[i]++;
		  }
		  
			
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(span[i]+"\t");
		}
		
	}
	public static void main(String[] args) 
	{int[] arr=  {10, 4, 5, 90, 120, 80}; 
	 stockspan(arr,arr.length);
		
	}
}
