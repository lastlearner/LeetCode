package com.practice.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liaoyilang on 16/03/2020.
 * NO.107 二叉树的层次遍历
 */
public class LevelOrderBottom {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        List<List<Integer>> integers = levelOrderBottom(root);
    }

    private static List<List<Integer>> levelOrderBottom(TreeNode root) {

        ArrayList<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }


        if (root.left == null && root.right == null) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
        }

        return null;

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
