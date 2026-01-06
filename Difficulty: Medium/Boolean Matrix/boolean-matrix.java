class Solution {
    void booleanMatrix(int mat[][]) {
        for(int i = 0; i < mat.length; i++){ 
            for(int j = 0; j < mat[0].length; j++){ 
                if(mat[i][j] == 1){
                    for(int k = 0; k < mat[0].length; k++){
                        if(mat[i][k] == 0){
                            mat[i][k] = -1;
                        }
                    }
                    for(int k = 0; k < mat.length; k++){
                        if(mat[k][j] == 0){
                            mat[k][j] = -1;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == -1){
                    mat[i][j] = 1;
                }
            }
        }
    }
}