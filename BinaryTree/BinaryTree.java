package Tree;
 class Node
{
	int data;
	Node lchild,rchild;
	public Node(int d)
	{
		data=d;
		lchild=rchild=null;
	}
}
public class BinaryTree 
{
   Node root;
   public  BinaryTree(int key)
   {
	   root=new Node(key);
   }
   public BinaryTree()
   {
     root=null;
   }
   
   //function for preoder traversal
   void preOrder(Node node)
   {
	   if(node==null)
		   return;
	   //root node
	   System.out.print(node.data+"\t");
	   
	   //left child
	   preOrder(node.lchild);
	   
	   
	   //right child
	   preOrder(node.rchild);
	   
	   
   }
   
   //function for postorder traversal
   void postOrder(Node node)
   {
	   if(node==null)
		   return;
	   
	   //left child
	   postOrder(node.lchild);
	   
	   //right child
	   postOrder(node.rchild);
	   
	  //root node
	   System.out.print(node.data+"\t");
   }
 	
   void inOrder(Node node)
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
   int height(Node root)
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
}
