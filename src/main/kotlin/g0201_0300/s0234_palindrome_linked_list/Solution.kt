package g0201_0300.s0234_palindrome_linked_list

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Two_Pointers #Stack #Linked_List
// #Recursion #Level_2_Day_3_Linked_List #Udemy_Linked_List
// #2022_09_10_Time_809_ms_(20.12%)_Space_80.9_MB_(57.11%)

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
        var head = head
        var len = 0
        var right = head
        // Culculate the length
        while (right != null) {
            right = right.next
            len++
        }
        // Reverse the right half of the list
        len = len / 2
        right = head
        for (i in 0 until len) {
            right = right!!.next
        }
        var prev: ListNode? = null
        while (right != null) {
            val next = right.next
            right.next = prev
            prev = right
            right = next
        }
        // Compare left half and right half
        for (i in 0 until len) {
            if (prev != null && head!!.`val` == prev.`val`) {
                head = head.next
                prev = prev.next
            } else {
                return false
            }
        }
        return true
    }
}
