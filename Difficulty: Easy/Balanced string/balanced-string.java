class Solution {
    static String BalancedString(int N) {
        StringBuilder sb= new StringBuilder();
        String al="abcdefghijklmnopqrstuvwxyz";
        int temp=N;
        while(N>26){
            sb.append(al);
            N=N-26;
        }
        if(N%2==0){
            sb.append(al.substring(0,N/2));
            sb.append(al.substring(26-N/2));
        }else{
            int sum=0;
            while(temp>0){
                sum+=temp%10;
                temp=temp/10;
            } if(sum%2==0){
                sb.append(al.substring(0,(N+1)/2));
                sb.append(al.substring(26-((N-1)/2)));
            }else{
                sb.append(al.substring(0,(N-1)/2));
                sb.append(al.substring(26-((N+1)/2)));
            }
        }return sb.toString();
    }
}