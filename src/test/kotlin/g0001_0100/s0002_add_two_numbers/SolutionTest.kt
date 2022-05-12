package g0001_0100.s0002_add_two_numbers

import com_github_leetcode.LinkedListUtils
import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun addTwoNumbers() {
        val listNode1: ListNode? = LinkedListUtils.contructLinkedList(intArrayOf(2, 4, 3))
        val listNode2: ListNode? = LinkedListUtils.contructLinkedList(intArrayOf(5, 6, 4))
        assertThat(
            Solution().addTwoNumbers(listNode1, listNode2).toString(), equalTo("7, 0, 8")
        )
    }

    @Test
    fun addTwoNumbers2() {
        assertThat(
            Solution().addTwoNumbers(ListNode(0), ListNode(0)).toString(),
            equalTo("0")
        )
    }

    @Test
    fun addTwoNumbers3() {
        val listNode1: ListNode? = LinkedListUtils.contructLinkedList(intArrayOf(9, 9, 9, 9, 9, 9, 9))
        val listNode2: ListNode? = LinkedListUtils.contructLinkedList(intArrayOf(9, 9, 9, 9))
        assertThat(
            Solution().addTwoNumbers(listNode1, listNode2).toString(),
            equalTo("8, 9, 9, 9, 0, 0, 0, 1")
        )
    }
}
