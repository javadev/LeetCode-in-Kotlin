package g0301_0400.s0328_odd_even_linked_list

// #Medium #Top_Interview_Questions #Linked_List #Level_2_Day_4_Linked_List #Udemy_Linked_List
// #2022_11_12_Time_216_ms_(86.96%)_Space_36.7_MB_(85.22%)

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
    fun oddEvenList(head: ListNode?): ListNode? {
        val odd = ListNode(0)
        val even = ListNode(0)
        var oddPointer = odd
        var evenPointer = even
        var pointer = head
        var count = 0
        while (pointer != null) {
            if (count % 2 == 0) {
                oddPointer.next = pointer
                oddPointer = oddPointer.next!!
            } else {
                evenPointer.next = pointer
                evenPointer = evenPointer.next!!
            }
            val next = pointer.next
            pointer.next = null
            pointer = next
            count++
        }
        oddPointer.next = even.next
        return odd.next
    }
}
