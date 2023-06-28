package g2201_2300.s2265_count_nodes_equal_to_average_of_subtree

import com_github_leetcode.TreeNode

// #Medium #Depth_First_Search #Tree #Binary_Tree
class Solution {
    private var ans = 0
    fun averageOfSubtree(root: TreeNode?): Int {
        dfs(root)
        return ans
    }

    private fun dfs(node: TreeNode?): IntArray {
        if (node == null) {
            return intArrayOf(0, 0)
        }
        val left = dfs(node.left)
        val right = dfs(node.right)
        val currsum = left[0] + right[0] + node.`val`
        val currcount = left[1] + right[1] + 1
        if (currsum / currcount == node.`val`) {
            ++ans
        }
        return intArrayOf(currsum, currcount)
    }
}
