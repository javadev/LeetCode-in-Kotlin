package g0101_0200.s0160_intersection_of_two_linked_lists

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Hash_Table #Two_Pointers #Linked_List
// #Data_Structure_II_Day_11_Linked_List #Udemy_Linked_List
// #2022_09_07_Time_169_ms_(100.00%)_Space_39_MB_(89.58%)

import com_github_leetcode.ListNode

class Solution {
    /**
     * Time: O(max(m, n))
     * Space: O(1)
     */
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var headA = headA
        var headB = headB
        var lenA = findLen(headA)
        var lenB = findLen(headB)
        /**align headA and headB to the same starting point and then move together until we find the intersection point */
        while (lenA < lenB) {
            headB = headB!!.next
            lenB--
        }
        while (lenB < lenA) {
            headA = headA!!.next
            lenA--
        }
        while (headA != headB) {
            headA = headA!!.next
            headB = headB!!.next
        }
        return headA
    }

    private fun findLen(head: ListNode?): Int {
        var head = head
        var len = 0
        while (head != null) {
            head = head.next
            len++
        }
        return len
    }
}
