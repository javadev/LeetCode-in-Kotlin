package g0001_0100.s0023_merge_k_sorted_lists

import com_github_leetcode.LinkedListUtils.createSinglyLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeKLists() {
        val head1 = createSinglyLinkedList(listOf(1, 4, 5))
        val head2 = createSinglyLinkedList(listOf(1, 3, 4))
        val head3 = createSinglyLinkedList(listOf(2, 6))
        assertThat(
            Solution().mergeKLists(arrayOf(head1, head2, head3)).toString(),
            equalTo("1, 1, 2, 3, 4, 4, 5, 6")
        )
    }

    @Test
    fun mergeKLists2() {
        val head1 = createSinglyLinkedList(listOf(1, 3, 5, 7, 11))
        val head2 = createSinglyLinkedList(listOf(2, 8, 12))
        val head3 = createSinglyLinkedList(listOf(4, 6, 9, 10))
        assertThat(
            Solution().mergeKLists(arrayOf(head1, head2, head3)).toString(),
            equalTo("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12")
        )
    }
}
