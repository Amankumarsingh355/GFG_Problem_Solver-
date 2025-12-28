int stringComparsion(char s1[], char s2[])
{
 int i;
 i = strcmp(s1,s2);
 if(i>0)
 return 1;
 else if(i<0)
 return -1;
 else 
 return 0;
}