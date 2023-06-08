package g1201_1300.s1290_convert_binary_number_in_a_linked_list_to_integer

// #Easy #Math #Linked_List #Programming_Skills_I_Day_10_Linked_List_and_Tree
// #2023_06_08_Time_145_ms_(25.93%)_Space_33.4_MB_(92.59%)

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
    fun getDecimalValue(head: ListNode?): Int {
        var l = 0
        var curr = head
        while (curr!!.next != null) {
            l++
            curr = curr.next
        }
        curr = head
        var num = 0
        while (curr != null) {
            num += curr.`val` * Math.pow(2.0, l--.toDouble()).toInt()
            curr = curr.next
        }
        return num
    }
}
