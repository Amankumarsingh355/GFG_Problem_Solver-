class Solution {
    public static ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> ans=new ArrayList<>(n);
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0)ans.add(new String("FizzBuzz"));
            else if(i%3==0)ans.add(new String("Fizz"));
            else if(i%5==0)ans.add(new String("Buzz"));
            else ans.add(String.valueOf(i));
        }
        return ans;
    }
}