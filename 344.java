class Solution {
    public void afafsf(char[] s, int left, int right) {
        if(left >= right) return;
        char tmp = s[left];
        s[left] = s[right];
        s[right] = tmp;
        afafsf(s, left+1, right-1); // can't use ++ or -- in this answer
    }

    /**
    ++ and -- will run after s[left] and s[right] change

    public void afafsf(char[] s, int left, int right) {
        if(left >= right) return;
        char tmp = s[left];
        s[left++] = s[right];
        s[right--] = tmp;
        afafsf(s, left, right);
    }
     */
    
    public void reverseString(char[] s) {
        afafsf(s, 0, s.length-1);
    }
}
