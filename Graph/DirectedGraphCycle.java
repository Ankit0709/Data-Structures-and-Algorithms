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
        
    }
    boolean dfsUtil(int node,boolean[] vis,boolean[] recStack)
    {
        vis[node]=true;
        recStack[node]=true;
        
        ListIterator<Integer> it=adj[node].listIterator();
        while(it.hasNext())
        {
            int neigh=it.next();
            if(!vis[neigh])
            {
               return dfsUtil(neigh,vis,recStack);
            }
            else if(recStack[neigh])
            return true;
        }
        recStack[node]=false;
        return false;
    }
    boolean detectCycle()
    {
        boolean[] vis=new boolean[V];
        boolean[] recStack=new  boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!vis[i])
            return dfsUtil(i,vis,recStack);
        }
        return false;
    }
}
class GFG {
	public static void main (String[] args) {
	
	Graph g1=new Graph(5);
	g1.addEdge(0,1);
	g1.addEdge(0,2);
	g1.addEdge(1,2);
   // g1.addEdge(2,0);
    g1.addEdge(2,3);
   // g1.addEdge(3,3);
	System.out.println(g1.detectCycle());
	}
}