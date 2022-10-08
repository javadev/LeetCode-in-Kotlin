package g0101_0200.s0116_populating_next_right_pointers_in_each_node

// #Medium #Top_Interview_Questions #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #Linked_List #Algorithm_I_Day_8_Breadth_First_Search_Depth_First_Search
// #2022_10_08_Time_355_ms_(69.02%)_Space_45.6_MB_(25.54%)

import com_github_leetcode.LeftRight.Node

/*
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var left: Node? = null
 *     var right: Node? = null
 *     var next: Node? = null
 * }
 */

class Solution {
    fun connect(root: Node?): Node? {
        if (root == null) {
            return null
        }
        if (root.left != null && root.right != null) {
            root.left!!.next = root.right
        }
        if (root.next != null && root.right != null) {
            root.right!!.next = root.next!!.left
        }
        connect(root.left)
        connect(root.right)
        return root
    }
}
