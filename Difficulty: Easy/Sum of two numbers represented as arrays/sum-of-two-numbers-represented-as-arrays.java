class Solution {
    ArrayList<Integer> findSum(int arr1[], int arr2[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int min = Math.min(n, m);
        int carry = 0;
        for(int i=1; i<=min; i++){
            int sum = arr1[n-i] + arr2[m-i] + carry;
            ans.add(sum % 10);
            carry = sum / 10;
        }
        if(n > m){
            for(int i=n-m-1; i>=0; i--){
                if(carry == 1){
                    int sum = arr1[i] + carry;
                    ans.add(sum % 10);
                    carry = sum / 10;
                }
                else{
                    ans.add(arr1[i]);
                }
            }
        }
        else if(m > n){
            for(int i=m-n-1; i>=0; i--){
                if(carry == 1){
                    int sum = arr2[i] + carry;
                    ans.add(sum % 10);
                    carry = sum / 10;
                }
                else{
                    ans.add(arr2[i]);
                }
            }
        }
        if(carry == 1){
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }
}