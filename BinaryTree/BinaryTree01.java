package Tree;

public class BinaryTree01 
{
	public static void main(String[] args)
	{
		//root node 10
		BinaryTree b1=new BinaryTree(10);
		
		//left child 20
		b1.root.lchild=new Node(20);
		
		//right child 30
		b1.root.rchild=new Node(30);
		
		//left child of 20 ->40
        b1.root.lchild.lchild=new Node(40);	
        System.out.println("Preorder traversal");
        b1.preOrder(b1.root);
        
        System.out.println();
        System.out.println("PostOrder Traversal");
        b1.postOrder(b1.root);
        System.out.println();
        System.out.println("Inoder Traversal");
        b1.inOrder(b1.root);
        System.out.println();
        System.out.println(b1.height(b1.root));
        
	}

}
