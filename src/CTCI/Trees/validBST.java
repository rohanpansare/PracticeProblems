package CTCI.Trees;

import static CTCI.Trees.validBST.isValidBST;

/**
 * Created by rohanpansare on 2/5/2017.
 */
public class validBST {
    int arr[] = new int[8];
    int i = 0;
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(7);
        root.left.right = new Node(15);
        root.left.right.right = new Node(17);
        System.out.println(isValidBST(root,null,null));
        validBST st = new validBST();
        int res[] = st.isValidBST1(root);
        for(int j=0; j < res.length -1 ; j++){
            if(res[j] >= res[j+1]) {
                System.out.println("false not a valid BST");
                System.exit(1);
            }
        }
        System.out.println("True a valid bst");


    }
    public static boolean isValidBST(Node root , Integer min , Integer max){
        if(root == null){
            return true;
        }
        if((min != null && root.data <= min) || (max != null && root.data > max)){
            return false;
        }
        if (!isValidBST(root.left, min, root.data) || !isValidBST(root.right,root.data, max)){
            return false;
        }
        return true;
    }
    public int[] isValidBST1(Node root){
        if(root == null){
            return null;
        }
        isValidBST1(root.left);
        arr[i] = root.data;
        i++;
        isValidBST1(root.right);
        return arr;
    }


}
