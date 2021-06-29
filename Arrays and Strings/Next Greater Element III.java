class Solution {
    public int nextGreaterElement(int n) {
        
        String str = String.valueOf(n);
        
        String res =  findNextPermutation(str);
        if(res.equals("-1"))return -1;
        int i = 0;
        long ans = 0;
        while(i<res.length()){
            ans = ans*10 + res.charAt(i)-'0';
            if(ans>Integer.MAX_VALUE){
                return -1;
            }
            i++;
        }
        if(ans>Integer.MAX_VALUE){
                return -1;
        }
        
        return (int)ans;
    }
    
    public static String findNextPermutation(String str){
      
        char arr[] = str.toCharArray();
        int i = arr.length-2;
        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
        }
        if(i<0){
            return "-1";
        }
        int j = arr.length-1;
        int min = Integer.MAX_VALUE;
        
        while(j>i && arr[j] <= arr[i]){
            j--;
        }
        
        swap(arr, i, j);
        j = arr.length-1;
        i = i+1;
       
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
        
        return String.valueOf(arr);
    
    }
    public static void swap(char arr[], int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
