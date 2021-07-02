class Solution {
    public int minimumLength(String s) {
        if(s.length()==1){
            return 1;
        }
        int i=0;
        int j = s.length()-1;
        while(i<j){
            char chi = s.charAt(i);
            char chj = s.charAt(j);
            if(chi==chj){
                while(i<j && s.charAt(i) == s.charAt(i+1)){
                    i++;
                }
                while(i<j && s.charAt(j) == s.charAt(j-1)){
                    j--;
                }
                i++;
                j--;
            }else{
               return j-i+1;
            }
            
        }
        return j==i?1:0 ;
        
    }
}
