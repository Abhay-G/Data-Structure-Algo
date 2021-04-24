class Solution {
    public String minWindow(String s, String t) {
        
        //creating Map
        HashMap<Character, Integer> hm = new HashMap<>();
        // setting data of second string in Map
        for(int i= 0;i<t.length();i++){
            char ch = t.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        int i=0,j=0;
        int count = hm.size();
        int minlen = Integer.MAX_VALUE;
        String ans = ""; //for gfg initialize ans with "-1";
        
        //Sliding window approach
        while(j<s.length()){
            char ch = s.charAt(j);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)==0){
                    count--;
                }
            }
            
            
            if(count>0){
                j++;
            }
            else if(count==0){
                //shortning the window if there is a chance
              while(count==0){
                char chi = s.charAt(i);
                if(!hm.containsKey(chi)){
                    i++;
                }
                else{
                        if(hm.get(chi)<0){
                            i++;
                            hm.put(chi,hm.get(chi)+1);
                        }else{
                            break;
                        }
                   }
              }
               //comparing multiple potential answers and getting the minimum one
                if(minlen>j-i+1){
                    minlen = j-i+1;
                    ans = s.substring(i,i+minlen);
                }
                j++;
            }
            else if(count<0){
                j++;
            }
            
        
        }
        return ans;
    }
}
