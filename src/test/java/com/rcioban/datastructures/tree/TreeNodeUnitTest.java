package com.rcioban.datastructures.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeNodeUnitTest {

    TreeNode root, leftChild1, rightChild1, leftChild21, rightChild21, leftChild22, rightChild22;

    @Before
    public void setUp() {
        root = new TreeNode(20);
        leftChild1 = new TreeNode(10);
        rightChild1 = new TreeNode(30);
        root.setLeftChild(leftChild1);
        root.setRightChild(rightChild1);
        leftChild21 = new TreeNode(5);
        rightChild21 = new TreeNode(15);
        leftChild1.setLeftChild(leftChild21);
        leftChild1.setRightChild(rightChild21);
        leftChild22 = new TreeNode(25);
        rightChild22 = new TreeNode(35);
        rightChild1.setLeftChild(leftChild22);
        rightChild1.setRightChild(rightChild22);
    }

    @Test
    public void testGetHeight() {
        assertEquals(3, root.getHeight());
    }

    @Test
    public void testCountNodes() {
        assertEquals(7, root.countNodes(root));
    }

    @Test
    public void testTraversals() {
        System.out.println("\nIn Order:");
        root.inOrderTraversal(root);
        System.out.println("\nPre Order:");
        root.preOrderTraversal(root);
        System.out.println("\nPost Order:");
        root.postOrderTraversal(root);
    }
}
