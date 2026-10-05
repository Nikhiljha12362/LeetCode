class Solution {
    class pair{
        char ch;
        int count;
    
    pair(char ch,int count){
        this.ch =ch;
        this.count = count;
    }
    }
    public String removeDuplicates(String s, int k) {
        Stack<pair>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(new pair(c,1));
            }else if(st.peek().ch!=c){
                st.push(new pair(c,1));
            }else{
                st.peek().count++;
                if(st.peek().count == k){
                    st.pop();
                }
            }

           
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            pair p = st.pop();
            for(int i=0;i<p.count;i++){
                ans.append(p.ch);
            }
        }
       return ans.reverse().toString(); 
    }
}