package g0401_0500.s0445_add_two_numbers_ii

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun addTwoNumbers() {
        val l1 = contructLinkedList(intArrayOf(7, 2, 4, 3))
        val l2 = contructLinkedList(intArrayOf(5, 6, 4))
        assertThat(Solution().addTwoNumbers(l1, l2).toString(), equalTo("7, 8, 0, 7"))
    }

    @Test
    fun addTwoNumbers2() {
        val l1 = contructLinkedList(intArrayOf(2, 4, 3))
        val l2 = contructLinkedList(intArrayOf(5, 6, 4))
        assertThat(Solution().addTwoNumbers(l1, l2).toString(), equalTo("8, 0, 7"))
    }

    @Test
    fun addTwoNumbers3() {
        val l1 = contructLinkedList(intArrayOf(0))
        val l2 = contructLinkedList(intArrayOf(0))
        assertThat(Solution().addTwoNumbers(l1, l2).toString(), equalTo("0"))
    }
}
