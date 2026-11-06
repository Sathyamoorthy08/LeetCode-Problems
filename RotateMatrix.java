class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i=0;i<matrix.length;i++)
        {
            reverse(matrix[i]);
        }
    }
    public static void reverse(int[] arr)
    {
        int i=0,j=arr.length-1;
        while(i<j)
        {
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j]=tem;
            i++;j--;
        }
    }
    public static void transpose(int[][] matrix)
    {
        int i=0,j=0;
        for(i=0;i<matrix.length-1;i++)
        {
            for(j=i+1;j<matrix.length;j++)
            {
                int tem = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=tem;
            }
        }
    }
}
