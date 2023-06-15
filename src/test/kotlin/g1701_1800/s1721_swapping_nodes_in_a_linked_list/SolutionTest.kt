package g1701_1800.s1721_swapping_nodes_in_a_linked_list

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun swapNodes() {
        assertThat(
                Solution()
                        .swapNodes(contructLinkedList(intArrayOf(1, 2, 3, 4, 5)), 2)
                        .toString(),
                equalTo(contructLinkedList(intArrayOf(1, 4, 3, 2, 5)).toString()))
    }

    @Test
    fun swapNodes2() {
        assertThat(
                Solution()
                        .swapNodes(
                                contructLinkedList(intArrayOf(7, 9, 6, 6, 7, 8, 3, 0, 9, 5)),
                                5)
                        .toString(),
                equalTo(
                        contructLinkedList(intArrayOf(7, 9, 6, 6, 8, 7, 3, 0, 9, 5))
                                .toString()))
    }
}
