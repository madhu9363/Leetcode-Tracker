// Last updated: 19/07/2026, 17:56:26
1import java.util.*;
2
3class Solution {
4
5    public List<List<Integer>> palindromePairs(String[] words) {
6
7        List<List<Integer>> result = new ArrayList<>();
8        Map<String, Integer> map = new HashMap<>();
9
10        for (int i = 0; i < words.length; i++) {
11            map.put(words[i], i);
12        }
13
14        for (int i = 0; i < words.length; i++) {
15
16            String word = words[i];
17
18            for (int j = 0; j <= word.length(); j++) {
19
20                String left = word.substring(0, j);
21                String right = word.substring(j);
22
23                // Case 1: Prefix is palindrome
24                if (isPalindrome(left)) {
25
26                    String revRight = new StringBuilder(right).reverse().toString();
27
28                    if (map.containsKey(revRight) && map.get(revRight) != i) {
29                        result.add(Arrays.asList(map.get(revRight), i));
30                    }
31                }
32
33                // Case 2: Suffix is palindrome
34                if (right.length() > 0 && isPalindrome(right)) {
35
36                    String revLeft = new StringBuilder(left).reverse().toString();
37
38                    if (map.containsKey(revLeft) && map.get(revLeft) != i) {
39                        result.add(Arrays.asList(i, map.get(revLeft)));
40                    }
41                }
42            }
43        }
44
45        return result;
46    }
47
48    private boolean isPalindrome(String s) {
49
50        int left = 0;
51        int right = s.length() - 1;
52
53        while (left < right) {
54
55            if (s.charAt(left) != s.charAt(right)) {
56                return false;
57            }
58
59            left++;
60            right--;
61        }
62
63        return true;
64    }
65}