/*package whatever //do not write package name here */

import java.util.*;
class Graph<T>
{
    HashMap<T,LinkedList<T>> adj=new HashMap<>();
    void addEdge(T src,T dest)
    { LinkedList<T> x;
    //LinkedList<T> y;
    
        if(adj.containsKey(src))
        {
           x=adj.get(src);
           
        }
         else
        {
            x=new LinkedList<>();
            
        }
        // if(adj.containsKey(dest))
        // {
        //     y=adj.get(dest);
        // }
        // else
        // {
        //     y=new LinkedList<>();
        // }
       
         x.add(dest);
       //  y.add(src);
        adj.put(src,x);
        adj.put(dest,new LinkedList<>());
    }
    void printAdj()
    {
        for(Map.Entry<T,LinkedList<T>> entry:adj.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    void dfsHelper(T node,HashMap<T,Boolean> state,LinkedList<T> order)
    {
        state.put(node,true);
        
        ListIterator<T> it=adj.get(node).listIterator();
        while(it.hasNext())
        {
            T neigh=it.next();
            if(!state.get(neigh))
            {
                dfsHelper(neigh,state,order);
            }
        }
        //add it in list
        order.addFirst(node);
        
    }
    void dfs()
    {
        HashMap<T,Boolean> state=new HashMap<>();
        LinkedList<T> order=new LinkedList<>();
        for(Map.Entry<T,LinkedList<T>> entry:adj.entrySet())
        {
            state.put(entry.getKey(),false);
        }
        for(Map.Entry<T,LinkedList<T>> entry:adj.entrySet())
        {
            T x=entry.getKey();
            if(!state.get(x))
            {
                dfsHelper(x,state,order);
            
            }
            
        }
        printSolution(order);
       
    }
     public  void printSolution(LinkedList<T> order)
     {
         for(T x:order)
         {
             System.out.print(x+"-> ");
         }
     }
}
class TopologicalSort {
	public static void main (String[] args) {
		Graph<String> g=new Graph<>();
		g.addEdge("English","HTML");
		g.addEdge("Maths","Programming Logic");
		g.addEdge("English","Programming Logic");
		g.printAdj();
		g.dfs();
		
	}
}