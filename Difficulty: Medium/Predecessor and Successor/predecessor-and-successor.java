class Solution {
    private Node getJustSmallerNode(int key , ArrayList<Node> inorderList){
        int left = 0;
        int right = inorderList.size() - 1;
        Node ans = null;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(inorderList.get(mid).data < key){
                ans = inorderList.get(mid);
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
    
    private Node getJustGreaterNode(int key , ArrayList<Node> inorderList){
        int left = 0;
        int right = inorderList.size() - 1;
        Node ans = null;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(inorderList.get(mid).data > key){
                ans = inorderList.get(mid);
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
    private void inorder(Node root , ArrayList<Node> inorderList){
        if(root == null){
            return;
        }
        inorder(root.left , inorderList);
        inorderList.add(root);
        inorder(root.right , inorderList);
    }
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Node> inorderList = new ArrayList<>();
        inorder(root , inorderList);
        ArrayList<Node> ansList = new ArrayList<>();
        ansList.add(getJustSmallerNode(key , inorderList));
        ansList.add(getJustGreaterNode(key , inorderList));
        
        return ansList;
    }
}

