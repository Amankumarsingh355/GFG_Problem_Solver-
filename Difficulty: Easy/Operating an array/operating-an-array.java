class Solution {
    public boolean searchEle(List<Integer> arr, int x) {
        return arr.contains(x);
    }
    public boolean insertEle(List<Integer> arr, int y, int yi) {
        arr.add(yi, y);
        if(arr.get(yi) == y)
        {
            return true;
        }
        return false;
    }
    public boolean deleteEle(List<Integer> arr, int z) {
      return arr.remove((Integer) z); 
    }
}