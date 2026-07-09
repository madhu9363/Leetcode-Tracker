// Last updated: 09/07/2026, 15:09:54
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack <Integer> s = new Stack<>();
        int n = temp.length;
        int[] ans =new int[n];
        for(int cday = 0;cday <n;cday++){
            while(!s.empty() && temp[cday]> temp[s.peek()]){
                ans[s.peek()] = cday- s.peek();
                s.pop();
            }
            s.push(cday);
        }
        return ans;


    }
}