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
     void bfs(int src)
    {
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[V];
        q.add(src);
        vis[src]=true;
        while(!q.isEmpty())
        {
            int x=q.poll();
            System.out.print(x+"->");
            ListIterator<Integer> it=adj[x].listIterator();
            while(it.hasNext())
            {
                int l=it.next();
                if(!vis[l])
                {
                    q.add(l);
                    vis[l]=true;
                }
            }
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
    void dfs(int src)
    {
        boolean[] vis=new boolean[V];
        dfsUtil(src,vis);
    }

}
class Graph_Implementation {
	public static void main (String[] args) {
	Graph g1=new Graph(5);
	g1.addEdge(0,1);
	g1.addEdge(0,2);
	g1.addEdge(1,2);
	g1.addEdge(1,3);
	g1.addEdge(1,4);
	g1.addEdge(3,4);
	g1.bfs(0);
	g1.dfs(0);
	g1.traversal();
	}
}