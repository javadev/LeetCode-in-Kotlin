package g0101_0200.s0141_linked_list_cycle

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Hash_Table #Two_Pointers #Linked_List
// #Data_Structure_I_Day_7_Linked_List #Udemy_Linked_List
// #2022_09_03_Time_425_ms_(10.15%)_Space_43.4_MB_(46.26%)

import com_github_leetcode.ListNode

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if (head == null) {
            return false
        }
        var fast = head.next
        var slow = head
        while (fast?.next != null) {
            if (fast == slow) {
                return true
            }
            fast = fast.next!!.next
            slow = slow!!.next
        }
        return false
    }
}
