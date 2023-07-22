package g0801_0900.s0863_all_nodes_distance_k_in_binary_tree

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2023_04_04_Time_147_ms_(95.83%)_Space_35.2_MB_(95.83%)

import com_github_leetcode.TreeNode

/*
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    private fun kFar(root: TreeNode?, k: Int, visited: TreeNode?, ls: MutableList<Int>) {
        if (root == null || k < 0 || root === visited) {
            return
        }
        if (k == 0) {
            ls.add(root.`val`)
            return
        }
        kFar(root.left, k - 1, visited, ls)
        kFar(root.right, k - 1, visited, ls)
    }

    fun distanceK(root: TreeNode?, target: TreeNode?, k: Int): List<Int> {
        val ls: MutableList<Int> = ArrayList()
        if (k == 0) {
            ls.add(target!!.`val`)
            return ls
        }
        nodeToRoot(root, target!!, k, ls)
        return ls
    }

    private fun nodeToRoot(root: TreeNode?, target: TreeNode, k: Int, ls: MutableList<Int>): Int {
        if (root == null) {
            return -1
        }
        if (root.`val` == target.`val`) {
            kFar(root, k, null, ls)
            return 1
        }
        val ld = nodeToRoot(root.left, target, k, ls)
        if (ld != -1) {
            kFar(root, k - ld, root.left, ls)
            return ld + 1
        }
        val rd = nodeToRoot(root.right, target, k, ls)
        if (rd != -1) {
            kFar(root, k - rd, root.right, ls)
            return rd + 1
        }
        return -1
    }
}
