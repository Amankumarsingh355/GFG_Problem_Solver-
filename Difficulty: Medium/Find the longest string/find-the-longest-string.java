class Node{
    Node link[]=new Node[26];
    boolean isend=false;
    void add(char ch)
    {
        link[ch-'a']=new Node();
    }
    boolean contains(char ch)
    {
        return link[ch-'a']!=null;
    }
    Node get(char ch)
    {
        return link[ch-'a'];
    }
    void setend()
    {
        isend=true;
    }
    boolean isEnd()
    {
        return isend==true;
    }
}
class Trie{
    Node node=new Node();
    void insert(String word)
    {
        Node temp=node;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(!temp.contains(ch))temp.add(ch);
            temp=temp.get(ch);
        }
        temp.setend();
    }
    boolean check(String word)
    {
        Node temp=node;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(!temp.contains(ch))return false;
            temp=temp.get(ch);
            if(temp.isEnd()==false)return false;
        }
       return true;
    }
}
class Solution {
    public String longestString(String[] words) {
        int n=words.length;
        Trie trie=new Trie();
        for(int i=0;i<n;i++)
        {
            trie.insert(words[i]);
        }
        String ans="";
        for(int i=0;i<n;i++)
        {
            String word=words[i];
            boolean curr=trie.check(word);
            if(curr==false)continue;
            if(word.length()>ans.length())ans=word;
            else if(word.length()==ans.length() && ans.compareTo(word)>0)ans=word;
        }
        return ans;
        
    }
}