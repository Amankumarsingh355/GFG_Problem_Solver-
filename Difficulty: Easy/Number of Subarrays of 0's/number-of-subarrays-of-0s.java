class Solution {
    long no_of_subarrays(int N, int [] arr) {
		long sum = 0;
		long counter = 0;
		for(int i=0; i<N; i++){
		    if(arr[i] == 0){
		        counter++;
		    }    
		    else if(counter != 0){
		        sum += (counter * (counter+1)) / 2;
		        counter = 0;
		    }
		}
		if(counter != 0){
		    sum += (counter * (counter+1)) / 2;
		}
		return sum;
	}
}