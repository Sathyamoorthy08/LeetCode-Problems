class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(need1 == 0 && need2 ==0){return 0;}
        long min1,min2,minb=0;
        long res=0;
        if(cost1+cost2>=costBoth)
        {
            minb = costBoth;
        }
        else minb = cost1+cost2;
        if(cost1<=costBoth)  min1 = cost1;
        else min1 = costBoth;
        if(cost2<=costBoth) min2 = cost2;
        else min2 = costBoth;
        if(need1>need2)
        {
            res+=need2*minb;
            need1-=need2;need2=0;
        }
        else
        {
            res+=need1*minb;
            need2-=need1;need1=0;
        }
        res = res+need1*min1;
        res = res+need2*min2;
        return res;
    }
}