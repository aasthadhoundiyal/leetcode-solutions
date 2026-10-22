class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int low = 0;
        int high = row*col-1;

        while (low<=high){
            int mid = low + (high-low)/2 ;
            int value = matrix[mid/col][mid%col];
            if ( target==value){
                return true;
            }
            else if (value<target){
                 low = mid+1;
            }
            else if (value>target){
                 high = mid-1;
            }
        }
        return false;
        
    }
}