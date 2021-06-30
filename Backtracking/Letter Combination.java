class Solution {
    List<String> res;
    public List<String> letterCombinations(String digits) {
        
        res = new ArrayList<String>();
        if(digits.length()==0){
            return res;
        }
        solve(digits, 0, new StringBuilder());
        return res;
    }
    static String keys[] = {"","", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public void solve(String digits, int idx, StringBuilder sb){
        
        if(idx==digits.length()){
            res.add(sb.toString());
            return;
        }
        
        char ch = digits.charAt(idx);
        String str = keys[ch-'0'];
        for(int i=0; i<str.length(); i++){
            char letter = str.charAt(i);
            sb.append(letter);
            solve(digits, idx+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
        
        
    }
    
}
