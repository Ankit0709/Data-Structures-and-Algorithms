package Tree;

public class BinarySearchTree
{
	static Node search_in_BST(Node root,int key)
	{
		if(root==null||root.data==key)
			return root;
		if(root.data>key)
			return search_in_BST(root.lchild, key);
		
		return search_in_BST(root.rchild, key);
				
	}
	static Node insert_In_BST(Node root,int key)
	{
		if(root==null)
		{
			return new Node(key);
		}
		
		else
		{
			if(root.data<key)
				root=insert_In_BST(root.rchild, key);
			else
				root=insert_In_BST(root.lchild, key);
		}
		return root;
		
			
	}
	  static void inOrder(Node node)
	   {
		   if(node==null)
			   return;
		   //left child
		   inOrder(node.lchild);
		   
		   //root node
		   System.out.print(node.data+"\t");
		   
		   //right child
		   inOrder(node.rchild);
	   }
	public static void main(String[] args)
	{
		BinaryTree t1=new BinaryTree();
		t1.root=new Node(8);
		t1.root.lchild=new Node(3);
		t1.root.rchild=new Node(10);
		t1.root.lchild.lchild=new Node(1);
		t1.root.lchild.rchild=new Node(6);
		t1.root.rchild.rchild=new Node(14);
		t1.root.lchild.rchild.lchild=new Node(4);
		t1.root.lchild.rchild.rchild=new Node(7);
		t1.root.rchild.rchild.lchild=new Node(13);
		//Node result=search_in_BST(t1.root,15);
	//System.out.println(result==null?"Not found":result.data);
//		Node root=insert_In_BST(t1.root,200);
//		t1.inOrder(t1.root);
//		System.out.println("data inserted");
		
		
	}
}
