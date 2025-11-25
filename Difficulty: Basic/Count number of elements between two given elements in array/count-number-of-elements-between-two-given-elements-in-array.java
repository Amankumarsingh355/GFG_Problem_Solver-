class Solution {
  public int getCount(ArrayList<Integer> arr, int num1, int num2) {
    return Math.max(0, arr.lastIndexOf(num2) - arr.indexOf(num1) - 1);
  }
}