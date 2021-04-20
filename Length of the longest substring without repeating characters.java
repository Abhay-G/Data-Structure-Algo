class Solution{
    int longestUniqueSubsttr(String s){
         HashMap<Character,Integer> map = new HashMap<>();
         
         int i=0,j=0;
         int maxlen = 0;
         while(j<s.length()){
             char ch = s.charAt(j);
             if(map.containsKey(ch)){
                 map.put(ch,map.get(ch)+1);
             }
             else{
                 map.put(ch,1);
             }
            
             if(map.size()==j-i+1){
                 if(maxlen<j-i+1){
                     maxlen = j-i+1;
                 }
                 j++;
                 
             }
             else if(map.size()<j-i+1){
                 while(map.size()<j-i+1){
                     char chi = s.charAt(i);
                    map.put(chi,map.get(chi)-1);
                    if(map.get(chi)==0){
                        map.remove(chi);
                    }
                    i++;
                 }
                 j++;
             }
         }
         if(maxlen==0)return -1;
         return maxlen;
    }
