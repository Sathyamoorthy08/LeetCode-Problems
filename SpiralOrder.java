class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top = 0,bottom = matrix.length-1,left = 0, right = matrix[0].length-1,i,j;
        while(top<=bottom && left<=right)
        {
            i = left;j=right;
            while(i<=j)
            {
                res.add(matrix[top][i]);
                i++;
            }
            top++;
            i = top;j=bottom;
            while(i<=j)
            {
                res.add(matrix[i][right]);i++;
            }
            right--;
            if(top<=bottom)
            {
                i = right;j=left;
                while(i>=j)
                {
                    res.add(matrix[bottom][i]);i--;
                }
                bottom--;
            }
            if(left<=right)
            {
                i = bottom;j = top;
                while(i>=j)
                {
                    res.add(matrix[i][left]);i--;
                }
                left++;
            }
        }
        return res;
    }
}
