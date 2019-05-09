package com.rcioban.datastructures.tree;

/**
 * A Tree node representation
 *
 * @rcioban
 */
public class TreeNode {

    private Integer element;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Integer element) {
        this.element = element;
    }

    public TreeNode find(Integer element) {
        if (this.element == element) {
            return this;
        }
        if (element < this.element && leftChild != null) {
            return leftChild.find(element);
        }
        if (rightChild != null) {
            return rightChild.find(element);
        }
        return null;
    }

    public int getHeight() {
        if (isLeaf()) {
            return 1;
        }
        int left = 0;
        int right = 0;
        if (this.leftChild != null) {
            left = this.leftChild.getHeight();
        }
        if (this.rightChild != null) {
            right = this.rightChild.getHeight();
        }
        return (left > right) ? (left + 1) : (right + 1);
    }

    public int countNodes(TreeNode root) {
        int count = 0;
        if (root != null) {
            count += 1; // root
            count += countNodes(root.getLeftChild());
            count += countNodes(root.getRightChild());
        }
        return count;
    }

    public boolean isLeaf() {
        return this.leftChild == null && this.rightChild == null;
    }

    public void inOrderTraversal(TreeNode node) {
        if(node != null) {
            inOrderTraversal(node.getLeftChild());
            System.out.print(node + " ");
            inOrderTraversal(node.getRightChild());
        }
    }

    public void preOrderTraversal(TreeNode node) {
        if(node != null) {
            System.out.print(node + " ");
            preOrderTraversal(node.getLeftChild());
            preOrderTraversal(node.getRightChild());
        }
    }

    public void postOrderTraversal(TreeNode node) {
        if(node != null) {
            postOrderTraversal(node.getLeftChild());
            postOrderTraversal(node.getRightChild());
            System.out.print(node + " ");
        }
    }

    public Integer getElement() {
        return element;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode left) {
        this.leftChild = left;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode right) {
        this.rightChild = right;
    }

    @Override
    public String toString() {
        return String.valueOf(this.element);
    }
}


