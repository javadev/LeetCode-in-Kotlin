package g0101_0200.s0104_maximum_depth_of_binary_tree

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Depth_First_Search #Breadth_First_Search
// #Tree #Binary_Tree #Data_Structure_I_Day_11_Tree
// #Programming_Skills_I_Day_10_Linked_List_and_Tree #Udemy_Tree_Stack_Queue
// #2022_09_02_Time_236_ms_(83.39%)_Space_36.2_MB_(88.26%)

import com_github_leetcode.TreeNode
import kotlin.math.max

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        return findDepth(root, 0)
    }

    private fun findDepth(node: TreeNode?, currentDepth: Int): Int {
        var localCurrentDepth = currentDepth
        if (node == null) {
            return 0
        }
        localCurrentDepth++
        return 1 + max(findDepth(node.left, localCurrentDepth), findDepth(node.right, localCurrentDepth))
    }
}
