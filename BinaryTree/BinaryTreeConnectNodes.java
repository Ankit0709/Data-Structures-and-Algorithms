package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeConnectNodes 
{   Node root=null;
	static class Node
	{
		char data;
		Node lchild;
		Node rchild;
		Node nextright;
		
		Node(char d)
		{
			data=d;
			lchild=null;
			rchild=null;
			
		}
		
	}
	public BinaryTreeConnectNodes() {
		root=null;
	}
	BinaryTreeConnectNodes(char key)
	{
		root=new Node(key);
	}
	
	public static void connectNodes(Node root)
	{
		if(root==null)
			return;
		Queue<Node> q1=new LinkedList<Node>();
		q1.add(root);
		q1.add(null);
		while(!q1.isEmpty())
		{
			Node p=q1.poll();
			if(p!=null)
			{
				p.nextright=q1.peek();
				
				if(p.lchild!=null)
					q1.add(p.lchild);
				if(p.rchild!=null)
					q1.add(p.rchild);
				
			}
			else if(!q1.isEmpty())
			{
				q1.add(null);
			}
		}
		
		
	}
	public static void main(String[] args)
	{
		BinaryTreeConnectNodes t1=new BinaryTreeConnectNodes('A');
		t1.root.lchild=new Node('B');
		t1.root.rchild=new Node('C');
		t1.root.lchild.lchild=new Node('D');
		t1.root.lchild.rchild=new Node('E');
		t1.root.rchild.lchild=new Node('F');
		connectNodes(t1.root);
		System.out.println("Next Right node of "+t1.root.data+" is : "+((t1.root.nextright!=null)?t1.root.nextright.data:-1));
		System.out.println("Next Right node of "+t1.root.lchild.data+" is : "+((t1.root.lchild.nextright!=null)?t1.root.lchild.nextright.data:-1));
		System.out.println("Next Right node of "+t1.root.rchild.data+" is : "+((t1.root.rchild.nextright!=null)?t1.root.rchild.nextright.data:-1));
		System.out.println("Next Right node of "+t1.root.lchild.lchild.data+" is : "+((t1.root.lchild.lchild.nextright!=null)?t1.root.lchild.lchild.nextright.data:-1));
		System.out.println("Next Right node of "+t1.root.lchild.rchild.data+" is : "+((t1.root.lchild.rchild.nextright!=null)?t1.root.lchild.rchild.nextright.data:-1));
		
		
    }

}
