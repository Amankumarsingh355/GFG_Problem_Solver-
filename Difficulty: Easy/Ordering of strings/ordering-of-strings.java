class Solution{
    String[] orderString(String s[], int n){
        String smallest = s[0];
        String largest = s[0];
        for (int i = 1; i < n; i++) {
            if (s[i].compareTo(smallest) < 0) {
                smallest = s[i];
            }
            if (s[i].compareTo(largest) > 0) {
                largest = s[i];
            }
        } 
        return new String []{smallest,largest};
    } 
}