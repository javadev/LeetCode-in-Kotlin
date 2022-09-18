package g0101_0200.s0141_linked_list_cycle

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hasCycle1() {
        val listNode1 = ListNode(3)
        listNode1.next = ListNode(2)
        listNode1.next!!.next = ListNode(0)
        listNode1.next!!.next!!.next = ListNode(-4)
        listNode1.next!!.next!!.next!!.next = listNode1.next
        assertThat(Solution().hasCycle(listNode1), equalTo(true))
    }

    @Test
    fun hasCycle2() {
        val listNode1 = ListNode(1)
        listNode1.next = ListNode(2)
        listNode1.next!!.next = listNode1
        assertThat(Solution().hasCycle(listNode1), equalTo(true))
    }

    @Test
    fun hasCycle3() {
        val listNode1 = ListNode(1)
        assertThat(Solution().hasCycle(listNode1), equalTo(false))
    }

    @Test
    fun hasCycle4() {
        assertThat(Solution().hasCycle(null), equalTo(false))
    }
}
