// Problem Statement
// Given a string input of length n, find the length of the longest substring without repeating characters i.e return a substring that does not have any repeating characters.
// Substring is the continuous sub-part of the string formed by removing zero or more characters from both ends.

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int uniqueSubstrings(String input) {
        // write your code here
        int n = input.length();
        int start = 0;
        int end = 1;
        int ans = 1;

        Set<Character> s = new HashSet<>();
        s.add(input.charAt(start));
        while (end < n) {
            char endCh = input.charAt(end);
            while (s.contains(endCh)) {
                s.remove(input.charAt(start++));
            }
            s.add(endCh);
            ans = Math.max(end - start + 1, ans);
            end++;
        }

        return ans;
    }
}
