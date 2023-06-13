package g1401_1500.s1457_pseudo_palindromic_paths_in_a_binary_tree

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Bit_Manipulation
// #2023_06_13_Time_583_ms_(50.00%)_Space_62.9_MB_(100.00%)

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
    private var ans = 0
    private lateinit var arr: IntArray

    fun pseudoPalindromicPaths(root: TreeNode?): Int {
        ans = 0
        arr = IntArray(10)
        path(root)
        return ans
    }

    private fun isPalidrome(): Int {
        var c = 0
        var s = 0
        for (i in 0..9) {
            s += arr[i]
            if (arr[i] % 2 != 0) {
                c++
            }
        }
        if (s % 2 == 0) {
            return if (c == 0) 1 else 0
        }
        return if (c <= 1) 1 else 0
    }

    private fun path(root: TreeNode?) {
        if (root == null) {
            return
        }
        if (root.left == null && root.right == null) {
            arr[root.`val`]++
            ans += isPalidrome()
            arr[root.`val`]--
            return
        }
        arr[root.`val`]++
        path(root.left)
        path(root.right)
        arr[root.`val`]--
    }
}
