package g0301_0400.s0328_odd_even_linked_list

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun oddEvenList() {
        val node = ListNode(1)
        node.next = ListNode(2)
        node.next!!.next = ListNode(3)
        node.next!!.next!!.next = ListNode(4)
        node.next!!.next!!.next!!.next = ListNode(5)
        val expected = ListNode(1)
        expected.next = ListNode(3)
        expected.next!!.next = ListNode(5)
        expected.next!!.next!!.next = ListNode(2)
        expected.next!!.next!!.next!!.next = ListNode(4)
        assertThat(Solution().oddEvenList(node).toString(), equalTo(expected.toString()))
    }

    @Test
    fun oddEvenList2() {
        val node = ListNode(2)
        node.next = ListNode(1)
        node.next!!.next = ListNode(3)
        node.next!!.next!!.next = ListNode(5)
        node.next!!.next!!.next!!.next = ListNode(6)
        node.next!!.next!!.next!!.next!!.next = ListNode(4)
        node.next!!.next!!.next!!.next!!.next!!.next = ListNode(7)
        val expected = ListNode(2)
        expected.next = ListNode(3)
        expected.next!!.next = ListNode(6)
        expected.next!!.next!!.next = ListNode(7)
        expected.next!!.next!!.next!!.next = ListNode(1)
        expected.next!!.next!!.next!!.next!!.next = ListNode(5)
        expected.next!!.next!!.next!!.next!!.next!!.next = ListNode(4)
        assertThat(Solution().oddEvenList(node).toString(), equalTo(expected.toString()))
    }
}
