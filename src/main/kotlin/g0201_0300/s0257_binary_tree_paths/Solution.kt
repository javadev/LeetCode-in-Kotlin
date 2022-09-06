package g0201_0300.s0257_binary_tree_paths

import com_github_leetcode.TreeNode

// #Easy #String #Depth_First_Search #Tree #Binary_Tree #Backtracking
// #2022_07_05_Time_2_ms_(93.02%)_Space_43_MB_(71.25%)
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
    private var result: MutableList<String>? = null
    private var sb: StringBuilder? = null
    fun binaryTreePaths(root: TreeNode?): List<String> {
        result = ArrayList()
        if (root == null) {
            return result as ArrayList<String>
        }
        sb = StringBuilder()
        walkThrough(root)
        return result as ArrayList<String>
    }

    private fun walkThrough(root: TreeNode?) {
        assert(root != null)
        var length = sb!!.length
        sb!!.append(root!!.`val`)
        length = sb!!.length - length
        if (root.left == null && root.right == null) {
            // leaf node.
            result!!.add(sb.toString())
            sb!!.delete(sb!!.length - length, sb!!.length)
            return
        }
        sb!!.append("->")
        length += 2
        if (root.left != null) {
            walkThrough(root.left)
        }
        if (root.right != null) {
            walkThrough(root.right)
        }
        sb!!.delete(sb!!.length - length, sb!!.length)
    }
}
