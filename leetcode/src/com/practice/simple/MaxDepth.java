package com.practice.simple;

/**
 * Created by liaoyilang on 16/03/2020.
 * NO.104 二叉树的最大深度
 */
public class MaxDepth {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        Integer integers = maxDepth(root);
    }

    private static Integer maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

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
