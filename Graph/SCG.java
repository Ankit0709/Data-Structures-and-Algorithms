/*package whatever //do not write package name here */

import java.io.*;
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
    LinkedList<Integer>[] reverseGraph(LinkedList<Integer> adj[])
    {
        LinkedList<Integer> newadj[]=new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            newadj[i]=new LinkedList<>();
        }
        for(int i=0;i<V;i++)
        {
            ListIterator<Integer> it=adj[i].listIterator();
            while(it.hasNext())
            {
                int l=it.next();
                newadj[l].add(i);
            }
        }
        return newadj;
    }
    boolean KosarajuAlgo(int src)
    {
        boolean[] vis=new boolean[V];
        dfsUtil(src,vis);
        int x=0;
        for(int i=0;i<V;i++)
        {
            if(vis[i])
            x++;
            vis[i]=false;
        }
          if(x!=V)
        return false;
        System.out.println(x);
        adj=reverseGraph(adj);
        traversal();
        dfsUtil(src,vis);
        x=0;
        for(int i=0;i<V;i++)
        {
            if(vis[i])
            x++;
            vis[i]=false;
        }
        
        System.out.println(x);
        if(x!=V)
        return false;
        
        else
        return true;
        
        
    }
    void dfsUtil(int x,boolean[] vis)
    { 
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
   
    void traversal()
    {
        for(int i=0;i<V;i++)
        {
            System.out.println(i+":"+adj[i]);
        }
    }
}
class SCG {
	public static void main (String[] args) {
		Graph g=new Graph(6);
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(4,5);
		g.addEdge(5,3);
		g.addEdge(3,0);
		System.out.println(g.KosarajuAlgo(0));
	}
}