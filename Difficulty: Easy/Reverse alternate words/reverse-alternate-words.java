class Solution {
    String reverseAlternate(String s) {
        String arr[] = s.split(" ");
        for(int i = 1; i < arr.length; i += 2) 
            arr[i] = new StringBuffer(arr[i]).reverse().toString();
        return String.join(" ", arr);
    }
}