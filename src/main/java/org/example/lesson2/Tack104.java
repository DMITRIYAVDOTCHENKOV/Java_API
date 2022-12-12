package org.example.lesson2;
//Максимальная глубина двоичного дерева - это количество узлов вдоль самого длинного
//        пути от корневого узла до самого дальнего конечного узла.
//Example 1:

//        Input: root = [3,9,20,null,null,15,7]
//        Output: 3
//        Example 2:
//
//        Input: root = [1,null,2]
//        Output: 2

//        Constraints:
//
//        The number of nodes in the tree is in the range [0, 104].
//        -100 <= Node.val <= 100
public class Tack104 {
    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
