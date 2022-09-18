package g0201_0300.s0234_palindrome_linked_list

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Two_Pointers #Stack #Linked_List
// #Recursion #Level_2_Day_3_Linked_List #Udemy_Linked_List
// #2022_09_18_Time_641_ms_(79.53%)_Space_80.9_MB_(58.23%)

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
    fun isPalindrome(head: ListNode?): Boolean {
        var fast = head
        var slow = head
        while (fast?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }
        var right = reverse(slow)
        var left = head
        while (right != null && left != null) {
            if (right.`val` != left.`val`) {
                return false
            }
            left = left.next
            right = right.next
        }
        return true
    }

    fun reverse(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var current = head
        while (current != null) {
            val next = current.next
            current.next = prev
            prev = current
            current = next
        }
        head?.next = null
        return prev
    }
}
