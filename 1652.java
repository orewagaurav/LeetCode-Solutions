class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int []arr = new int[n];
        if(k == 0){
            return arr;
        }
        int start = k>0 ? 1:n+k;
        int end  = k>0 ? k:n-1;
        
        int sum = 0;
        for(int  i=start;i<=end;i++){
            sum += code[i%n];
        }
        for(int i =0 ;i<n;i++){
            arr[i] = sum;
            sum -= code[(start)%n];
            start++;
            end++;
            sum += code[(end) % n];
        }
        return arr;
    }
}