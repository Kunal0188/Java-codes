import java.util.*;
import java.lang.String;
public class Palindrome {
        static boolean isPalindrome ( String s) {
            int n = s.length();
    
            for (int i=0; i<n/2; i++) {
                if (s.charAt(i) != s.charAt(n-i-1))
                    return false;
            }
                return true;
            
        }
        public static void main(String[] args) {
            // String s = "katak";
            Scanner sc = new Scanner (System.in);
            String s = sc.next();
            System.out.println(isPalindrome(s));
        }
    }
    
    // INPUT: 12321
    // tenet
    // store 
    
    // OP: true
    // true
    // false