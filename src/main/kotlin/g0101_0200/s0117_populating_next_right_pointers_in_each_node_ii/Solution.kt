package g0101_0200.s0117_populating_next_right_pointers_in_each_node_ii

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Linked_List
// #Algorithm_II_Day_7_Breadth_First_Search_Depth_First_Search
// #2022_10_08_Time_409_ms_(13.33%)_Space_43.4_MB_(13.33%)

import com_github_leetcode.left_right.Node

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
        if (root.left == null && root.right == null) {
            return root
        }
        if (root.left != null) {
            if (root.right != null) {
                root.left!!.next = root.right
            } else if (root.next != null) {
                root.left!!.next = adjacentRightNode(root.next)
            }
        }
        if (root.right != null) {
            root.right!!.next = adjacentRightNode(root.next)
        }
        connect(root.right)
        connect(root.left)
        return root
    }

    private fun adjacentRightNode(root: Node?): Node? {
        var temp = root
        while (temp != null) {
            if (temp.left == null && temp.right == null) {
                temp = temp.next
            } else {
                if (temp.left != null) {
                    return temp.left
                }
                if (temp.right != null) {
                    return temp.right
                }
            }
        }
        return null
    }
}
