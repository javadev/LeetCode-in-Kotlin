package g0301_0400.s0382_linked_list_random_node

// #Medium #Math #Linked_List #Randomized #Reservoir_Sampling
// #2022_11_24_Time_479_ms_(60.00%)_Space_53.4_MB_(40.00%)

import com_github_leetcode.ListNode
import java.util.Random

/*
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
@Suppress("kotlin:S2245")
class Solution(private val head: ListNode?) {
    private val random = Random()

    fun getRandom(): Int {
        var node = head
        var count = 0
        var res = 0
        while (node != null) {
            count++
            if (random.nextInt(count) == 0)
                res = node.`val`
            node = node.next
        }
        return res
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(head)
 * var param_1 = obj.getRandom()
 */
