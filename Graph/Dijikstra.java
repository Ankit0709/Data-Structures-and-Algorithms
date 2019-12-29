/*package whatever //do not write package name here */

import java.util.*;
class Pair implements Comparable<Pair>
{
    int x;
    int w;
    Pair(int node,int cost)
    {
        x=node;
        w=cost;
    }
    public String toString()
    {
        return "["+x+" : "+w+"]";
    }
    public int compareTo(Pair p)
    {
        return this.x-p.x;
    }
}
class Graph
{
    int V;
    LinkedList<Pair> adj[];
    Graph(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<Pair>();
            
        }
    }
    void addEdge(int src,int dest,int cost)
    {  
        adj[src].add(new Pair(dest,cost));
	adj[dest].add(new Pair(src,cost));
    }
    void printAdj()
    {
        for(int i=0;i<V;i++)
        {
            System.out.println(i+" : "+adj[i]);
        }
    }
    void dijisktra(int src)
    {
        int dist[]=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        TreeSet<Pair> set=new TreeSet<>();
        dist[src]=0;
        set.add(new Pair(0,src));
        while(!set.isEmpty())
        {
            Pair rp=set.pollFirst();
            ListIterator<Pair> it=adj[rp.w].listIterator();
            while(it.hasNext())
            {
                 Pair xp=it.next();
                 if(dist[xp.x]>dist[rp.w]+xp.w)
                 {
                    Pair xo=new Pair(dist[xp.x],xp.x);
                     if(set.contains(xo))
                     {
                         set.remove(xo);
                     }
                     dist[xp.x]=dist[rp.w]+xp.w;
                     set.add(new Pair(dist[xp.x],xp.x));
                     
                      
                 }
            }
        }
        for(int i=1;i<V;i++)
        {
            System.out.println("Distance of "+i+" from src is : "+dist[i]);
        }
        
    }
}
class Dijikstra {
	public static void main (String[] args) {
		Graph g=new Graph(5);
		g.addEdge(1,2,1);
		g.addEdge(1,3,4);
		g.addEdge(1,4,7);
		g.addEdge(2,3,1);
		g.addEdge(3,4,2);
		g.printAdj();
		g.dijisktra(1);
	}
}