// Use HashMap
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        Map <Integer, Integer> map = new HashMap();
        for(int i: nums) {
            if(!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        for(int key: map.keySet()) {
            if(map.get(key) > 1) {
                flag = true;
            }
        }
        return flag;
    }
}

// Use sort()
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean flag = false;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i-1] == nums[i]) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}