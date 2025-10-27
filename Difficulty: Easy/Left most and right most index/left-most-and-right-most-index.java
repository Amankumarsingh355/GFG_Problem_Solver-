class Solution {
    
    public pair indexes(long v[], long x)
    {
        int start = 0;
        int end = v.length-1;
        
        int first = -1;
        int last = -1;
        
        int find = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(v[mid] == x){
                find = mid;
                break;
                
            }else if(v[mid] < x){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        
        
        if(find == -1){
            return new pair(-1,-1);
        }
        
        int i = find;
        while(i >= 0 && v[i] == x){
            first = i;
            i--;
        }
        int j = find ;
        while(j < v.length && v[j] == x){
            last = j;
            j++;
        }
        
        return new pair (first,last);
        
    }
}