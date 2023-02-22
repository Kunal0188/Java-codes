import java.util.*;

public class NGE {
    static int[] nge (int []arr, int n) {
        Stack <Integer> st = new Stack <Integer>();
        int []ans = new int [n];
        for (int i=n-1; i>=0; i--) {
            while (!st.isEmpty() && st.peek()<=arr[i])
                st.pop();
            
            if (st.isEmpty())
                arr[i] = -1;
            
            else 
                arr[i] = st.peek();
            
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(nge(arr,n));
    }
}