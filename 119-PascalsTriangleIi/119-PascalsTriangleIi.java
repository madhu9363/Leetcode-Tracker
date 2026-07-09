// Last updated: 09/07/2026, 15:12:06
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        // FIX: Change this from List<Integer> to List<List<Integer>>
        List<List<Integer>> ans = new ArrayList<>();
        
        // FIX: Use '<=' to make sure you calculate up to the correct row index
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> res = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    res.add(1);
                } else {
                    int left = ans.get(i-1).get(j-1);
                    // FIX: Changed 'get(i)' to 'get(j)' to look directly above
                    int right = ans.get(i-1).get(j);
                    int result = left + right;
                    res.add(result);
                }
            }
            // Now this works perfectly because 'ans' is a 2D list!
            ans.add(res);
        }
        // Now this works perfectly because fetching a row from a 2D list gives a List<Integer>!
        return ans.get(rowIndex);
    }
}
