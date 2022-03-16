package g0001_0100.s0021_merge_two_sorted_lists

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeTwoLists() {
        val head = ListNode()
        val node1 = ListNode()
        node1.`val` = 1
        head.next = node1
        val node2 = ListNode()
        node2.`val` = 2
        node1.next = node2
        val node3 = ListNode()
        node3.`val` = 4
        node2.next = node3
        val head2 = ListNode()
        val node4 = ListNode()
        node4.`val` = 1
        head2.next = node4
        val node5 = ListNode()
        node5.`val` = 3
        node4.next = node5
        val node6 = ListNode()
        node6.`val` = 4
        node5.next = node6
        assertThat(
            Solution().mergeTwoLists(node1, node4).toString(), equalTo("1, 1, 2, 3, 4, 4")
        )
    }
}
