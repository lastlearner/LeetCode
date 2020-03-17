package com.practice.simple;

/**
 * Created by liaoyilang on 16/03/2020.
 * NO.111 二叉树的最小深度
 */
public class MinDepth {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        Integer integers = minDepth(root);
    }

    private static Integer minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right != null) {
            return 1 + minDepth(root.right);
        }
        if (root.left != null && root.right == null) {
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));

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
