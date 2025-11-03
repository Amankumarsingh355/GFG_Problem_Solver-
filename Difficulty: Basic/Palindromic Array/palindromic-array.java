class Solution {
    public static boolean isPalinArray(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            int actualNum=arr[i];
            int reversedNum=0;
            while(actualNum > 0)
            {
                int lastDigit= actualNum % 10;
                reversedNum = reversedNum * 10 + lastDigit;
                actualNum=actualNum/10;
            }
            if(arr[i] != reversedNum )
            {
                return false;
            }
        }
        return true;
    }
}