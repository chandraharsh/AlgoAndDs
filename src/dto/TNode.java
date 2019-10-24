package dto;

public class TNode {
    int data;
    TNode left,right;

    @Override
    public String toString() {
        return "TNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
    public TNode(int data) {
        this.left = null;
        this.right = null;
        this.data = data;

    }


}
