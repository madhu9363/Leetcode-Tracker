// Last updated: 09/07/2026, 15:09:36
class Solution {
    public int[] replaceElements(int[] arr) {
        int max =-1;
        for(int i=arr.length-1;i>=0;i--){
          int temp =arr[i];
           arr[i]=max;
           if(temp>max){
            max =temp;
           }    
        }
        return arr;
    }
}