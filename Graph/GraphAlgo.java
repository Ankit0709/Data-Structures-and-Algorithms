/*package whatever //do not write package name here */

import java.io.*;

public class GraphAlgo {
    public static void floydWarshall(int[][] graph,int v)
    {
        int[][] dist=new int[v][v];
        for(int i=0;i<v;i++)
        {
            for(int j=0;j<v;j++)
            {
                if(i==j)
                {
                    dist[i][j]=0;
                    continue;
                }
                if(graph[i][j]==0)
                {dist[i][j]=Integer.MAX_VALUE;
                    continue;
                }
                else
                {
                    dist[i][j]=graph[i][j];
                }
                
                
            }
        }
      //  printSolution(dist,v);
        //System.out.println();
        //Interamediate nodes
        for(int k=0;k<v;k++)
        {
            
            // src node
            for(int i=0;i<v;i++)
            {
                //src to dest paths
                for(int j=0;j<v;j++)
                {
                    if(i!=j&&dist[i][k]!=Integer.MAX_VALUE&&dist[k][j]!=Integer.MAX_VALUE&& dist[i][j]>dist[i][k]+dist[k][j])
                    {
                        dist[i][j]=dist[i][k]+dist[k][j];
                    }
                }
            }
           
        }
      printSolution(dist,v);
    }
    public static void printSolution(int[][] dist,int v)
    {
        for(int i=0;i<v;i++)
        {
          //  System.out.println("Shortest Distance from src "+i);
            for(int j=0;j<v;j++)
            {
                if(dist[i][j]==Integer.MAX_VALUE)
                System.out.print("INF"+"\t");
                else
                System.out.print(dist[i][j]+"\t");
                
            }
            System.out.println();
        }
    }
	public static void main (String[] args) {
	    int v=4;
	   int[][] graph={{0,0,-2,0},{4,0,3,0},{0,0,0,-2},{0,-1,0,0}};
	   floydWarshall(graph,v);
	   
	}
}