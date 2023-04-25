package g0601_0700.s0652_find_duplicate_subtrees

// #Medium #Hash_Table #Depth_First_Search #Tree #Binary_Tree
// #2023_02_12_Time_266_ms_(76.00%)_Space_59.8_MB_(72.00%)

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
    fun findDuplicateSubtrees(root: TreeNode?): List<TreeNode> {
        val map: MutableMap<String, Int> = HashMap()
        val list: MutableList<TreeNode> = ArrayList<TreeNode>()
        helper(root, map, list)
        return list
    }

    private fun helper(root: TreeNode?, map: MutableMap<String, Int>, list: MutableList<TreeNode>): String {
        if (root == null) {
            return "#"
        }
        val key = helper(root.left, map, list) + "#" + helper(root.right, map, list) + "#" + root.`val`
        map[key] = map.getOrDefault(key, 0) + 1
        if (map[key] == 2) {
            list.add(root)
        }
        return key
    }
}
