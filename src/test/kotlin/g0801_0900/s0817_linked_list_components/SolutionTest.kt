package g0801_0900.s0817_linked_list_components

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numComponents() {
        val listNode = ListNode(0, ListNode(1, ListNode(2, ListNode(3))))
        assertThat(Solution().numComponents(listNode, intArrayOf(0, 1, 3)), equalTo(2))
    }

    @Test
    fun numComponents2() {
        val listNode = ListNode(0, ListNode(1, ListNode(2, ListNode(3, ListNode(4)))))
        assertThat(Solution().numComponents(listNode, intArrayOf(0, 3, 1, 4)), equalTo(2))
    }
}
