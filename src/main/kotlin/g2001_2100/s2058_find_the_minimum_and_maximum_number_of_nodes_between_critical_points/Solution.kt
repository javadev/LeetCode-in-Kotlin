package g2001_2100.s2058_find_the_minimum_and_maximum_number_of_nodes_between_critical_points

// #Medium #Linked_List #2023_06_25_Time_602_ms_(50.00%)_Space_59.8_MB_(100.00%)

import com_github_leetcode.ListNode

class Solution {
    fun nodesBetweenCriticalPoints(head: ListNode?): IntArray {
        val arr = IntArray(2)
        if (head?.next == null || head.next!!.next == null) {
            arr[0] = -1
            arr[1] = -1
            return arr
        }
        var c1 = 0
        var c2 = 0
        var c3 = 0
        var prev = head
        var curr = prev.next
        var sec = curr!!.next
        var count = 1
        var min = Int.MAX_VALUE
        while (sec != null) {
            count++
            if (curr!!.`val` > prev!!.`val` && curr.`val` > sec.`val` ||
                curr.`val` < prev.`val` && curr.`val` < sec.`val`
            ) {
                if (c1 == 0) {
                    c1 = count
                    c2 = count
                } else {
                    c3 = count
                    min = (c3 - c2).coerceAtMost(min)
                    c2 = c3
                }
            }
            prev = prev.next
            curr = curr.next
            sec = sec.next
        }
        if (c3 == 0) {
            arr[0] = -1
            arr[1] = -1
        } else {
            arr[1] = c3 - c1
            arr[0] = min
        }
        return arr
    }
}
