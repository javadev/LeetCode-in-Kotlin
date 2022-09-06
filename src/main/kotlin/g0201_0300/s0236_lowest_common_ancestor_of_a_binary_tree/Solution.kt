package g0201_0300.s0236_lowest_common_ancestor_of_a_binary_tree

import com_github_leetcode.TreeNode

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search #Tree #Binary_Tree
// #Data_Structure_II_Day_18_Tree #Udemy_Tree_Stack_Queue
// #2022_07_04_Time_10_ms_(56.51%)_Space_47.4_MB_(45.84%)
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
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode, q: TreeNode): TreeNode? {
        if (root == null) {
            return null
        }
        if (root.`val` == p.`val` || root.`val` == q.`val`) {
            return root
        }
        val left = lowestCommonAncestor(root.left, p, q)
        val right = lowestCommonAncestor(root.right, p, q)
        return if (left != null && right != null) {
            root
        } else left ?: right
    }
}
