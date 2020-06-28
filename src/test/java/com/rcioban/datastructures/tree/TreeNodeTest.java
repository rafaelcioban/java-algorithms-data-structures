package com.rcioban.datastructures.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeNodeTest {

    TreeNode root, leftChild1, rightChild1, leftChild21, rightChild21, leftChild22, rightChild22;

    @Before
    public void setUp() {
        this.root = new TreeNode(20);
        this.leftChild1 = new TreeNode(10);
        this.rightChild1 = new TreeNode(30);
        this.root.setLeftChild(this.leftChild1);
        this.root.setRightChild(this.rightChild1);
        this.leftChild21 = new TreeNode(5);
        this.rightChild21 = new TreeNode(15);
        this.leftChild1.setLeftChild(this.leftChild21);
        this.leftChild1.setRightChild(this.rightChild21);
        this.leftChild22 = new TreeNode(25);
        this.rightChild22 = new TreeNode(35);
        this.rightChild1.setLeftChild(this.leftChild22);
        this.rightChild1.setRightChild(this.rightChild22);
    }

    @Test
    public void testGetHeight() {
        assertEquals(3, this.root.getHeight());
    }

    @Test
    public void testCountNodes() {
        assertEquals(7, this.root.countNodes(this.root));
    }

    @Test
    public void testTraversals() {
        System.out.println("\nIn Order:");
        this.root.inOrderTraversal(this.root);
        System.out.println("\nPre Order:");
        this.root.preOrderTraversal(this.root);
        System.out.println("\nPost Order:");
        this.root.postOrderTraversal(this.root);
    }
}
