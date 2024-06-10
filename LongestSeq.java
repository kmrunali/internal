import java.util.*;
public class LongestSeq{
    public static int longestseq(int []arr)
    {
        int n=arr.length;
        if(n==0)return 0;
        int longest=1;
        Set<Integer>st=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            st.add(arr[i]);
        }
        for(int it:st)
        {
            if(!st.contains(it-1))
            {
                int cnt=1;
                int x=it;
                while(st.contains(x+1))
                {
                    x+=1;
                    cnt+=1;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
    public static void main(String [] args)
    {
        int[] arr={100,101,1,2,3,4};
        
        int ans = longestseq(arr);
        System.out.println(ans);
    }
}