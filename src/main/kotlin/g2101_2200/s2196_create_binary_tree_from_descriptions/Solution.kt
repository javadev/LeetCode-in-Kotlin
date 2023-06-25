package g2101_2200.s2196_create_binary_tree_from_descriptions

import com_github_leetcode.TreeNode

// #Medium #Array #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
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
