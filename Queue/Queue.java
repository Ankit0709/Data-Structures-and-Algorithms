package queue;

public class Queue 
{   static int size=10;
	public int a[]=new int[size];
	public int front=-1,rear=-1;
	
	public boolean isEmpty()
	{
		if(front==-1)
			return true;
		else
			return false;
	}
	public boolean isFull()
	{
		if(front==0&&rear==size-1||rear==front-1)
			return  true;
		else
			return false;
	}
	public int front()
	{  if(isEmpty())
		{
			return -1;
		}
		return a[front];
	}
	public int rear()
	{   if(isEmpty())
		{
		return -1;
		
		}
		return a[rear];
	}
    public void enqueue(int data)
   {
	   if(isFull())
	    {
		  System.out.println("Queue Full");
		  return;
	    }
	   if(rear==size-1)
		   rear=0;
	   else if(rear==-1)
		   front=rear=0;
	   else
		   rear++;
	   a[rear]=data;
   }
    public void  dequeue()
    {
    	if(isEmpty())
    	{
    		System.out.println("Queue Empty");
    		return;
    	}
    	System.out.println("Element Deleted : "+a[front]);
    	if(front==rear)
    		front=rear=-1;
    	else if(front==size-1)
    		front=0;
    	else
    		front++;
    	
    }
    public void display()
    {
    	if(isEmpty())
    	{ System.out.println("Queue Empty");
        	return;
    	}
    	if(front<=rear)
    	{ for(int i=front;i<=rear;i++)
    		System.out.print(a[i]+" ");
    	}
    	else
    	{
    		for(int i=front;i<=size-1;i++)
    			System.out.print(a[i]+" ");
    		for(int i=0;i<=rear;i++)
    			System.out.print(a[i]+" ");
    	}
    }

}
