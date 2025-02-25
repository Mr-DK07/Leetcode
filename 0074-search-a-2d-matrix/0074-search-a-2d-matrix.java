class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        int start = 0;
        int end = (m * n) - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            int row = mid / m;
            int col = mid % m;

            if(matrix[row][col] == target){
                return true;
            }else if (target > matrix[row][col]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}