class Solution {
    // Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root) {
        // write code here
        ArrayList<Integer> result = new ArrayList<>();
        preorderHelper(root,result);
        return result;
        
    }
    public static void  preorderHelper(Node node, ArrayList<Integer> result){
     if(node == null) return;
     
     result.add(node.data);
     preorderHelper(node.left,result);
     preorderHelper(node.right,result);
    }
}
