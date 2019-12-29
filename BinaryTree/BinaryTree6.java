package Tree;

public class BinaryTree6 
{
	public  static boolean printAncestors(Node root, int key) 
	{
		if(root==null)
			return false;
		if(root.data==key)
			return true;
		if(printAncestors(root.lchild, key)||printAncestors(root.rchild, key))
		{
			System.out.print(root.data+"\t");
			return true;
			
		}
		return false;
			
		
		
	}
	static void printNodesAtGivenLevel(Node root,int level)
	{
		if(root==null)
			return;
		if(level==0)
		{
			System.out.print(root.data+"\t");
			return;
		}
		printNodesAtGivenLevel(root.lchild, level-1);
		printNodesAtGivenLevel(root.rchild, level-1);
		
	}
	
	public static void main(String[] args) 
	{
		BinaryTree t1=new BinaryTree();
		t1.root=new Node(10);
		t1.root.lchild=new Node(20);
		t1.root.rchild=new Node(30);
		t1.root.lchild.lchild=new Node(40);
		t1.root.lchild.rchild=new Node(50);
		
		//printAncestors(t1.root,40);
		//printNodesAtGivenLevel(t1.root,2);
		
	
}


}
