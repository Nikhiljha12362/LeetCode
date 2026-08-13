class Solution {
    public int maxProduct(int n) {
       int largeDigit = Integer.MIN_VALUE;
       int SecondLargeDigit = Integer.MIN_VALUE;
       while(n>0){
        int digit = n%10;
         n = n/10;
          if(digit>largeDigit){
         SecondLargeDigit = largeDigit;
         largeDigit = digit;

}
else if(digit> SecondLargeDigit){
   
    SecondLargeDigit = digit;
}

       }
   
      return  largeDigit* SecondLargeDigit;

    }
}