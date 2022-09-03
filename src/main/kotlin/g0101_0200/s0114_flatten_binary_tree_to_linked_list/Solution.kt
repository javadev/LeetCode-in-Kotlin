package g0101_0200.s0114_flatten_binary_tree_to_linked_list

// #Medium #Top_100_Liked_Questions #Depth_First_Search #Tree #Binary_Tree #Stack #Linked_List
// #Udemy_Linked_List #2022_09_03_Time_305_ms_(26.30%)_Space_35.6_MB_(59.42%)

import com_github_leetcode.TreeNode

class Solution {
    fun flatten(root: TreeNode?) {
        if (root != null) {
            findTail(root)
        }
    }

    private fun findTail(root: TreeNode): TreeNode {
        val left: TreeNode? = root.left
        val right: TreeNode? = root.right
        val tail: TreeNode
        // find the tail of left subtree, tail means the most left leaf
        if (left != null) {
            tail = findTail(left)
            // stitch the right subtree below the tail
            root.left = null
            root.right = left
            tail.right = right
        } else {
            tail = root
        }
        // find tail of the right subtree
        return if (tail.right == null) {
            tail
        } else {
            findTail(tail.right!!)
        }
    }
}
