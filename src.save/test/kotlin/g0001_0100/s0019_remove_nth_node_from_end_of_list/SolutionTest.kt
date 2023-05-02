package g0001_0100.s0019_remove_nth_node_from_end_of_list

import com_github_leetcode.LinkedListUtils.contructLinkedList
import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeNthFromEnd() {
        val node1 = contructLinkedList(intArrayOf(1, 2, 3, 4, 5))
        assertThat(Solution().removeNthFromEnd(node1, 2).toString(), equalTo("1, 2, 3, 5"))
    }

    @Test
    fun removeNthFromEnd2() {
        val node1 = ListNode()
        node1.`val` = 1
        assertThat(Solution().removeNthFromEnd(node1, 1), equalTo(null))
    }
}
