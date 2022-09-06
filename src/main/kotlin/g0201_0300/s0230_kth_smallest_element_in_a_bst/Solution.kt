package g0201_0300.s0230_kth_smallest_element_in_a_bst

import com_github_leetcode.TreeNode

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search #Tree #Binary_Tree
// #Binary_Search_Tree #Data_Structure_II_Day_17_Tree #Level_2_Day_9_Binary_Search_Tree
// #2022_07_04_Time_1_ms_(78.91%)_Space_45.3_MB_(58.87%)
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
    private var k = 0
    private var count = 0
    private var `val` = 0
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        this.k = k
        calculate(root)
        return `val`
    }

    private fun calculate(node: TreeNode?) {
        if (node!!.left == null && node.right == null) {
            count++
            if (count == k) {
                `val` = node.`val`
            }
            return
        }
        if (node.left != null) {
            calculate(node.left)
        }
        count++
        if (count == k) {
            `val` = node.`val`
            return
        }
        if (node.right != null) {
            calculate(node.right)
        }
    }
}
