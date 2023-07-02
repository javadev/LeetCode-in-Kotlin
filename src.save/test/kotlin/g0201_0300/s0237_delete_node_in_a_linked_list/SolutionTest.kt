package g0201_0300.s0237_delete_node_in_a_linked_list

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun deleteNode() {
        val headActual = ListNode(1)
        headActual.next = ListNode(2)
        headActual.next!!.next = ListNode(3)
        headActual.next!!.next!!.next = ListNode(4)
        Solution().deleteNode(headActual.next!!.next)
        assertThat(headActual.toString(), equalTo("1, 2, 4"))
    }

    @Test
    fun deleteNode2() {
        val headActual = ListNode(1)
        headActual.next = ListNode(2)
        headActual.next!!.next = ListNode(3)
        headActual.next!!.next!!.next = ListNode(4)
        Solution().deleteNode(headActual)
        assertThat(headActual.toString(), equalTo("2, 3, 4"))
    }

    @Test
    fun deleteNode3() {
        val headActual = ListNode(1)
        headActual.next = ListNode(2)
        headActual.next!!.next = ListNode(3)
        headActual.next!!.next!!.next = ListNode(4)
        Solution().deleteNode(headActual.next)
        assertThat(headActual.toString(), equalTo("1, 3, 4"))
    }
}
