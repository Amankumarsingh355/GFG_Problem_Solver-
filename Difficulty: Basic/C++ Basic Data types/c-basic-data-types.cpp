class Solution {
  public:
    int BasicDataType(string s) {
    if(!isdigit(s[0]) and s[0] != '.')
            return sizeof(char);
        else if(s.find('.') == string::npos)
            return sizeof(int);
        else
            return (s.length() - s.find('.') - 1 ) < 6 ? sizeof(float) : sizeof(double);
    }
};