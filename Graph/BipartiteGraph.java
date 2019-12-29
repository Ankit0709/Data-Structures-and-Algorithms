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
     boolean isBapartite(int src)
    {
        int[] colors=new int[V];
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[V];
        q.add(src);
        vis[src]=true;
        colors[src]=1;
        while(!q.isEmpty())
        {
            int x=q.poll();
           // System.out.print(x+"->");
            ListIterator<Integer> it=adj[x].listIterator();
            while(it.hasNext())
            {
                int l=it.next();
                if(!vis[l])
                {
                    q.add(l);
                    vis[l]=true;
                    colors[l]=1-colors[x];
                }
                else if(colors[l]==colors[x])
                return false;
            }
        }
        return true;
    }
}
class BipartiteGraph
{
    public static void main (String[] args) {
        Graph g=new Graph(3);
        g.addEdge(0,1);
        g.addEdge(1,2);
      //  g.addEdge(2,0);
        System.out.println(g.isBapartite(0));
    }
}