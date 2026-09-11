class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int ma = Integer.MIN_VALUE;
        for (int i=0 ; i<height.length ; i++){
            int currHeight = Math.min(height[left],height[right]);
            int ca = currHeight*(right-left);
            ma = Math.max(ma,ca);
            if (height[left] > height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return ma;

        
    }
}