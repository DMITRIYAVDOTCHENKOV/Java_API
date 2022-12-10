package org.example.lesson2;

//Учитывая корни двух двоичных деревьев p и q, напишите функцию, чтобы проверить, совпадают ли они или нет.
//
//        Два двоичных дерева считаются одинаковыми, если они структурно идентичны, а узлы имеют одинаковое значение.
//
//xample 1:
//
//
//        Input: p = [1,2,3], q = [1,2,3]
//        Output: true
//        Example 2:
//
//
//        Input: p = [1,2], q = [1,null,2]
//        Output: false
//        Example 3:
//
//
//        Input: p = [1,2,1], q = [1,1,2]
//        Output: false
//
//
//        Constraints:
//
//        The number of nodes in both trees is in the range [0, 100].
//        -104 <= Node.val <= 104
public class Tack100 {
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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

