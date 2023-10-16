class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int ec) {
        int max=0;
        for(int i:candies)
        {
            max=Math.max(i,max);
        }
        List<Boolean>a=new ArrayList<>();
        for(int i:candies)
        {
            if(i+ec>=max)
                a.add(true);
            else
                a.add(false);
        }
        return a;
    }
}
