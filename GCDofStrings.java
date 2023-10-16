class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!((str1+str2).equals(str2+str1)))
            return "";
        int hcf=gcd(str1.length(),str2.length());
        return str1.substring(0,hcf);
    }
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    public String gcdOfStrings1(String str1, String str2) {
        int l1=str1.length();
        int l2=str2.length();
        String s1=l1<l2?str1:str2;
        String s2=l1<l2?str2:str1;
        String s3=s1+"";
        String x,y;
        x=y="";
        while(s3.length()>0)
        {
            while((s3+x).length()<s1.length())
                x+=s3;
            while((s3+y).length()<s2.length())
                y+=s3;
            if((s3+x).equals(s1) && (s3+y).equals(s2))
            return s3;
            s3=s3.substring(0,s3.length()-1);
            x=y="";
        }
        return "";
    }
}
