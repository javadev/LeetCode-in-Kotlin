package g2401_2500.s2487_remove_nodes_from_linked_list

import com_github_leetcode.ListNode

// #Medium #Stack #Linked_List #Monotonic_Stack #Recursion
class Solution {
    fun removeNodes(head: ListNode?): ListNode? {
        var head = head
        head = reverse(head)
        if (head == null) {
            return null
        }
        var max = head.`val`
        var temp = head
        var temp1 = head.next
        while (temp1 != null) {
            if (temp1.`val` >= max) {
                max = temp1.`val`
                temp!!.next = temp1
                temp = temp.next
            }
            temp1 = temp1.next
        }
        temp!!.next = null
        return reverse(head)
    }

    private fun reverse(head: ListNode?): ListNode? {
        if (head == null || head.next == null) {
            return head
        }
        var prev: ListNode? = null
        var curr = head
        var next: ListNode?
        while (curr != null) {
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }
        return prev
    }
}
