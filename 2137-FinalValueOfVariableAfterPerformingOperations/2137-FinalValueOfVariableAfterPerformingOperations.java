// Last updated: 09/07/2026, 15:08:20
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=  0;
        for(String  op:operations){
            x+= (44 -op.charAt(1));

        }
        return x;
    }
}