/*package whatever //do not write package name here */

import java.util.*;
class Graph
{
    int V;
    LinkedList<Integer> adj[];
    Graph(int v)
    {
       
       V=v;
       adj=new LinkedList[v];
       for(int i=0;i<v;i++)
       {
           adj[i]=new LinkedList<>();
       }
    }
    void addEdge(int u,int v)
    {
        adj[u].add(v);
        adj[v].add(u);
    }
    void traversal()
    {
        for(int i=0;i<V;i++)
        {
            System.out.println(i+":"+adj[i]);
        }
    }
     boolean isCycle(int src)
    {
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[V];
		int[] parent=new int[V];
		q.add(src);
        vis[src]=true;
		parent[src]=-1;
        while(!q.isEmpty())
        {
            int x=q.poll();
          //  System.out.print(x+"->");
            ListIterator<Integer> it=adj[x].listIterator();
            while(it.hasNext())
            {
                int l=it.next();
				if(vis[l]&&l!=parent[x])
				return true;
                if(!vis[l])
                {
                    q.add(l);
					parent[l]=x;
                    vis[l]=true;
                }
            }
			
        }
		return false;
    }
	boolean dfsUtil(int node,boolean[] vis,int parent)
	{
		vis[node]=true;
		ListIterator<Integer> it=adj[node].listIterator();
        while(it.hasNext())
        {
            int l=it.next();
            if(!vis[l])
            {
                boolean ans=dfsUtil(l,vis,node);
				if(ans)
					return true;
            }
			else if(vis[l]&&l!=parent)
				return true;
        }
		return false;
		
	}
	void  dfsCycle(int src)
	{
		boolean[] vis=new boolean[V];
		if(dfsUtil(src,vis,src))
		{System.out.println("Cycle present");
		}
		else
	  {System.out.println("Cycle not present");}
	
			
	
	}
  
}
class Graph_Cycle {
	public static void main (String[] args) {
	Graph g1=new Graph(5);
	g1.addEdge(0,1);
	g1.addEdge(1,2);
	g1.addEdge(2,3);
	g1.addEdge(3,4);
	
	//g1.addEdge(4,0);
	//g1.bfs(0);
	//g1.dfs(0);
	g1.dfsCycle(0);
	//if(g1.isCycle(0))		
	//    System.out.println("Cycle present");
	//else 
	//	System.out.println("Cycle not present");
	//g1.traversal();
	}
}