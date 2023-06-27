package g0001_0100.s0086_partition_list

import com_github_leetcode.LinkedListUtils.createSinglyLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun partition() {
        val head = createSinglyLinkedList(listOf(1, 4, 3, 2, 5, 2))
        assertThat(Solution().partition(head, 3).toString(), equalTo("1, 2, 2, 4, 3, 5"))
    }

    @Test
    fun partition2() {
        val head = createSinglyLinkedList(listOf(2, 1))
        assertThat(Solution().partition(head, 2).toString(), equalTo("1, 2"))
    }
}
