class Sol
{
    int binaryPalin(long n)
    {
        String b = Long.toBinaryString(n);
        if(b.equals(new StringBuilder(b).reverse().toString()))
        return 1;
        else
        return 0;
    }
}