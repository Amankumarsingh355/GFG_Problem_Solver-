class Solution{
   String longDivision(String S, int D){
       StringBuilder ans = new StringBuilder("");
 StringBuilder quot = new StringBuilder("");
   
 for(int i=0; i<S.length(); i++) {
  quot.append(S.charAt(i));
  int num = Integer.parseInt(quot.toString());
  if(num >= D) {    
   ans.append((int)(num/D));
   quot.setLength(0);
   quot.append(num%D);
  }
  else if(ans.length() > 0){    
   ans.append("0");
  }
 }

 return (ans.length() == 0) ? "0" : ans.toString();
       
   }
}