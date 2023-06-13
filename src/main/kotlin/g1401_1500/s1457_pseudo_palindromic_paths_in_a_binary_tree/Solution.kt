package g1401_1500.s1457_pseudo_palindromic_paths_in_a_binary_tree

import com_github_leetcode.TreeNode

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Bit_Manipulation
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
    private var ans = 0
    private lateinit var arr: IntArray

    fun pseudoPalindromicPaths(root: TreeNode?): Int {
        ans = 0
        arr = IntArray(10)
        path(root)
        return ans
    }

    private val isPalidrome: Int
        private get() {
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
            ans += isPalidrome
            arr[root.`val`]--
            return
        }
        arr[root.`val`]++
        path(root.left)
        path(root.right)
        arr[root.`val`]--
    }
}
