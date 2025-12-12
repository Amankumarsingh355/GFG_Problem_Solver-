class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        int[][] arr_list = new int[21][100000];
        int[] index = new int[21];
        for(int x : arr){
            int num = x;
            int zeros = 0;
            while(x > 0){
                zeros += x%2;
                x = x/2;
            }
            arr_list[zeros][index[zeros]++] = num;
        }
        int counter = 0;
        for(int i=20; i>0; i--){
            for(int j=0; j<100000; j++){
                if(arr_list[i][j] != 0){
                    arr[counter++] = arr_list[i][j];
                }
                else{
                    break;
                }
            }
        }
        
    } 
}
 