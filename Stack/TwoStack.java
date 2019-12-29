package Stack;

public class TwoStack
{
	int size;
	int TOP1,TOP2;
	int a[];
	TwoStack(int n)
	{
		a=new int[n];
		size=n;
		TOP1=-1;
		TOP2=size;
	}
	//method for 1st stack
	void push1(int data)
	{
	 if(TOP1>=TOP2-1)
	 {
		 System.out.println("Stack1 OverFlow");
		 return;
	 }
	 a[++TOP1]=data;
		
	}
	void push2(int data)
	{
		if(TOP1>=TOP2-1)
		{System.out.println("Stack2 Overflow");
		 return;
			
		}
		a[--TOP2]=data;
	}
	void  pop1()
	{
		if(TOP1<=-1)
		{
			System.out.println("Stack1 Underflow");
			return;
		}
		System.out.println("Popped Element  from Stack 1 "+a[TOP1]);
		TOP1--;
		
	}
	void pop2()
	{
		if(TOP2>=size)
		{
			System.out.println("Stack2 Overflow");
			return;
		}
		System.out.println("Popped Element from Stack 2"+a[TOP2]);
		TOP2++;
	}
	void display1()
	{  
	   if(TOP1<=-1)
	   {
		   System.out.println("Stack1 Underflow");
		   return;
	   }
	   for(int i=0;i<=TOP1;i++)
	   {
		   System.out.print(a[i]+"\t");
	   }
	}
	void display2()
	{
		if(TOP2>=size)
		{
			System.out.println("Stack2 Underflow");
			return;
		}
		for(int i=TOP2;i<size;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
	public static void main(String[] args) {
		TwoStack t1=new TwoStack(100);
		t1.push1(10);
		t1.push1(20);
		t1.push1(30);
		t1.push1(40);
		t1.push1(50);
		t1.push1(60);
		t1.push2(1);t1.push2(2);t1.push2(3);t1.push2(4);
		t1.display1();
		System.out.println();
		t1.display2();
		
		
	}

}
