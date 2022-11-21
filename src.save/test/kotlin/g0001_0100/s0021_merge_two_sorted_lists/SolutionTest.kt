package g0001_0100.s0021_merge_two_sorted_lists

import com_github_leetcode.LinkedListUtils.createSinglyLinkedList
import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeTwoLists() {
        val l1 = createSinglyLinkedList(listOf(1, 2, 4))
        val l2 = createSinglyLinkedList(listOf(1, 3, 4))
        assertThat(Solution().mergeTwoLists(l1, l2).toString(), equalTo("1, 1, 2, 3, 4, 4"))
    }

    @Test
    fun mergeTwoLists2() {
        assertThat(
            Solution().mergeTwoLists(ListNode(), ListNode()).toString(),
            equalTo("0, 0")
        )
    }
}
