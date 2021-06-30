class Solution {
    public String multiply(String num1, String num2) {
        
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int l1 = num1.length();
        int l2 = num2.length();
        int res[] = new int[l1+l2];
        int carry = 0;
        int pf = 0;
        int idx = res.length-1;
        for(int i=l1-1; i>=0; i--){
            int n1 = num1.charAt(i)-'0';
            int k = res.length-1-pf;
             int j = l2-1;
             while(j>=0 || carry!=0){
                int n2 = j>=0 ? num2.charAt(j)-'0':0;
                int product = (n1*n2)+carry+res[k];
                res[k] = product%10;
                carry = product/10;
                k--;
                j--;
             }
             pf++;
        }
        //managing leading zero
        String str = "";
        boolean flag = false;
        for(int val: res){
            if(val==0 && flag==false){
                continue;
            }else{
                flag = true;
                str+=val;
            }
        }
        return str;
    }
}
      
            
