class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int a[]=new int[spells.length];
        long ans=0l;
        for(int i=0;i<spells.length;i++)
        {
            long x=(long)Math.ceil(success/(double)spells[i]);
            //System.out.println(x);
            int y=lower_bound(potions,x);
            //System.out.println(y);
            if(y>=potions.length)
            {
                a[i]=0;
                continue;
            }
            ans=(long)potions[y]*(long)spells[i]*1l;
            //System.out.println(ans);
                if(ans>=success)
                {
                    a[i]=potions.length-y;
                }
            //System.out.println(a[i]);
        }
        return a;
    }
    static int lower_bound(int array[], long key)
    {
        int low = 0, high = array.length;
        int mid;
 
        while (low < high) {
 
            mid = low + (high - low) / 2;
 
            if (key <= array[mid]) {
                high = mid;
            }
            else {
 
                low = mid + 1;
            }
        }
        if (low < array.length && array[low] < key) {
            low++;
        }
 
        return low;
    }
}
