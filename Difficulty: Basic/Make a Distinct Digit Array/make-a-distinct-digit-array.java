class Solution {
    public int[] common_digits(int[] nums) {
        int[] freq = new int[10];
    for (int num : nums) {
        while (num > 0) {
            int digit = num % 10;
            freq[digit] = 1;
            num /= 10;
        }
    }
    int count = 0;
    for (int f : freq) 
    if (f == 1) count++;
    int[] result = new int[count];
    int idx = 0;
    for (int i = 0; i < 10; i++) {
        if (freq[i] == 1) {
            result[idx++] = i;
        }
    }
    return result; 
    }
}