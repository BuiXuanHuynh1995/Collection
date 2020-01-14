package binaryTree;

public class BinaryTree {
    //root của cây
    Node root;

    // Lớp đại diện cho node bao gồm node con trái và phải cùng với giá trị của key
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // Chèn các nút theo thứ tự
    public Node addElement(int[] arr, Node root, int i){
        if (i < arr.length) {
            Node temp = new Node(arr[i]);
            root = temp;
            root.left = addElement(arr, root.left,2 * i+1);
            root.right = addElement(arr, root.right,2 * i + 2);
        }
        return root;
    }

    public void inOrder(Node root){
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void main(String args[])
    {
        BinaryTree t2 = new BinaryTree();
        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
        t2.root = t2.addElement(arr, t2.root, 0);
        t2.inOrder(t2.root);
    }
}
