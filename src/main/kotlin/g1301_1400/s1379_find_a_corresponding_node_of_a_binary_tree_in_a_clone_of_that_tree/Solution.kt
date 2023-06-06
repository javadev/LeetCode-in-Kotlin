package g1301_1400.s1379_find_a_corresponding_node_of_a_binary_tree_in_a_clone_of_that_tree

import com_github_leetcode.TreeNode

// #Easy #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    fun getTargetCopy(
        original: TreeNode?,
        cloned: TreeNode?,
        target: TreeNode
    ): TreeNode? {
        if (original == null) {
            return null
        }
        if (original.`val` == target.`val`) {
            return cloned
        }
        val left = getTargetCopy(original.left, cloned!!.left, target)
        return if (left != null && left.`val` == target.`val`) {
            left
        } else getTargetCopy(original.right, cloned.right, target)
    }
}
