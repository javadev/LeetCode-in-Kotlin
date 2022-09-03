package g0101_0200.s0142_linked_list_cycle_ii

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun detectCycle() {
        var listNode = ListNode(3)
        listNode.next = ListNode(2)
        listNode.next!!.next = ListNode(0)
        listNode.next!!.next!!.next = ListNode(-4)
        listNode.next!!.next!!.next!!.next = listNode.next
        assertThat(Solution().detectCycle(listNode), equalTo(listNode.next))
    }

    @Test
    fun detectCycle2() {
        var listNode = ListNode(1)
        listNode.next = ListNode(2)
        listNode.next!!.next = listNode
        assertThat(Solution().detectCycle(listNode), equalTo(listNode))
    }

    @Test
    fun detectCycle3() {
        var listNode = ListNode(1)
        assertThat(Solution().detectCycle(listNode), equalTo(null))
    }
}
