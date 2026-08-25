class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);

        int curr = k;

        for (int num : nums) {
            if (num == curr) {
                curr += k;
            }
        }

        return curr;
    }
}