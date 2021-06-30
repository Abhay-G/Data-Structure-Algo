class Solution {
    List<String> res;
    public List<String> wordBreak(String s, List<String> wordDict) {
        res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(String str: wordDict){
            set.add(str);
        }
        solve(s, set, new StringBuilder());
        return res;
    }
    
    public void solve(String s, HashSet<String>set, StringBuilder sb){
        
        
        if(s.length()==0){
            if(sb.length()>0){
                res.add(sb.deleteCharAt(sb.length()-1).toString());
            }
           
            return;
        }
        for(int i=0; i<s.length();i++){
            String left = s.substring(0, i+1);
            String right = s.substring(i+1);
            
            if(set.contains(left)){
                int len = sb.length();
                sb.append(left+" ");
                solve(right, set,sb);
                sb.setLength(len);
            }
        }
    }
}
