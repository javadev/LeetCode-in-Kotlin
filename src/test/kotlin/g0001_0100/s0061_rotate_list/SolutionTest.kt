package g0001_0100.s0061_rotate_list

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rotateRight() {
        val headActual = ListNode(1)
        headActual.next = ListNode(2)
        headActual.next!!.next = ListNode(3)
        headActual.next!!.next!!.next = ListNode(4)
        headActual.next!!.next!!.next!!.next = ListNode(5)
        assertThat(Solution().rotateRight(headActual, 2).toString(), equalTo("4, 5, 1, 2, 3"))
    }

    @Test
    fun rotateRight2() {
        val headActual = ListNode(0)
        headActual.next = ListNode(1)
        headActual.next!!.next = ListNode(2)
        assertThat(Solution().rotateRight(headActual, 4).toString(), equalTo("2, 0, 1"))
    }
}
