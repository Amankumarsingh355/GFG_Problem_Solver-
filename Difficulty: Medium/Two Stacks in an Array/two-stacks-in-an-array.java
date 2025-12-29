class twoStacks {
    int arr[];
    int t1,t2;
    twoStacks() {
        arr = new int[100];
        t1=-1;
        t2=100;
    }
    void push1(int x) {
        if(t1+1==t2) return;
        t1++;
        arr[t1]=x;
    }
    void push2(int x) {
        if(t1==t2-1) return;
        t2--;
        arr[t2]=x;
    }
    int pop1() {
        if(t1==-1) return -1;
        return arr[t1--];
    }
    int pop2() {
        if(t2==100) return -1;
        return arr[t2++];
    }
}