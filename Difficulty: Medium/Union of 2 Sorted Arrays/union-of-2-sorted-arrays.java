class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int i=0,j=0;
        for(;i<a.length && j<b.length;){
            if(a[i]<b[j]){
                ans.add(a[i]);
                i++;
                while(i<a.length && ans.get(ans.size()-1)==a[i])
                    i++;
            }
            else if(a[i]>b[j]){
                ans.add(b[j]);
                j++;
                while(j< b.length && ans.get(ans.size()-1)==b[j])
                    j++;
            }
            else{
                ans.add(a[i]);
                i++;j++;
                while(i<a.length && ans.get(ans.size()-1)==a[i])
                    i++;
                while(j< b.length && ans.get(ans.size()-1)==b[j])
                    j++;
            }
        }
        while(i<a.length){
            ans.add(a[i]);
            while(i<a.length && ans.get(ans.size()-1)==a[i])
            i++;
        }
        while(j<b.length){
            ans.add(b[j]);
            while(j< b.length && ans.get(ans.size()-1)==b[j])
            j++;
        }
        return ans;
    }
}