package g0001_0100.s0023_merge_k_sorted_lists

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeKLists() {
        val head = ListNode()
        val node1 = ListNode()
        node1.`val` = 1
        head.next = node1
        val node2 = ListNode()
        node2.`val` = 4
        node1.next = node2
        val node3 = ListNode()
        node3.`val` = 5
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
        val head3 = ListNode()
        val node7 = ListNode()
        node7.`val` = 2
        head3.next = node7
        val node8 = ListNode()
        node8.`val` = 6
        node7.next = node8
        assertThat(
            Solution().mergeKLists(arrayOf(node1, node4, node7)).toString(),
            equalTo("1, 1, 2, 3, 4, 4, 5, 6")
        )
    }
}
