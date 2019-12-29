package Tree;

class Height
{
	int h;
}
public class DiameterOfTree
{  static  int diameterOfTree(Node root,Height height)
	{
	  Height lh=new Height(),rh=new Height();
	   if(root==null)
	   {
		   height.h=0;
		   return 0;
		   
	   }
	   else
	   {
		   int dl=diameterOfTree(root.lchild,lh);
		   int dr=diameterOfTree(root.rchild,rh);
		   
		   height.h=Math.max(lh.h,rh.h)+1;
		   return Math.max(lh.h+ rh.h+1,Math.max(dl, dr));
		   
	   }
	
	
	}
static int diameter(Node root)
   {   Height h=new Height();
	   return diameterOfTree(root, h);
   }
    int height(Node root)
    {
    	if(root==null)
    		return  0;
    	else
    	{
    		return (1+Math.max(height(root.lchild),height(root.rchild)));
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
	t1.root.rchild.lchild.lchild=new Node(7);
	System.out.println(diameter(t1.root));
	System.out.println(Math.ceil(12.50));
	
		
	}

}
