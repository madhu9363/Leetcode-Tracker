// Last updated: 09/07/2026, 15:12:32
class Solution {
    public int mySqrt(int x) {
        // Handle base cases immediately
        if (x == 0 || x == 1) {
            return x;
        }
        
        int i = 1;
        int j = x;
        
        while (i <= j) {
            // Safe way to find the middle point without overflow
            int mid = i + (j - i) / 2;
            
            // Use division instead of multiplication to avoid long casting
            if (mid > x / mid) {
                j = mid - 1; // Look in the lower half
            } else if (mid == x / mid) {
                return mid; // Found the exact square root
            } else {
                i = mid + 1; // Look in the upper half
            }
        }
        
        // 'j' will always be the truncated (rounded down) integer
        return j; 
    }
}
