/*package whatever //do not write package name here */

import java.util.*;
class Graph
{
    int V;
    
     public static  void bellmonFord(int graph[][],int V,int E,int src)
    {
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        dist[src]=0;
        for(int i=0;i<V-1;i++)
        {
            for(int j=0;j<E;j++)
            {
                if(dist[graph[j][1]]>dist[graph[j][0]]+graph[j][2])
                {
                    dist[graph[j][1]]=dist[graph[j][0]]+graph[j][2];
                }
            }
        }
        for(int i=0;i<V;i++)
        {
           System.out.println("Distance from src "+src+" to dest "+i+" is :"+dist[i]);
        }
    }
    
}
class BellmonFordAlgo {
	public static void main (String[] args) {
	    int V=5;
	    int E=8;
	   int[][] graph= { { 0, 1, -1 }, { 0, 2, 4 }, 
                       { 1, 2, 3 }, { 1, 3, 2 },  
                       { 1, 4, 2 }, { 3, 2, 5 },  
                       { 3, 1, 1 }, { 4, 3, -3 } }; 
    Graph g=new Graph();
    g.bellmonFord(graph,V,E,0);
	}
}