package Tree.TreeTraversal;

import java.util.*;

public class TreeTraversal {
    public static Node root;

    public TreeTraversal(int data) {
        root = new Node(data);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    List<Integer> levelOrderTraversal() {
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            list.add(temp.data);
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
        return list;
    }

    List<Integer> iterativePreorderTraversal() {
        List<Integer> list = new ArrayList<>();
        ArrayDeque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            list.add(temp.data);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
        return list;
    }

    List<Integer> iterativeInOrderTraversal() {
        List<Integer> list = new ArrayList<>();
        ArrayDeque<Node> stack = new ArrayDeque<>();
        Node node = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                list.add(node.data);
                node = node.right;
            }
        }
        return list;
    }

    List<Integer> iterativePostOrderTraversal() {
        List<Integer> list = new ArrayList<>();
        ArrayDeque<Node> stack = new ArrayDeque<>();
        Node curr = root;
        Node temp = null;
        while (curr != null || !stack.isEmpty()) {
            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            else{
                temp = stack.peek().right;
                if(temp == null){
                    temp = stack.pop();
                    list.add(temp.data);
                    while(!stack.isEmpty() && temp == stack.peek().right){
                        temp = stack.pop();
                        list.add(temp.data);
                    }
                }
                else{
                    curr = temp;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeTraversal binaryTree = new TreeTraversal(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        System.out.println("InOrder Traversal : ");
        binaryTree.inOrder(root);
        System.out.println();

        System.out.println("PreOrder Traversal : ");
        binaryTree.preOrder(root);
        System.out.println();

        System.out.println("PostOrder Traversal : ");
        binaryTree.postOrder(root);
        System.out.println();

        System.out.println("Level Order Traversal : ");
        System.out.print(binaryTree.levelOrderTraversal());
        System.out.println();

        System.out.println("Iterative PreOrder Traversal : ");
        System.out.print(binaryTree.iterativePreorderTraversal());
        System.out.println();

        System.out.println("Iterative InOrder Traversal : ");
        System.out.print(binaryTree.iterativeInOrderTraversal());
        System.out.println();

        System.out.println("Iterative PostOrder Traversal : ");
        System.out.print(binaryTree.iterativePostOrderTraversal());
        System.out.println();
    }
}
