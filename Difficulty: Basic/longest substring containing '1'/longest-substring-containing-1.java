class GfG {
     public int count(String s) {
		int count = 0,max=0;
		for(int i=0; i<s.length(); i++) {
		    char curr = s.charAt(i);
		    if(curr=='1') {
		        count++;
		        if(count>max) max=count;
		    } else count=0;
		}
		return max;
    }
}