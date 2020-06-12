class Solution {
    public int majorityElement(int[] nums) {
        int x = nums.length / 2;
        int result = 0;
        Map <Integer, Integer> map = new HashMap();
        for(int i: nums) {
            if(!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        for(int key: map.keySet()) {
            if(map.get(key) > x) {
                result = key;
            }
        }
        return result;
    }
}