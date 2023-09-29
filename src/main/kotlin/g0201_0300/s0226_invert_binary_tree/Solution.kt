package g0201_0300.s0226_invert_binary_tree

// #Easy #Top_100_Liked_Questions #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #Data_Structure_I_Day_12_Tree #Level_2_Day_6_Tree #Udemy_Tree_Stack_Queue
// #Big_O_Time_O(n)_Space_O(n) #2022_09_27_Time_233_ms_(54.90%)_Space_34.5_MB_(11.33%)

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
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        val temp: TreeNode? = root.left
        root.left = invertTree(root.right)
        root.right = invertTree(temp)
        return root
    }
}
