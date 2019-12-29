package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class CheckIdentical
{
	static boolean checkIdentical(Node root1,Node root2)
	{
		if(root1==null&&root2==null)
			return true;
		else if(root1==null||root2==null)
			return false;
	Queue<Node> q1=new LinkedList<Node>();
		Queue<Node> q2=new LinkedList<Node>();
		q1.add(root1);
		q2.add(root2);
		while(!q1.isEmpty()&&!q2.isEmpty())
		{
			Node n1=q1.poll();
			Node n2=q2.poll();
			if(n1.data!=n2.data)
				return false;
			if(n1.lchild!=null&&n2.lchild!=null)
			{
				q1.add(n1.lchild);
				q2.add(n2.lchild);
			}
			
			else if(n1.lchild!=null||n2.lchild!=null)
			{
				return false;	}
			if(n1.rchild!=null&&n2.rchild!=null)
			{
				q1.add(n1.rchild);
				q2.add(n2.rchild);
			}
			
			else if(n1.rchild!=null||n2.rchild!=null)
			{
				return false;	}
			
		}
		return true;
		
		
		
		
	}
	
	
	static void left_view(Node root)
	{  
		if(root==null)
			return;
		Queue<Pair2> q1=new LinkedList<Pair2>();
	 int c=-1;
	 
	 q1.add(new Pair2(root,0));
	 while(!q1.isEmpty())
	 {
		 Pair2 pair=q1.poll();
		 if(pair.l!=c)
		 {
			 System.out.print(pair.n.data+" ");
			 c=pair.l;
		 }
		 if(pair.n.lchild!=null)
		 {
			 q1.add(new Pair2(pair.n.lchild,pair.l+1));
		 }
		 if(pair.n.rchild!=null)
		 {
			 q1.add(new Pair2(pair.n.rchild,pair.l+1));
		 }
		 
		 
	 }
	
	
	
	}
	
	public static void main(String[] args) 
	{
		BinaryTree t1=new BinaryTree();
		t1.root=new Node(10);
		t1.root.lchild=new Node(6);
		t1.root.rchild=new Node(7);
		t1.root.lchild.lchild=new Node(8);
		t1.root.lchild.rchild=new Node(9);
		t1.root.rchild.lchild=new Node(10);
		t1.root.rchild.rchild=new Node(11);
		
		BinaryTree t2=new BinaryTree();
	t2.root=new Node(10);
		t2.root.lchild=new Node(6);
		t2.root.rchild=new Node(7);
		//System.out.println("Trees are Identical: "+checkIdentical(t1.root,t2.root));
		
		System.out.println("Left View");
		left_view(t1.root);
		
	}

}
class Pair2
{  Node n;int l;
	Pair2(Node node,int level)
	{
	n=node;
	l=level;
	}
}

