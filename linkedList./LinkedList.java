package linkedList;

public class LinkedList
{
 Node head;
Node last;
 static class Node
{
 int data;
 Node next;
 Node(int d)
{data=d;
next=null;
}
}
void push(int newdata)
{
	Node n=new Node(newdata);
	n.next=head;
	head=n;
}
void deleteFirst()
{
Node temp=head.next;
head.next=null;
head=temp;
}
void display()
{
Node temp=head;
while(temp!=null)
{
System.out.println(temp.data+"\t");
temp=temp.next;
}
}

public static void main(String args[])
{
LinkedList l1=new LinkedList();

l1.push(10);
l1.push(20);
l1.display();
}

}
