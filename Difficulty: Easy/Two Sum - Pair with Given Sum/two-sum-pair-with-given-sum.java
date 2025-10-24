import java.util.HashSet;
import java.util.Set;
public class Solution {
    public boolean twoSum(int[] arr, int target) {
        if (arr == null || arr.length < 2) return false;
        Set<Integer> seen = new HashSet<>();
        for (int x : arr) {
            int need = target - x;
            if (seen.contains(need)) return true;
            seen.add(x);
        }
        return false;
    }
}