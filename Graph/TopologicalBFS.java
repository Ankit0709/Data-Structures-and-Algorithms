/*package whatever //do not write package name here */

import java.util.*;
class Graph
{
    int V;
    LinkedList[] adj;
    Graph(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<>();
        }
    }
    void addEdge(int src,int dest)
    { 
        adj[src].add(dest);
    }
    void printAdj()
    {
        for(int i=0;i<V;i++)
        {
            System.out.println(i+" : "+adj[i]);
        }
    }
   void topologicalBFS()
   {
      //boolean[] state=new boolean[v];
       Queue<Integer> q=new LinkedList<>();
      int[] indegree=new int[V];
       
       for(int i=0;i<V;i++)
        {
            ListIterator<Integer> it=adj[i].listIterator();
            while(it.hasNext())
            {
                int x=it.next();
                indegree[x]++;
            }
            
        }
          for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
              
            }
        }
        while(!q.isEmpty())
        {
            int x=q.poll();
            System.out.print(x+" -> ");
            ListIterator<Integer> it=adj[x].listIterator();
            while(it.hasNext())
            {
                int p=it.next();
                indegree[p]--;
                if(indegree[p]==0)
                {
                    q.add(p);
                }
            }
            
        }
        
        
        
   }
    //  public  void printSolution(LinkedList<T> order)
    //  {
    //      for(T x:order)
    //      {
    //          System.out.print(x+"-> ");
    //      }
    //  }
}
class TopologicalBFS {
	public static void main (String[] args) {
		Graph g=new Graph(6);
	    g.addEdge(0,1);
	    g.addEdge(1,4);
	    g.addEdge(4,3);
	    g.addEdge(4,2);
	    g.addEdge(1,2);
	    g.addEdge(2,5);
	    g.addEdge(3,5);
		g.printAdj();
		g.topologicalBFS();
		
	}
}