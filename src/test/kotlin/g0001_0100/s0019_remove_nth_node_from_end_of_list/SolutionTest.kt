package g0001_0100.s0019_remove_nth_node_from_end_of_list

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeNthFromEnd() {
        val head = ListNode()
        val node1 = ListNode()
        node1.`val` = 1
        head.next = node1
        val node2 = ListNode()
        node2.`val` = 2
        node1.next = node2
        val node3 = ListNode()
        node3.`val` = 3
        node2.next = node3
        val node4 = ListNode()
        node4.`val` = 4
        node3.next = node4
        val node5 = ListNode()
        node5.`val` = 5
        node4.next = node5
        assertThat(Solution().removeNthFromEnd(node1, 2).toString(), equalTo("1, 2, 3, 5"))
    }
}
