package g0201_0300.s0226_invert_binary_tree

// #Easy #Top_100_Liked_Questions #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #Data_Structure_I_Day_12_Tree #Level_2_Day_6_Tree #Udemy_Tree_Stack_Queue
// #2022_09_10_Time_275_ms_(13.68%)_Space_33.9_MB_(77.67%)

import com_github_leetcode.TreeNode

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
