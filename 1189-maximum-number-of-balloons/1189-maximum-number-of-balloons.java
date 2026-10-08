class Solution {
    public int maxNumberOfBalloons(String text) {
    int[]freq = new int[26];
    for(char ch : text.toCharArray()){
        freq[ch-'a']++;
    }
    int b = freq['b'-'a'];// it gives the frequency of  b=1 have/need b/1 means hmhe ek to pkka chayiye for making ballon
    int a = freq['a'-'a']; // a/1
    int l = freq['l'-'a']/2;
    int o = freq['o'-'a']/2;
    int n = freq['n'-'a'];
//    int ans =b;
//    Math.min(ans,a);
//    Math.min(ans,l);
//    Math.min(ans,o);
//    Math.min(ans,n);
//    return ans;
return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}