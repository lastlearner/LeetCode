package com.practice.simple;

/**
 * Created by liaoyilang on 16/03/2020.
 * NO.101 对称二叉树
 */
public class IsSymmetric {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        boolean result = isSymmetric(root);
    }

    private static boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);

    }

    private static boolean isSymmetric(TreeNode n1, TreeNode n2) {

        if (n1 == null && n2 == null) {
            return true;
        }

        if (n1 == null || n2 == null) {
            return false;
        }

        if (n1.val != n2.val) {
            return false;
        }

        return isSymmetric(n1.left, n2.right) && isSymmetric(n1.right, n2.left);

    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
