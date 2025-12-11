class Solution {
    int maxProduct(int[] arr) {
    int max1=Integer.MIN_VALUE,
        max2=Integer.MIN_VALUE,
        max3=Integer.MIN_VALUE,
        min1=Integer.MAX_VALUE,
        min2=Integer.MAX_VALUE;
    int n=arr.length;
    for(int i=0;i<n;i++){
    if(arr[i]>max1){
        max3=max2;
        max2=max1;
        max1=arr[i];
    }
    else if(arr[i]>max2){
        max3=max2;
        max2=arr[i];
    }
    else if(arr[i]>max3){
        max3=arr[i];
    }
    }
    for(int i=0;i<n;i++){
        if(arr[i]<min1){
            min2=min1;
            min1=arr[i];
        }
        else if(arr[i]<min2){
            min2=arr[i];
        }
    }
    long Product1=1L*max1*max2*max3;
    long Product2=1L*min1*min2*max1;
    return (int)Math.max(Product1,Product2);
    }
}