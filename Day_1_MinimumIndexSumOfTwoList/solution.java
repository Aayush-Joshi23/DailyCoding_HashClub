class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        int i, j;
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(i=0; i<list1.length; i++)
        {
            for(j=0; j<list2.length; j++)
            {
                if(list1[i].equals(list2[j]) )
                {
                    str.add(list1[i]);
                    arr.add(i+j);
                    break;
                }
            } 
        }
        int min = arr.get(0);
        ArrayList<String> st2 = new ArrayList<String>();
        i=0;
        int c = 0;
        for(int n: arr)
        { 
            if(n<min)
            {
                st2.add(str.get(c));
                min = n;
                i++;
            }
            c += 1;
        }
        if(i==0)
        {
            c = 0;
            for(int n: arr)
            { 
                if(n==min)
                {
                    st2.add(str.get(c));
                    min = n;
                }
            c += 1;
            }
        }
        String stt[] = new String[st2.size()];
        i = 0;
        for(String s: st2)
        {
            stt[i] = s;
            i++;
        }
        return stt;
        
    }
    
    
}