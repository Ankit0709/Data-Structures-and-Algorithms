package Stack;

public class Stack 
{
	static int  MAX=1000;
	int a[]=new int[MAX];
	int TOP;
	Stack()
	{
		TOP=-1;
	}
	void push(int data)
	{
		if(TOP>=a.length-1)
		{
			System.out.println("Stack Overflow");
			return;
		}
		TOP++;
		a[TOP]=data;
		
	}
	void pop()
	{
		if(TOP<=-1)
		{
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println("Deleted Data : "+a[TOP]);
		TOP--;
	}
	void display()
	{
		if(TOP<=-1)
		{
			System.out.println("Stack Underflow");
			return;
		}
		for(int i=0;i<=TOP;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
	boolean isEmpty()
	{
		return (TOP<=-1);
	}
	public static void main(String[] args) 
	{
		Stack s1=new Stack();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.display();
	}

}
