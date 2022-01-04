class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int i,j = 0;
        ArrayList<Integer> t = new ArrayList<Integer>();
        
        int arr[] = new int[n+1];// 0 1 2 3 
        Arrays.fill(arr, 0);
        
        if(n==1 )
        {
            return 1;
        }
        
        //[[1,3],[2,3],[3,1]]
        
        for(i=0; i< trust.length; i++)
        {
            t.add(trust[i][0]);  // [1, 2, 3]
            arr[ trust[i][1] ] += 1; // 0 1 2 3 
        }                            //[0 1 0 2]
        
        
        
        for(i=1; i<=n ; i++) // 1 - 3
        {
            if(!( t.contains(i) ) )
            {
                 j = i; //j ==0 
            }
        }

        
        
       
        if(j ==0)
        {
            return -1;
        }
        
        else 
        {
            int max = 0;
            
            for(i=0;i<arr.length; i++)
            {
                if(arr[i] >max )
                {
                    max = arr[i];
                    if(i == j)
                    {
                        return j;
                    }
                }
            }
        }
        return -1;
        
        
        
    }
}