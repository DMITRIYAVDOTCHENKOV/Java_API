package org.example.lesson4.lesson4HW;
//Input: root = [1,2,2,3,4,4,3]
//        Output: true

import org.example.lesson4.Tack145Stack;

import java.util.Stack;

public class Tack101Stack {
    public static boolean isSymmetric (TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left == null || root.right == null) {
            return false;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while (stack.size() > 0) {
            TreeNode t1 = stack.pop();
            TreeNode t2 = stack.pop();
            if (t1 == null && t2 == null) {
                continue;
            }
            if (t1 == null || t2 == null) {
                return false;
            }
            if (t1.val != t2.val) {
                return false;
            }
            stack.push(t1.right);
            stack.push(t2.left);
            stack.push(t1.left);
            stack.push(t2.right);
        }
        return true;
    }
}