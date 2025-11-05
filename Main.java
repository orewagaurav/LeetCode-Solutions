import java.util.*;

class Solution{
    public int findfMin(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        if(nums[left] < nums[right]){
            return nums[left];
        }
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}
public class Main{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int min = sol.findfMin(nums);
        System.out.println("The minum: "+ min);
    }
}