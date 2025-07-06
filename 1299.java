class Solution {
    public int[] replaceElements(int[] arr) {
        // int n = arr.length;  
        // for(int i =0;i<n;i++){
        //     int largest = Integer.MIN_VALUE;
        //     for(int j=i+1;j<=n-1;j++){
        //         if(arr[j]> largest){
        //             largest = arr[j];
        //         }
        //     }
        //     arr[i]=largest;
        // }
        // arr[n-1] = -1;
        // return arr;
        int max = -1;
        for(int i = arr.length-1;i>=0;i--){
            int temp = arr[i];
            arr[i] =max;
            max = Math.max(temp,max);
        }
        return arr;
        
    }
}