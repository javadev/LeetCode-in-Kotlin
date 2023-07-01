package g2301_2400.s2331_evaluate_boolean_binary_tree

// #Easy #Depth_First_Search #Tree #Binary_Search
// #2023_07_01_Time_199_ms_(91.67%)_Space_37.7_MB_(83.33%)

import com_github_leetcode.TreeNode

class Solution {
    fun evaluateTree(root: TreeNode?): Boolean {
        return if (root!!.left == null) {
            root.`val` == 1
        } else {
            if (root.`val` == 2) {
                evaluateTree(root.left) || evaluateTree(root.right)
            } else {
                evaluateTree(root.left) && evaluateTree(root.right)
            }
        }
    }
}