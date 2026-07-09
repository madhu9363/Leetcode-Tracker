// Last updated: 09/07/2026, 15:08:07
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelivin = celsius+273.15;
        double far = celsius*1.80+32;
        return new double[] {kelivin,far};
        
    }
}