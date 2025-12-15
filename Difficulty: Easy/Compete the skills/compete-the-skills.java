class Solution {
    static ArrayList<Integer> scores(int arr1[], int arr2[]) {
        ArrayList<Integer> List1=new ArrayList<>();
        int i=0;
        int j=0;
        int count=0;
        int count1=0;
        while(i<arr1.length&&j<arr2.length)
        {
            if(arr1[i]>arr2[j])
            {
                count++;
            }
            else if(arr2[j]>arr1[i])
            {
                count1++;
            }
            i++;
            j++;
        }
        List1.add(count);
        List1.add(count1);
        return List1;
    }
}