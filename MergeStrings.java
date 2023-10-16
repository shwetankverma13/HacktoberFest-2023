class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int i=0;
        int l1=word1.length();
        int l2=word2.length();
        while(i<l1 && i<l2)
        {
            s=s+word1.charAt(i)+word2.charAt(i);
            i++;
        }
        while(i<l1)
        {
            s=s+word1.charAt(i);
            i++;
        }
        while(i<l2)
        {
            s=s+word2.charAt(i);
            i++;
        }
        return s;
    }
}
