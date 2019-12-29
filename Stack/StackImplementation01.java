package Stack;

public class StackImplementation01
{  DLL top=null,mid=null;int c=0;
	public static class DLL
	{
		int data;
		DLL prev;
		DLL next;
		DLL(int d)
		{
			data=d;
			prev=null;
			next=null;
			
		}
	}
	 void push(int d)
	{
		DLL d1=new DLL(d);
		d1.next=top;
				
		c++;
		if(c==1)
		{
			mid=d1;
		}
		else
		{top.prev=d1;
		  if(c%2!=0)
		  {
			  mid=mid.prev;
		  }
			
		}
		top=d1;
		
	}
	 void pop()
	 {  
		 if(c==0)
		 {
			 System.out.println("Stack Underflow");
			 return;
		 }
		 System.out.println("Data Popped"+top.data);
		 top.next.prev=null;
		 top=top.next;
		 mid=mid.next;
	 }
	public static void main(String[] args)
	{ StackImplementation01 s1=new StackImplementation01();
		
	}

}
