package g0101_0200.s0148_sort_list

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Sorting #Two_Pointers #Linked_List
// #Divide_and_Conquer #Merge_Sort #Level_2_Day_4_Linked_List
// #2022_09_06_Time_820_ms_(61.70%)_Space_76_MB_(28.72%)

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
@Suppress("NAME_SHADOWING")
class Solution {
    fun sortList(head: ListNode?): ListNode? {
        if (head == null || head.next == null) {
            return head
        }
        // Step 1: split the list into halves
        var prev: ListNode? = null
        var slow = head
        var fast = head
        while (fast != null && fast.next != null) {
            prev = slow
            fast = fast.next!!.next
            slow = slow!!.next
        }
        prev!!.next = null
        // step 2: sort each half
        val l1 = sortList(head)
        val l2 = sortList(slow)
        // step 3: merge the two halves
        return merge(l1, l2)
    }

    private fun merge(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1 = l1
        var l2 = l2
        val result = ListNode(0)
        var tmp: ListNode? = result
        while (l1 != null && l2 != null) {
            if (l1.`val` < l2.`val`) {
                tmp!!.next = l1
                l1 = l1.next
            } else {
                tmp!!.next = l2
                l2 = l2.next
            }
            tmp = tmp.next
        }
        if (l1 != null) {
            tmp!!.next = l1
        }
        if (l2 != null) {
            tmp!!.next = l2
        }
        return result.next
    }
}
