import java.util.*;
public class Anagram {
    public static boolean anagram (String s, String t) {
        
        if (s==t)
            return true;
        
        if (s.length() != t.length())
            return false;
        
        HashMap <Character, Integer> map1 = new HashMap <Character, Integer>();
        HashMap <Character, Integer> map2 = new HashMap <Character, Integer>();
        
        for (int i=0; i<s.length(); i++) 
            main(s.charAt(i))++;
        
        for (int i=0; i<t.length(); i++) 
            main(t.charAt(i))++;
        
        return map1.equals(map2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(anagram (s,t));
    }
}






BinarySearch

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
