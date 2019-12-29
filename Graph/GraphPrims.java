/*package whatever //do not write package name here */

import java.io.*;

class GraphPrims {
    public static int findMin(int[] weights,boolean[] visit,int v)
    {
        int min_index=-1,min=Integer.MAX_VALUE;
        for(int i=0;i<v;i++)
        {
            if(!visit[i]&&weights[i]<min)
            {
                min=weights[i];
                min_index=i;
            }
        }
        return min_index;
    }
    public static void PrimsAlgo(int[][] graph,int V)
    {
        int[] parent=new int[V];
        int[] weights=new int[V];
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++)
        {
            parent[i]=-1;
            weights[i]=Integer.MAX_VALUE;
        }
        parent[0]=-1;
        weights[0]=0;
        for(int i=0;i<V-1;i++)
        {
            int u=findMin(weights,vis,V);
            vis[u]=true;
            for(int j=0;j<V;j++)
            {
                if(!vis[j]&&graph[u][j]!=0&&graph[u][j]<weights[j])
                {
                    parent[j]=u;
                    weights[j]=graph[u][j];
                }
            }
        }
        
        printSol(graph,parent,V);
    }
    public static void printSol(int[][] graph,int[] parent,int V)
    {
        for(int i=1;i<V;i++)
        {
            System.out.println(parent[i]+"-"+i+" : "+graph[i][parent[i]]);
        }
    }
	public static void main (String[] args) {
	    int V=5;
		int graph[][] = { { 0, 2, 0, 6, 0 },  
                        { 2, 0, 3, 8, 5 },  
                        { 0, 3, 0, 0, 7 },  
                        { 6, 8, 0, 0, 9 },  
                        { 0, 5, 7, 9, 0 } };
        PrimsAlgo(graph,V);
	}
}