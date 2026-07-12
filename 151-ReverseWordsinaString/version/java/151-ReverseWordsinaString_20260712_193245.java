// Last updated: 12/07/2026, 19:32:45
1class Solution {
2    public String reverseWords(String s) {
3        // Trim the input string to remove leading and trailing spaces
4        String[] str = s.trim().split("\\s+");
5
6        // Initialize the output string
7        String out = "";
8
9        // Iterate through the words in reverse order
10        for (int i = str.length - 1; i > 0; i--) {
11            // Append the current word and a space to the output
12            out += str[i] + " ";
13        }
14
15        // Append the first word to the output (without trailing space)
16        return out + str[0];
17    }
18}