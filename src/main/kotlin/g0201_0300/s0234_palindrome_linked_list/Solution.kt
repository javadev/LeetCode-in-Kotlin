package g0201_0300.s0234_palindrome_linked_list

import com_github_leetcode.ListNode

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Two_Pointers #Stack #Linked_List
// #Recursion #Level_2_Day_3_Linked_List #Udemy_Linked_List
// #2022_07_04_Time_6_ms_(76.07%)_Space_97.6_MB_(56.14%)
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
