package Day_5_ShuffleString;

import java.util.ArrayList;

class Solution {
    public String restoreString(String s, int[] indices) {
        
        int i, index =0;
        String str ="";
        ArrayList<Integer> n = new ArrayList<Integer>();
        
        for(i=0;i<s.length();i++)
        {
            n.add(indices[i]);
        }
        
        for(i=0;i<s.length();i++)
        {
            index = n.indexOf(i);
            str += s.charAt(index);
            
            // System.out.println(index);
        }
        return str;
    }
}