class Solution {
    public void nextPermutation(int[] arr) {
        if(arr.length<=1)return;
        //find the first faulty index from last
        int i = arr.length-2;
        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
        }
        //if no faulty index found
        if(i<0){
           reverse(arr,0, arr.length-1);
           return;
        }
        //find the just largest value to the right of the faulty index
        int j = arr.length-1;
        while(j>i && arr[j] <= arr[i]){
            j--;
        }
        //swap them both
        swap(arr, i, j);
        //reverse after the faulty index after swapping
        reverse(arr, i+1, arr.length-1);
        
    }
     public static void reverse(int []arr, int i, int j){
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
