package Tree;

import java.util.Stack;

public class BinaryTree5 
{  static void inOrderPrint(Node root)
	{  if(root==null)
		return;
	   Stack<Node> s1=new Stack<Node>();
	   Node curr=root;
	   while(curr!=null || s1.size()>0)
	   {
		  while(curr!=null)
		  {
			  s1.push(curr);
			  curr=curr.lchild;
		  }
		  
		  curr=s1.pop();
		  System.out.println(curr.data+" ");
		  curr=curr.rchild;
		  
	   }
	}
	public static void main(String[] args) 
	{
		BinaryTree t1=new BinaryTree();
		t1.root=new Node(1);
		
		t1.root.lchild=new Node(2);
		
		t1.root.rchild=new Node(3);
		
		t1.root.lchild.lchild=new Node(4);
		
		t1.root.lchild.rchild=new Node(5);
		t1.root.rchild.lchild=new Node(6);
		
		inOrderPrint(t1.root);
		
	}

}
