class Solution{
    static void printTriangleDownwards(String str){
        int size=str.length()-1;
        for(int v=0;v<=size;v++){
            for(int k=0;k<=size;k++){
                if(v+k+1<=size){
                    System.out.print(".");
                }else{
                    System.out.print(str.substring(0,v+1));
                    break;
                }
            }
            System.out.println();
        }
    }
}