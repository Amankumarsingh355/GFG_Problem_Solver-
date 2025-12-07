class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> num = new ArrayList<>();
        Arrays.sort(arr);
        int firstnum = arr[0];
        int secondnum = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != firstnum) {
                secondnum = arr[i];
                break;
            }
        }
        if (secondnum == -1) {
            num.add(-1);
        } else {
            num.add(firstnum);
            num.add(secondnum);
        }
        return num;
    }
}