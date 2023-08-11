package g0201_0300.s0206_reverse_linked_list

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseList() {
        val headActual = ListNode(1)
        headActual.next = ListNode(2)
        headActual.next!!.next = ListNode(3)
        headActual.next!!.next!!.next = ListNode(4)
        headActual.next!!.next!!.next!!.next = ListNode(5)
        assertThat(Solution().reverseList(headActual).toString(), equalTo("5, 4, 3, 2, 1"))
    }

    @Test
    fun reverseList2() {
        val headActual = ListNode(1)
        headActual.next = ListNode(2)
        assertThat(Solution().reverseList(headActual).toString(), equalTo("2, 1"))
    }

    @Test
    fun reverseList3() {
        assertThat(Solution().reverseList(null), equalTo(null))
    }
}
