package g0101_0200.s0199_binary_tree_right_side_view

import com_github_leetcode.TreeNode

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #Data_Structure_II_Day_16_Tree #Level_2_Day_15_Tree
// #2022_09_08_Time_179_ms_(97.61%)_Space_35.3_MB_(67.90%)

class Solution {
    /**
     * credit: https://leetcode.com/problems/binary-tree-right-side-view/discuss/56012/My-simple-accepted-solution(JAVA)
     */
    fun rightSideView(root: TreeNode?): List<Int> {
        val result: MutableList<Int> = ArrayList()
        rightView(root, result, 0)
        return result
    }

    fun rightView(curr: TreeNode?, result: MutableList<Int>, currDepth: Int) {
        if (curr == null) {
            return
        }
        if (currDepth == result.size) {
            result.add(curr.`val`)
        }
        rightView(curr.right, result, currDepth + 1)
        rightView(curr.left, result, currDepth + 1)
    }
}
