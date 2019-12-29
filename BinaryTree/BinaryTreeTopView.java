package Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

public class BinaryTreeTopView 
{
	static void TopView(Node root)
	{
		if(root==null)
		{
			return;
		}
		Map<Integer,Node> h1=new TreeMap<Integer,Node>();
		
		Queue<Pair> q1=new LinkedList<Pair>();
		int hd=0;
		q1.add(new Pair(root,hd));
		while(!q1.isEmpty())
		{
			Pair pair=q1.poll();
			if(!h1.containsKey(pair.distance))
			{
				h1.put(pair.distance,pair.node);
			}
			if(pair.node.lchild!=null)
				q1.add(new Pair(pair.node.lchild,pair.distance-1));
			if(pair.node.rchild!=null)
				q1.add(new Pair(pair.node.rchild,pair.distance+1));
		}
		for(Entry<Integer, Node> entry:h1.entrySet())
		{
			System.out.println(entry.getValue().data);
		}
		
		
	}
	
	static void printInVertical(Node root)
	{
		if(root==null)
			return;
		Queue<Pair> queue=new LinkedList<Pair>();
		Map<Integer,Node> map=new TreeMap<Integer,Node>();
		queue.add(new Pair(root,0));
		while(!queue.isEmpty())
		{
			Pair pair=queue.poll();
			map.put(pair.distance,pair.node);
			if(pair.node.lchild!=null)
			{
				queue.add(new Pair(pair.node.lchild,pair.distance-1));
				
			}
			if(pair.node.rchild!=null)
			{
				queue.add(new Pair(pair.node.rchild,pair.distance+1));
			}
					
		}
		for(Map.Entry<Integer,Node> entry:map.entrySet())
		{
			System.out.print(entry.getValue().data+" ");
		}
		

	}
	public static void main(String[] args) 
	{
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(1);
		tree.root.lchild=new Node(2);
		tree.root.rchild=new Node(3);
	
		tree.root.lchild.rchild=new Node(4);
		tree.root.lchild.rchild.rchild=new Node(5);
		tree.root.lchild.rchild.rchild.rchild=new Node(6);
		
		//TopView(tree.root);
		printInVertical(tree.root);
		
	}

}
 class Pair
{  Node node;
  int distance;
	Pair(Node node,int distance)
	{this.node=node;
	this.distance=distance;
	
	}
}
