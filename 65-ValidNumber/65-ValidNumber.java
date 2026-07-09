// Last updated: 09/07/2026, 15:12:37
class Solution {

    public boolean isNumber(String s) {

        s = s.trim();

        boolean hasDigit = false;
        boolean hasDot = false;
        boolean hasExponent = false;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Digit
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            // + or -
            else if (ch == '+' || ch == '-') {

                // Sign is allowed only at the beginning
                // or immediately after e/E
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }

            // Decimal point
            else if (ch == '.') {

                // Dot cannot appear after e/E
                // and only one dot is allowed
                if (hasDot || hasExponent) {
                    return false;
                }

                hasDot = true;
            }

            // e or E
            else if (ch == 'e' || ch == 'E') {

                // Only one e/E is allowed
                // There must be a digit before e/E
                if (hasExponent || !hasDigit) {
                    return false;
                }

                hasExponent = true;

                // After e/E we must find digits again
                hasDigit = false;
            }

            // Any other character
            else {
                return false;
            }
        }

        return hasDigit;
    }
}