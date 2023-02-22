import java.util.*;

public class Binarysearch {
    public static int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if (nums[mid] == target)
                return mid;

            else if (nums[mid]<target) {
                low = mid+1;
            }
               
            else if (nums[mid]>target) {
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in); 
            int n = sc.nextInt();
            int target = sc.nextInt();
            int nums[] = new int [n];
            for (int i=0; i<n; i++) {
                nums[i] = sc.nextInt();
            }
            System.out.print(search(nums,target));
        
    }
}