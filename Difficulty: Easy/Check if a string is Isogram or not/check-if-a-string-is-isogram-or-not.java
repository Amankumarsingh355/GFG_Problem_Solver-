class Solution {
    static boolean isIsogram(String data) {
          int count=0;
      char[] arr= data.toCharArray();
      ArrayList<Character> list = new ArrayList<>();
      HashSet<Character> set = new HashSet<>();
      for(int i=0;i<arr.length;i++){
          list.add(arr[i]);
          set.add(arr[i]);
      }
      return (list.size()==set.size());
    }
}