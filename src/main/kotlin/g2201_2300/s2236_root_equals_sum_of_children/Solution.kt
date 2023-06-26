package g2201_2300.s2236_root_equals_sum_of_children

import com_github_leetcode.TreeNode

// #Easy #Tree #Binary_Tree
class Solution {
    fun checkTree(root: TreeNode): Boolean {
        return root.left!!.`val` + root.right!!.`val` == root.`val`
    }
}
