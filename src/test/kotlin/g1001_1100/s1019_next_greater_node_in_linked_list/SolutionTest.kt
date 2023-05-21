package g1001_1100.s1019_next_greater_node_in_linked_list

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nextLargerNodes() {
        val head = contructLinkedList(intArrayOf(2, 1, 5))
        assertThat(Solution().nextLargerNodes(head), equalTo(intArrayOf(5, 5, 0)))
    }

    @Test
    fun nextLargerNodes2() {
        val head = contructLinkedList(intArrayOf(2, 7, 4, 3, 5))
        assertThat(Solution().nextLargerNodes(head), equalTo(intArrayOf(7, 0, 5, 5, 0)))
    }
}
