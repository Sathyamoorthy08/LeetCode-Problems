class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        s=s.trim();
        if(s.isEmpty()) return 0;
        int i = 0,n=s.length();
        int res = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        if(s.charAt(0)=='-')
        {
            sign = -1;
            i++;
        }
        else if(s.charAt(0) == '+'){i++;}
        while(i<n)
        {
            char a = s.charAt(i);
            if(a<'0' || a > '9')    break;
            if(res>max/10 && sign ==1 ||(res == max/10 && sign==1 && (a-'0')>=7)) return max;
            else if(res>max/10 && sign ==-1 ||(res == max/10 && sign==-1 && (a-'0')>=8)) return min; 
            res = (res*10)+(a-'0');
            i++;
        }
        return res*sign;
    }
}