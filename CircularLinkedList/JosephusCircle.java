package CircularLinkedList;

import java.util.Scanner;

import CircularLinkedList.CircularSingleList.Node;

public class JosephusCircle 
{  void getSafeNode(Node head)
	{
	  
	}


	public static void main(String[] args)
	{   Scanner s=new Scanner(System.in);
		CircularSingleList c1=new CircularSingleList();
		System.out.println("Enter the number of nodes");
		int n=s.nextInt();
		System.out.println("Enter mth node to be deleted");
		int m=s.nextInt();
		for(int i=n;i>=1;i--)
			c1.push(i);
		c1.display(c1.head);
		JosephusCircle j1=new JosephusCircle();
		
		
		
	}

}
