package Stack;

import java.util.Stack;

public class NextGreaterElement
{
	
	public static void greterElement(int[] arr, int length)
	{ int[] newarr=new int[length];
		for(int i=0;i<length;i++)
		{  int flag=0;
			for(int j=i+1;j<length;j++)
			{
				if(arr[j]>arr[i])
				{
					newarr[i]=arr[j];
					flag=1;
					break;
				}
			}
			if(flag==0)
				newarr[i]=-1;
			
		}
		for(int i=0;i<newarr.length;i++)
		{
			System.out.println(arr[i]+"=>"+newarr[i]);
		}
		
	}
	 static void  greaterElementUsingStack(int arr[],int size)
	{
		 Stack<Integer> s1=new Stack<Integer>();
		 int next,element;
		 s1.push(arr[0]);
		 
		 for (int i = 1; i < arr.length; i++) 
		 {
			 next=arr[i];
			 if(!s1.isEmpty())
			 {  element=s1.pop();
				 while(next>element)
				 {
					 System.out.println(element+"----"+next);
					 if(s1.isEmpty())
						 break;
					 element=s1.pop();
				 }
				 if(next<element)
					 s1.push(element);
			 }
			 s1.push(next);
			 
			 
			
		 }
		 while(!s1.isEmpty())
		 {  next=-1;
		    int data=s1.pop();
			 System.out.println(data+"----"+next);
		 }
		 
		
	}

	public static void main(String[] args) 
	{int[] arr= {4,3,7,25};
	 //greterElement(arr,arr.length);
	 greaterElementUsingStack(arr, arr.length);
	
     }

	
}
