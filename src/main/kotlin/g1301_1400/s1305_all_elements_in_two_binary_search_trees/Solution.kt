package g1301_1400.s1305_all_elements_in_two_binary_search_trees

import com_github_leetcode.TreeNode

// #Medium #Sorting #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    fun getAllElements(root1: TreeNode, root2: TreeNode): List<Int> {
        val list1 = getAllNodes(root1)
        val list2 = getAllNodes(root2)
        val merged: MutableList<Int> = ArrayList()
        merged.addAll(list1)
        merged.addAll(list2)
        merged.sort()
        return merged
    }

    private fun getAllNodes(root: TreeNode): List<Int> {
        val list: MutableList<Int> = ArrayList()
        return inorder(root, list)
    }

    private fun inorder(root: TreeNode?, result: MutableList<Int>): List<Int> {
        if (root == null) {
            return result
        }
        inorder(root.left, result)
        result.add(root.`val`)
        return inorder(root.right, result)
    }
}
