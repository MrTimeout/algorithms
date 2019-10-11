import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())
            return false;
        a = a.toLowerCase(); b = b.toLowerCase();
        java.util.Map<Character, Integer> m = new java.util.HashMap<>();
        for(int i = 0; i < a.length(); i++)
        {
            if(a.charAt(i) != b.charAt(i))
            {
                if(!m.containsKey(a.charAt(i)))
                    m.put(a.charAt(i), 1);
                else
                    m.put(a.charAt(i), m.get(a.charAt(i))+1);
                if(!m.containsKey(b.charAt(i)))
                    m.put(b.charAt(i), -1);
                else
                    m.put(b.charAt(i), m.get(b.charAt(i))-1);
            }
        }
        return new java.util.HashSet<Integer>(m.values()).size() <= 1;
    }


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
