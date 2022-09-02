package g0001_0100.s0024_swap_nodes_in_pairs

import com_github_leetcode.LinkedListUtils.createSinglyLinkedList
import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun swapPairs() {
        val head = createSinglyLinkedList(listOf(1, 2, 3, 4))
        assertThat(Solution().swapPairs(head).toString(), equalTo("2, 1, 4, 3"))
    }

    @Test
    fun swapPairs2() {
        assertThat(Solution().swapPairs(ListNode(1)).toString(), equalTo("1"))
    }
}
