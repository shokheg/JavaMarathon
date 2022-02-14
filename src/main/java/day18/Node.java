package day18;

import java.util.Stack;

public class Node {

    private long value;
    private Node left;
    private Node right;


    public Node(long value) {
        this.value = value;

    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }




}
