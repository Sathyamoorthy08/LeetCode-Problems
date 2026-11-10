class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> res = new ArrayList<>();
        int len = s1.length();
        for(int i=0;i<len;i++)
        {
            List<String> tem = new ArrayList<>();
            if(s1.charAt(i) == s2.charAt(i)) continue;
            else{
                String str1="",str2="";
                while(i<len && s1.charAt(i)!=s2.charAt(i))
                {
                    str1+=s1.charAt(i);
                    str2+=s2.charAt(i);
                    i++;
                }
                tem.add(str1);
                tem.add(str2);
                res.add(tem);
            }
        }
        return res;
    }
}