class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> res = new ArrayList<>();
        int low = 0;
        int high = arr.length-1;
        boolean f = true;
        boolean l = true;
        while(low<=high){
            if(arr[low]==x && f){
                res.add(low);
                f = false;
            }
            if(f){
                low++;
            }
            if(arr[high]==x && l){
                res.add(high);
                l = false;
            }
            if(l){
                high--;
            }
            if(res.size() == 2){
                if(res.get(0)>res.get(1)){
                    int temp = res.get(0);
                    res.set(0,res.get(1));
                    res.set(1 , temp);
                }
                return res;
            }
        }
        if(res.size() == 0){
            res.add(-1);
            res.add(-1);
        }
        return res;
    }
}