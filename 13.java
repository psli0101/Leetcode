class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int sum = 0;
        char[] array = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            int v1 = map.get(array[i]);
            if(i+1 == s.length()) {
                sum = sum + v1;
            } else {
                int v2 = map.get(array[i+1]);
                if(v2 > v1) {
                    sum = sum + v2 - v1;
                    i++;
                } else {
                    sum = sum + v1;
                }
            }
            
        }
        return sum;
    }
}