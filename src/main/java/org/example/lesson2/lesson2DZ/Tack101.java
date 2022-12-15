package org.example.lesson2.lesson2DZ;
//Учитывая корень двоичного дерева, проверьте, является ли оно зеркалом самого себя
// (т.е. симметричным вокруг своего центра).
//Input: root = [1,2,2,3,4,4,3]
//        Output: true
//        Example 2:
//
//
//        Input: root = [1,2,2,null,3,null,3]
//        Output: false
public class Tack101 {


    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode root1 = root;
        return compare(root.left, root1.right);
    }

    public boolean compare(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null) {
            return true;
        }
        if (root == null || root1 == null) {
            return false;
        }
        if (root.val != root1.val) {
            return false;
        }
        return compare(root.left, root1.right) && compare(root.right, root1.left);
    }

}