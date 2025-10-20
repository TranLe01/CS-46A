class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    int [] result = new int[2];
                    result[0] = i;
                    result [1] = j;
                    return result;
                }
            }
        }
        return new int[0];
    }
    public static void main(String[]args){
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9; 
        int[] result = sol.twoSum(nums, target);
        System.out.println(result[0] + "," + result[1]);
        
    }
}