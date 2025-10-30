class Solution {
    public static int findSum(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        sc.close();
        System.out.println(findSum(n));
    }
}