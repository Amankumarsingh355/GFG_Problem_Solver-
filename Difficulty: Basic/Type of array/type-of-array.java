class Solution {
    int maxNtype(int arr[]) {
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)max=arr[i];
            if(arr[i]<min)min=arr[i];
        }
        if(arr[0]==min && arr[arr.length-1]==max){
            return 1;
            
        }
        if(arr[0]==max && arr[arr.length-1]==min){
            return 2;
        }        
        for(int i=0;i<arr.length;i++){
        if(arr[i]==min && arr[i+1]==max){
            return 3;
        }
        if(arr[i]==max && arr[i+1]==min){
            return 4;
        }
        }
        return -1;
    }
}