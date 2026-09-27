class Solution {
    public String removeDuplicates(String s) {
     Stack<Character> st = new Stack<>();
   int n = s.length();
   int i;
   StringBuilder res = new StringBuilder();
   for(i=0;i<n;i++){
    if(st.empty()){
        st.push(s.charAt(i));
        continue;
    }
    if(st.peek()==s.charAt(i)){
        st.pop();
        continue;
    }
    st.push(s.charAt(i));
   }
   while(!st.empty()){
     res.append(st.pop());
   
   }
     return res.reverse().toString();

}
}