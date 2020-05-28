class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        // remove zero
        for(int i = 0; i < nums.length; i++) {
            int n = nums[i]; 
            if(n != 0){
                nums[index] = n; 
                index++;
            }
        }
        
        // add zero
        for(int j = index; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}