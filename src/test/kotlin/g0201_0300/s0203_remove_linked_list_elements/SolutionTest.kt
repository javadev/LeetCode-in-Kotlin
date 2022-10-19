package g0201_0300.s0203_remove_linked_list_elements

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeElements() {
        val headActual = ListNode(1)
        headActual.next = ListNode(2)
        headActual.next!!.next = ListNode(6)
        headActual.next!!.next!!.next = ListNode(3)
        headActual.next!!.next!!.next!!.next = ListNode(4)
        headActual.next!!.next!!.next!!.next!!.next = ListNode(5)
        headActual.next!!.next!!.next!!.next!!.next!!.next = ListNode(6)
        assertThat(
            Solution().removeElements(headActual, 6).toString(), equalTo("1, 2, 3, 4, 5")
        )
    }

    @Test
    fun removeElements2() {
        assertThat(Solution().removeElements(null, 1), equalTo(null))
    }

    @Test
    fun removeElements3() {
        val headActual = ListNode(7)
        headActual.next = ListNode(7)
        headActual.next!!.next = ListNode(7)
        headActual.next!!.next!!.next = ListNode(7)
        assertThat(Solution().removeElements(headActual, 7), equalTo(null))
    }
}
