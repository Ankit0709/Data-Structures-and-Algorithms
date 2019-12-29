package linkedList;

class LinkedList01
{
  Node head;
  
  static class Node
  { int data;
    Node next;
 	
    Node(int d)
	{data=d;
	 next=null;
	}
   }
  public void printlist()
  {
     Node n=head;
     while(n!=null)
     { System.out.print(n.data+"\t");
    	 n=n.next;
     }


 }




 public static void main(String args[])
{
 LinkedList01 l1=new LinkedList01();
 Node n1=new Node(1);
 Node n2=new Node(2);
 Node n3=new Node(3);
 l1.head=n1;
 n1.next=n2;
 n2.next=n3;
 l1.printlist();
}

}
