package com.app;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(7);
        int[] mode = solution.findMode(root);
        System.out.print(Arrays.toString(mode));
    }
}
