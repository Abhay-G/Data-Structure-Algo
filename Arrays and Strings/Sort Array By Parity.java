class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int i=0;
        int j = 0;
        while(i<arr.length){
            if(arr[i]%2 == 0){
                swap(arr, i, j);
                j++;
            }
            i++;
        }
        return arr;
    }
    public static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
