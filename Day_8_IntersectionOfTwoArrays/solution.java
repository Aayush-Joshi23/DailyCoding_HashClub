package Day_8_IntersectionOfTwoArrays;
import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> n1 = new HashSet<Integer>();
        HashSet<Integer> n2 = new HashSet<Integer>();
        HashSet<Integer> fn = new HashSet<Integer>();
        
        for(int n: nums1)
        {
            n1.add(n);
        }
        for(int n: nums2)
        {
            n2.add(n);
        }
        
        ArrayList<Integer> nn1 = new ArrayList<>(n1);
        ArrayList<Integer> nn2 = new ArrayList<>(n2);

        Collections.sort(nn1);
        Collections.sort(nn2);
        
        
        for(int n: nn1)
        {
            for(int m: nn2)
            {
                if(n==m)
                {
                    fn.add(n);
                    break;
                }
            }
        }
        ArrayList<Integer> fnn = new ArrayList<>(fn);

        int arr[] = new int[fn.size()];
        for(int i=0;i<fnn.size();i++)
        {
            arr[i] = fnn.get(i);
        }
        return arr;
    }
}