package g0101_0200.s0124_binary_tree_maximum_path_sum

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Dynamic_Programming #Depth_First_Search
// #Tree #Binary_Tree #Udemy_Tree_Stack_Queue
// #2022_09_03_Time_331_ms_(74.42%)_Space_45.1_MB_(59.88%)

import com_github_leetcode.TreeNode

class Solution {
    private var max = Int.MIN_VALUE
    private fun helper(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        // to avoid the -ve values in left side we will compare them with 0
        val left = Math.max(0, helper(root.left))
        val right = Math.max(0, helper(root.right))
        val current: Int = root.`val` + left + right
        if (current > max) {
            max = current
        }
        return root.`val` + Math.max(left, right)
    }

    fun maxPathSum(root: TreeNode?): Int {
        helper(root)
        return max
    }
}
