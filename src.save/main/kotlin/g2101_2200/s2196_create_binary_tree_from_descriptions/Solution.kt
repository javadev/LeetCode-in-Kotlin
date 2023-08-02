package g2101_2200.s2196_create_binary_tree_from_descriptions

// #Medium #Array #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_06_26_Time_933_ms_(100.00%)_Space_58.3_MB_(100.00%)

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
    fun createBinaryTree(descriptions: Array<IntArray>): TreeNode? {
        val map: MutableMap<Int, Data> = HashMap()
        for (description in descriptions) {
            var data = map[description[0]]
            if (data == null) {
                data = Data()
                data.node = TreeNode(description[0])
                data.isHead = true
                map[description[0]] = data
            }
            var childData = map[description[1]]
            if (childData == null) {
                childData = Data()
                childData.node = TreeNode(description[1])
                map[childData.node!!.`val`] = childData
            }
            childData.isHead = false
            if (description[2] == 1) {
                data.node!!.left = childData.node
            } else {
                data.node!!.right = childData.node
            }
        }
        for ((_, value) in map) {
            if (value.isHead) {
                return value.node
            }
        }
        return null
    }

    private class Data {
        var node: TreeNode? = null
        var isHead = false
    }
}
