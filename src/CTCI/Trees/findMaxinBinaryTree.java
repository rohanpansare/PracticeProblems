package CTCI.Trees;
/**
 * Created by rohanpansare on 2/4/2017.
 */
public class findMaxinBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Max is:" + findMax(root));
    }
    public static int findMax(Node root){
        int max = Integer.MIN_VALUE;
        if(root == null){
            return max;
        }
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);
        if(max < leftMax){
            max = leftMax;
        }
        if(max < rightMax){
            max = rightMax;
        }
        if(max < root.data){
            max = root.data;
        }
        return max;
    }
}
