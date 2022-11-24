package g0301_0400.s0382_linked_list_random_node

// #Medium #Math #Linked_List #Randomized #Reservoir_Sampling
// #2022_11_24_Time_283_ms_(100.00%)_Space_38.6_MB_(100.00%)

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
class Solution(head: ListNode?) {
    private val al: MutableList<Int>
    private val rand: Random

    init {
        var head = head
        al = ArrayList()
        rand = Random()
        while (head != null) {
            al.add(head.`val`)
            head = head.next
        }
    }

    fun getRandom(): Int {
        /*
        Math.random() will generate a random number b/w 0 & 1.
        then multiply it with the array size.
        take only the integer part which is a random index.
        return the element at that random index.
         */
        val ind = rand.nextInt(al.size)
        return al[ind]
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(head)
 * var param_1 = obj.getRandom()
 */
