/*package whatever //do not write package name here */

import java.util.*;

class TravellingSalesmanProblem {
    
    
    public static int TSP(int[][] graph,int mask,int pos,int VISITED_ALL,int n,int[][] dp)
    {
        if(mask==VISITED_ALL)
        {
            return dp[mask][pos]=graph[pos][0];
        }
        if(dp[mask][pos]!=-1)
        {
            return dp[mask][pos];
        }
         int ans=Integer.MAX_VALUE;
        for(int city=0;city<n;city++)
        {
            if((mask&(1<<city))==0)
            {
                int newans=graph[pos][city]+TSP(graph,mask|(1<<city),city,VISITED_ALL,n,dp);
                ans=Math.min(ans,newans);
            }
        }
        return dp[mask][pos]=ans;
    }
	public static void main (String[] args) {
	    int n=4;
		int[][] graph={ {0,20,32,25},
		                {20,0,30,34},
		                {32,30,0,10},
		                {25,34,10,0}};
		 int VISITED_ALL=(1<<n)-1;
		 int[][] dp=new int[(1<<n)][n];
		  for(int i=0;i<=VISITED_ALL;i++)
		  {
		      for(int j=0;j<n;j++)
		      {dp[i][j]=-1;}
		  }
		 System.out.println(System.nanoTime());
		 System.out.println("Travelling Salesman Distance = "+TSP(graph,1,0,VISITED_ALL,n,dp));
		 System.out.println(System.nanoTime());
		                
}
}