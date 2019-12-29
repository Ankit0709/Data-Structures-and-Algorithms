/*package whatever //do not write package name here */

import java.util.*;
class Edges implements Comparable<Edges>
{
    int src;
    int dest;
    int weight;
    
    Edges(int s,int d,int w)
    {
        src=s;
        dest=d;
        weight=w;
    }
      public int compareTo(Edges e)
            {
                return this.weight-e.weight;
            }
}
class GraphMSTAlgo {
    public static int findParent(int node,int[] parent)
    {
        if(parent[node]==node)
        return node;
        
        return findParent(parent[node],parent);
    }
    public static void Krushkal(Edges[] e,int E,int V)
    {
        Edges[] output=new Edges[V-1];
        int count=0;
        int j=0;
        Arrays.sort(e);
      
        int[] parent=new int[V];
        for(int i=0;i<V;i++)
        {
            parent[i]=i;
        }
        while(count!=V-1)
        
        {
            int parentsrc=findParent(e[j].src,parent);
            int parentdest=findParent(e[j].dest,parent);
            if(parentdest!=parentsrc)
            {
                output[count++]=e[j];
                parent[parentsrc]=parentdest;
            }
            j++;
        }
        for(int i=0;i<V-1;i++)
        {
            System.out.println(output[i].src+" : "+output[i].dest+" : "+output[i].weight);
        }
    }
	public static void main (String[] args) {
		int v=5;
		int E=6;
		int[][] arr={{0,1,2},{0,3,3},{1,3,1},{1,2,5},{3,4,8},{2,4,6}};
		Edges[] input=new Edges[E];
		for(int i=0;i<E;i++)
		{
		    input[i]=new Edges(arr[i][0],arr[i][1],arr[i][2]);
		    
		}
		Krushkal(input,E,v);
		
	}
}