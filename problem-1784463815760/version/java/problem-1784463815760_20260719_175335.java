// Last updated: 19/07/2026, 17:53:35
1import java.util.*;
2
3class Solution {
4    public List<String> fullJustify(String[] words, int maxWidth) {
5
6        List<String> result = new ArrayList<>();
7        int i = 0;
8
9        while (i < words.length) {
10
11            int j = i;
12            int lineLength = 0;
13
14            // Find the maximum number of words that fit in one line
15            while (j < words.length &&
16                   lineLength + words[j].length() + (j - i) <= maxWidth) {
17                lineLength += words[j].length();
18                j++;
19            }
20
21            int gaps = j - i - 1;
22            StringBuilder sb = new StringBuilder();
23
24            // Last line or only one word
25            if (j == words.length || gaps == 0) {
26
27                for (int k = i; k < j; k++) {
28                    sb.append(words[k]);
29                    if (k != j - 1) {
30                        sb.append(" ");
31                    }
32                }
33
34                while (sb.length() < maxWidth) {
35                    sb.append(" ");
36                }
37
38            } else {
39
40                int totalSpaces = maxWidth - lineLength;
41                int spacePerGap = totalSpaces / gaps;
42                int extraSpaces = totalSpaces % gaps;
43
44                for (int k = i; k < j; k++) {
45
46                    sb.append(words[k]);
47
48                    if (k != j - 1) {
49
50                        for (int s = 0; s < spacePerGap; s++) {
51                            sb.append(" ");
52                        }
53
54                        if (extraSpaces > 0) {
55                            sb.append(" ");
56                            extraSpaces--;
57                        }
58                    }
59                }
60            }
61
62            result.add(sb.toString());
63            i = j;
64        }
65
66        return result;
67    }
68}