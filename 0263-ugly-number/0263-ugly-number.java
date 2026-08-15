class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
    while(n%2==0){  // these are the remove condition see if in the question certain factor are allowed then remove that factor by writing this
        n= n/2;
    }
    while(n%3==0){
        n = n/3;
    }
    while(n%5==0){
        n = n/5;  
    }
    return n==1;
}
}
 // Nootes for this pattern Question mein:
// "Only certain factors allowed"

//         ↓

// Repeatedly divide/remove those allowed factors

//         ↓

// Check what's left
