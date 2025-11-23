vector<vector<int>> transpose(int a[][M], int n)
{
    vector<vector<int>>t;
    for(int i=0;i<n;i++){
        vector<int>v;
        for(int j=0;j<n;j++)
            v.push_back(a[j][i]);
        t.push_back(v);
        
    }
    return t;
}