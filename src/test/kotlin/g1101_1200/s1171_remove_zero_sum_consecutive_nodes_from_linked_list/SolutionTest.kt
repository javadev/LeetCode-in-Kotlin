package g1101_1200.s1171_remove_zero_sum_consecutive_nodes_from_linked_list

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeZeroSumSublists() {
        val head = contructLinkedList(intArrayOf(1, 2, -3, 3, 1))
        val expected = contructLinkedList(intArrayOf(3, 1))
        MatcherAssert.assertThat(
            Solution().removeZeroSumSublists(head).toString(),
            CoreMatchers.equalTo(expected.toString())
        )
    }

    @Test
    fun removeZeroSumSublists2() {
        val head = contructLinkedList(intArrayOf(1, 2, 3, -3, 4))
        val expected = contructLinkedList(intArrayOf(1, 2, 4))
        MatcherAssert.assertThat(
            Solution().removeZeroSumSublists(head).toString(),
            CoreMatchers.equalTo(expected.toString())
        )
    }

    @Test
    fun removeZeroSumSublists3() {
        val head = contructLinkedList(intArrayOf(1, 2, 3, -3, -2))
        val expected = contructLinkedList(intArrayOf(1))
        MatcherAssert.assertThat(
            Solution().removeZeroSumSublists(head).toString(),
            CoreMatchers.equalTo(expected.toString())
        )
    }
}
