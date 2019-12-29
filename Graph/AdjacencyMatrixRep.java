/*package whatever //do not write package name here */

import java.io.*;

public class AdjacencyMatrixRep {
    public static int minNode(boolean[] spset,int[] dist)
    {
        int max=Integer.MAX_VALUE;int node=-1;
        for(int i=0;i<4;i++)
        {
            if(!spset[i]&&dist[i]<max)
            {
                max=dist[i];
                node=i;
                
            }
        }
      //  System.out.println(node);
        return node;
    }
    public static void dijkstra(int[][] graph,int src)
    {
        boolean[] spset=new boolean[5];
        int[] dist=new int[5];
        for(int i=0;i<5;i++)
        {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[src]=0;
        
        for(int i=0;i<5;i++)
        {
            int u=minNode(spset,dist);
            if(u!=-1)
            {spset[u]=true;
            
            for(int v=0;v<5;v++)
            {
                 //System.out.println(dist[v]);
                if(!spset[v]&&graph[u][v]!=0&&dist[u]!=Integer.MAX_VALUE
                &&dist[u]+graph[u][v]<dist[v])
                {
                    dist[v]=dist[u]+graph[u][v];
                   
                }
            }
            }
            
            
        }
      System.out.println("Distance from src is:");
        for(int i=0;i<5;i++)
        {   if(i!=0)
            System.out.println(i+" : "+dist[i]);
        }
    }
	public static void main (String[] args) {
//	 Scanner s=new Scanner(System.in);
    int[][] g={{0,0,0,0,0},{0,0,1,4,2},{0,0,0,1,0},{0,0,0,0,2},{0,0,0,0,0}};
    dijkstra(g,1);
    
    
               
    
	 
	}
}