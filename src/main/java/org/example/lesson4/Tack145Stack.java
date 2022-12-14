package org.example.lesson4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

//Given the root of a binary tree, return the postorder traversal of its nodes' values.
//        Example 1:

//        Input: root = [1,null,2,3]
//        Output: [3,2,1]
//        Example 2:
//
//        Input: root = []
//        Output: []
//        Example 3:
//
//        Input: root = [1]
//        Output: [1]

//        Constraints:

//        The number of the nodes in the tree is in the range [0, 100].
//        -100 <= Node.val <= 100


public class Tack145Stack {
    //Definition for a binary tree node.
    public class TreeNode {
        public int val;
        TreeNode left;
        public TreeNode right;

        //
        TreeNode () {
        }

        TreeNode (int val) {
            this.val = val;
        }

        TreeNode (int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
//}

        public List<Integer> postorderTraversal (TreeNode root) {
            ArrayList<Integer> ans = new ArrayList<>();

            if (root == null) {
                return ans;
            }

            ArrayDeque<TreeNode> stack = new ArrayDeque<>();
            stack.push(root);

            while (!stack.isEmpty()) {
                TreeNode cur = stack.pop();
                ans.add(cur.val);
                if (cur.right != null) {
                    stack.push(cur.right);
                }
                if (cur.left != null) {
                    stack.push(cur.left);
                }
            }
            return ans;
        }
    }
}
