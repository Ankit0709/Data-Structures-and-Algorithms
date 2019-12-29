package linkedList;

class LinkedList02
{
  Node head;
  
  static class Node
  { int data1;
    int data2;
    static int f=1;
    Node next;
 	
    Node(int d)
	{data1=d;
	 next=null;
	 data2=f;
	 f*=-1;
	}
   }
  public void printlist()
  {
     Node n=head;
     while(n!=null)
     { if(n.data2==1)
    	 System.out.print(n.data1+"\t");
    	 n=n.next;
     }


 }




 public static void main(String args[])
{
 LinkedList02 l2=new LinkedList02();
 
 Node n1=new Node(1);
 
 
 Node n2=new Node(2);
 Node n3=new Node(3);
 Node n4=new Node(4);
 Node n5=new Node(5);
 Node n6=new Node(6);
 Node n7=new Node(7);
 l2.head=n1;
 n1.next=n2;
 n2.next=n3;
 n3.next=n4;
 n4.next=n5;
 n5.next=n6;
 n6.next=n7;
 l2.printlist();
}

}
