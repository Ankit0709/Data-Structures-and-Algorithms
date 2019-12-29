package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree3 
{
	 static int height(Node root)
	   {
		   if(root==null)
			   return 0;
		   else
		   {
			   int lheight=height(root.lchild);
			   int rheight=height(root.rchild);
			   if(lheight>=rheight)
				   return (lheight+1);
			   else
				   return (rheight+1);
		   }
	   }
	static void printlevelOrder(Node root)
	{
		int h=height(root);
		if(h==0)
			return;
		else
		{
			for(int i=1;i<=h;i++)
				printNodesAtLevel(root,i);
		}
	}
	 static void printNodesAtLevel(Node root, int level) 
	 {
		 if(root==null)
			 return;
		 if(level==1)
			 System.out.print(root.data+" ");
		 else if(level>1)
		 {
			 printNodesAtLevel(root.lchild, level-1);
			 printNodesAtLevel(root.rchild, level-1);
			 
			 
		 }
		
		
	 }
	 
	 static void printLevelOrderUsingQueue(Node root)
	 {
		 Queue<Node> q1=new LinkedList<Node>();
		
		 q1.add(root);
		 while(!q1.isEmpty())
		 {  
			 Node temp=q1.remove();
			 System.out.print(temp.data+" ");
			 if(temp.lchild!=null)
			 q1.add(temp.lchild);
			 if(temp.rchild!=null)
			 q1.add(temp.rchild);
			
			 
		 }
		 Stack s1=new Stack();
		 
		 
	 }
	public static void main(String[] args) {
	BinaryTree t1=new BinaryTree();
	//root node 1
	t1.root=new Node(1);
	
	//left child 2
	t1.root.lchild=new Node(2);
	
	//rchild 3
	t1.root.rchild=new Node(3);
	
	//left child of 2->4
	t1.root.lchild.lchild=new Node(4);
	System.out.println("level order traversal");
	//printlevelOrder(t1.root);
	printLevelOrderUsingQueue(t1.root);
	
	
	
   }

}
