class Solution {
    public int singleNumber(int[] nums) {
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
            if(map.get(key) < 2) {
                result = key;
            }
        }
        return result;
    }
}

// Note
// Reference: https://leetcode.com/problems/single-number/discuss/43222/Java-solution-using-XOR
// Use XOR to find the single number, any number xor itself will be 0
/**
class Solution {
  public int singleNumber(int[] nums) {
    int ans = 0;
    for(int i: nums) {
      ans ^= i;
    }
    return ans;
  }
}
 */
