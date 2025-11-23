class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        ArrayList<Integer>min = new ArrayList<>();
        for(int i =0;i<b.length;i++){
            min.add(b[i]);
        }
        Collections.sort(min);
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==j){
                    sum +=a[i][j];
                }
            }
        }
        ArrayList<Integer>result = new ArrayList<>();
        result.add(sum);
        result.add(min.get(b.length-1));
        return result;
    }
}