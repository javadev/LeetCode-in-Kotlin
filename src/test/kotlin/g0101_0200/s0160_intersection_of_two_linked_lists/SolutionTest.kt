package g0101_0200.s0160_intersection_of_two_linked_lists

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun getIntersectionNode() {
        val intersectionListNode = ListNode(8, ListNode(4, ListNode(5)))
        val nodeA = ListNode(4, ListNode(1, intersectionListNode))
        val nodeB = ListNode(5, ListNode(6, ListNode(1, intersectionListNode)))
        assertThat(Solution().getIntersectionNode(nodeA, nodeB)!!.`val`, equalTo(8))
    }

    @Test
    fun getIntersectionNode2() {
        val nodeA = ListNode(4, ListNode(1, ListNode(2)))
        val nodeB = ListNode(5, ListNode(6, ListNode(1, ListNode(2))))
        assertThat(Solution().getIntersectionNode(nodeA, nodeB), equalTo(null))
    }
}
