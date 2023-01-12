package g0501_0600.s0508_most_frequent_subtree_sum

// #Medium #Hash_Table #Depth_First_Search #Tree #Binary_Tree
// #2023_01_10_Time_246_ms_(80.00%)_Space_38.4_MB_(93.33%)

import com_github_leetcode.TreeNode

/*
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    private val cache = mutableMapOf<Int, Int>()

    fun findFrequentTreeSum(root: TreeNode?): IntArray {
        treeSum(root)
        if (cache.isEmpty()) {
            return IntArray(0)
        }
        val max = cache.maxBy { it.value }!!.value
        return cache.filter { it.value == max }.map { it.key }.toIntArray()
    }

    private fun treeSum(node: TreeNode?): Int {
        if (node == null) {
            return 0
        } else {
            val sum = node.`val` + treeSum(node.left) + treeSum(node.right)
            cache[sum] = cache.getOrDefault(sum, 0) + 1
            return sum
        }
    }
}
