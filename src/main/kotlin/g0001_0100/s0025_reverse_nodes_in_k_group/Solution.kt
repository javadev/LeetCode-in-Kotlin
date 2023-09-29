package g0001_0100.s0025_reverse_nodes_in_k_group

// #Hard #Top_100_Liked_Questions #Linked_List #Recursion #Data_Structure_II_Day_13_Linked_List
// #Udemy_Linked_List #Big_O_Time_O(n)_Space_O(k)
// #2023_07_03_Time_189_ms_(67.03%)_Space_36.7_MB_(71.43%)

import com_github_leetcode.ListNode

/*
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        if (head?.next == null || k == 1) {
            return head
        }
        var j = 0
        var len = head
        // loop for checking the length of the linklist, if the linklist is less than k, then return
        // as it is.
        while (j < k) {
            if (len == null) {
                return head
            }
            len = len.next
            j++
        }
        // Reverse linked list logic applied here.
        var c = head
        var n: ListNode? = null
        var prev: ListNode? = null
        var i = 0
        // Traverse the while loop for K times to reverse the node in K groups.
        while (i != k) {
            n = c!!.next
            c.next = prev
            prev = c
            c = n
            i++
        }
        // C1 is pointing to 1st node of K group, which is now going to point to the next K group
        // linklist.
        // recursion, for futher remaining linked list.
        head.next = reverseKGroup(n, k)
        return prev
    }
}
