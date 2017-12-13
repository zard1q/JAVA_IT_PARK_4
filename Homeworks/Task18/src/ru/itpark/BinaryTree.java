package ru.itpark;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    public BinaryTree<T> add(T value) {
        add(value, root);
        return this;
    }

    private void add(T value, Node <T> root){
        if (this.root == null) {
            this.root = new Node<T>(null, null, value);
            return;
        }

        if (root.getValue().compareTo(value) > 0){
            if(root.getLeft()!= null) {
                add(value, root.getLeft());
            } else {
                root.left = new Node<T>(null,null, value);
            }
        } else {
            if(root.getRight() != null) {
                add(value, root.getRight());
            } else {
                root.right = new Node<T>(null, null, value);
            }
        }
    }



    public void PreOrderTraversal() {
        PreOrderTraversal(root);
    }
    private void PreOrderTraversal(Node<T> node){
        if (node != null) {
            System.out.print(node.getValue()+ " ");
            PreOrderTraversal(node.left);
            PreOrderTraversal(node.right);
        }
    }

    public void PostOrderTraversal() {
        PostOrderTraversal(root);
    }
    private void PostOrderTraversal(Node<T> node) {
        if (node != null) {
            PostOrderTraversal(node.left);
            PostOrderTraversal(node.right);
            System.out.print(node.getValue()+ " ");
        }
    }

    public void InOrderTraversal() {
        InOrderTraversal(root);
    }
    private void InOrderTraversal(Node<T> node) {
        if (node != null) {
            InOrderTraversal(node.left);
            System.out.print(node.getValue()+ " ");
            InOrderTraversal(node.right);

        }
    }

    private static class Node<T extends  Comparable<T>> implements Comparable<T> {
        private Node<T> left;
        private Node<T> right;
        private  T value;

        public Node(Node<T> left, Node<T> right, T value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }
        public Node<T>  getLeft(){
            return left;
        }

        public Node<T>  getRight(){
            return right;
        }

        public T getValue(){
            return value;
        }

        @Override
        public int compareTo(T o) {
            return o.compareTo(value);
        }

    }


}
