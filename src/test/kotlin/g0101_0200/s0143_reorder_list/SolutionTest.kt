package g0101_0200.s0143_reorder_list

import com_github_leetcode.LinkedListUtils.createSinglyLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reorderList() {
        val head = createSinglyLinkedList(listOf(1, 2, 3, 4))
        val expected = createSinglyLinkedList(listOf(1, 4, 2, 3))
        Solution().reorderList(head)
        assertThat(head.toString(), equalTo(expected.toString()))
    }

    @Test
    fun reorderList2() {
        val head = createSinglyLinkedList(listOf(1, 2, 3, 4, 5))
        val expected = createSinglyLinkedList(listOf(1, 5, 2, 4, 3))
        Solution().reorderList(head)
        assertThat(head.toString(), equalTo(expected.toString()))
    }
}
