class Solution {
    public String reverseVowels(String s) {
        
        char [] carr = s.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        hs.add('A');
        hs.add('E');
        hs.add('I');
        hs.add('O');
        hs.add('U');
        int i=0;
        int j = carr.length-1;
        while(i<j){
            if(hs.contains(carr[i]) && hs.contains(carr[j])){
                swap(i,j,carr);
                i++;
                j--;
            }
            else if(hs.contains(carr[i])){
                j--;
            }else if(hs.contains(carr[j])){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
       return String.valueOf(carr);
        
    }
    public void swap(int i, int j,char[]carr){
        
        char temp = carr[i];
        carr[i] = carr[j];
        carr[j] = temp;

    }
}
