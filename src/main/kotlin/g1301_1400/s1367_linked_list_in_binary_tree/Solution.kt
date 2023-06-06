package g1301_1400.s1367_linked_list_in_binary_tree

import com_github_leetcode.ListNode
import com_github_leetcode.TreeNode

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree #Linked_List
// #Programming_Skills_II_Day_4
/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    fun isSubPath(head: ListNode?, root: TreeNode?): Boolean {
        return if (root == null) {
            false
        } else (
            doesRootHaveList(head, root) ||
                isSubPath(head, root.left) ||
                isSubPath(head, root.right)
            )
    }

    private fun doesRootHaveList(head: ListNode?, root: TreeNode?): Boolean {
        if (head == null) {
            return true
        }
        return if (root == null) {
            false
        } else (
            head.`val` == root.`val` &&
                (
                    doesRootHaveList(head.next, root.left) ||
                        doesRootHaveList(head.next, root.right)
                    )
            )
    }
}
