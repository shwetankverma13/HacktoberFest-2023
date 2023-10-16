class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int prev=0;
        if(f[0]==0)
            prev=-2;
        int ans=0;
        for(int i=0;i<f.length;i++)
        {
            if(f[i]==1 && i!=prev)
            {
                ans+=((i-prev-1)-1)/2;
                prev=i;
            }
        }
        if(f[f.length-1]==0)
            ans+=((f.length-prev)-1)/2;
        if(ans>=n)
            return true;
        return false;
    }
}
