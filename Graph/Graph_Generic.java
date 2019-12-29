/*package whatever //do not write package name here */

import java.util.*;
class Graph<T>
{
    int V;
    HashMap<T,LinkedList<T>> map=new HashMap<>();
    Graph()
    {
        
    }
    // Graph(int v)
    // {
       
    //   V=v;
    //   adj=new LinkedList[v];
    //   for(int i=0;i<v;i++)
    //   {
    //       adj[i]=new LinkedList<>();
    //   }
    // }
    void addEdge(T u,T v)
    {
       if(!map.containsKey(u)&&!map.containsKey(v))
       {
           LinkedList<T> l1=new LinkedList<>();
            LinkedList<T> l2=new LinkedList<>();
           l1.add(v);
           l2.add(u);
           map.put(u,l1);
           map.put(v,l2);
       }
       else if(map.containsKey(v)&&map.containsKey(u))
       {
           LinkedList<T> l=map.get(v);
           l.add(u);
           map.put(v,l);
           l=map.get(u);
           l.add(v);
           map.put(u,l);
       }
       else if(map.containsKey(v))
       {
           LinkedList<T> l=map.get(v);
           l.add(u);
           map.put(v,l);
           LinkedList<T> l2=new LinkedList<>();
           l2.add(v);
           map.put(u,l2);
       }
       
       else
       {
           LinkedList<T> l=map.get(u);
           l.add(v);
           map.put(u,l);
           LinkedList<T> l2=new LinkedList<>();
           l2.add(u);
           map.put(v,l2);
           
       }
     //  System.out.println(map);
    }
    void traversal()
    {
        for(Map.Entry<T,LinkedList<T>> entry:map.entrySet())
        {
          System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
     void bfs(T src)
    {
        Queue<T> q=new LinkedList<>();
         HashMap<T,Boolean> vis=new HashMap<>();
        q.add(src);
        vis.put(src,true);
        while(!q.isEmpty())
        {
            T x=q.poll();
            System.out.print(x+"->");
            LinkedList<T> it=map.get(x);
            for(T lm:it)
            {
                if(!vis.containsKey(lm)||!vis.get(lm))
                {
                    q.add(lm);
                    vis.put(lm,true);
                }
            }
        }
    }
    // void dfsUtil(int x,boolean[] vis)
    // {   System.out.print(x+"->");
    //     vis[x]=true;
    //     ListIterator<Integer> it=adj[x].listIterator();
    //     while(it.hasNext())
    //     {
    //         int l=it.next();
    //         if(!vis[l])
    //         {
    //             dfsUtil(l,vis);
    //         }
    //     }
    // }
    // void dfs(int src)
    // {
    //     boolean[] vis=new boolean[V];
    //     dfsUtil(src,vis);
    // }

}
class Graph_Generic {
	public static void main (String[] args) {
	Graph<String> g1=new Graph<>();
	g1.addEdge("Aman","Raman");
	g1.addEdge("Aman","Radha");
	g1.addEdge("Aman","Seeta");
	g1.addEdge("Aman","Geeta");	
	g1.addEdge("Seeta","Geeta");
		g1.addEdge("Seeta","Radha");
		g1.addEdge("Raman","Geeta");
		g1.traversal();
    g1.bfs("Aman");
	}
}