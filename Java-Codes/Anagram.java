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