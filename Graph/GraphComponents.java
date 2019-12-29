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
   
    void dfsUtil(int x,boolean[] vis)
    {   System.out.print(x+"->");
        vis[x]=true;
        ListIterator<Integer> it=adj[x].listIterator();
        while(it.hasNext())
        {
            int l=it.next();
            if(!vis[l])
            {
                dfsUtil(l,vis);
            }
        }
    }
    int dfs(int src)
    {
        boolean[] vis=new boolean[V];
        dfsUtil(src,vis);
		System.out.println();
		int components=1;
		for(int i=0;i<V;i++)
		{
			if(!vis[i])
			{
				dfsUtil(i,vis);
				components++;
			}
		}
		return components;
		
    }

}
class GraphComponents {
	public static void main (String[] args) {
	Graph g1=new Graph(9);
	g1.addEdge(0,1);
	g1.addEdge(0,2);
	g1.addEdge(1,2);
	g1.addEdge(1,3);
	g1.addEdge(1,4);
	g1.addEdge(3,4);
	g1.addEdge(5,6);
	g1.addEdge(7,8);
	//g1.bfs(0);
	System.out.println("Components of Graph="+g1.dfs(0));
	g1.traversal();
	}
}