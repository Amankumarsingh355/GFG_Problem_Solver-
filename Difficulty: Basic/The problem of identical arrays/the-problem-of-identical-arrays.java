class Solution {
    public boolean isIdentical(List<Integer> a, List<Integer> b) {
        Collections.sort(a);
        Collections.sort(b);
        if(a.size() != b.size()) return false;
        for(int x=0;x<a.size();x++){
            if(a.get(x) != b.get(x)) return false;
        }
        return true;
    }
}