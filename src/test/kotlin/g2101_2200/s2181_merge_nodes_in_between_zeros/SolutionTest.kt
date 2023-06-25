package g2101_2200.s2181_merge_nodes_in_between_zeros

import com_github_leetcode.LinkedListUtils.createSinglyLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeNodes() {
        val head = createSinglyLinkedList(mutableListOf(0, 3, 1, 0, 4, 5, 2, 0))
        assertThat(Solution().mergeNodes(head).toString(), equalTo("4, 11"))
    }

    @Test
    fun mergeNodes2() {
        val head = createSinglyLinkedList(mutableListOf(0, 1, 0, 3, 0, 2, 2, 0))
        assertThat(Solution().mergeNodes(head).toString(), equalTo("1, 3, 4"))
    }
}
