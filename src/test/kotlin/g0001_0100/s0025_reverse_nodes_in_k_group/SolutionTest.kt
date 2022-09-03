package g0001_0100.s0025_reverse_nodes_in_k_group

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reverseKGroup() {
        val head = contructLinkedList(intArrayOf(1, 2, 3, 4, 5))
        assertThat(Solution().reverseKGroup(head, 2).toString(), equalTo("2, 1, 4, 3, 5"))
    }

    @Test
    fun reverseKGroup2() {
        val head = contructLinkedList(intArrayOf(1, 2, 3, 4, 5))
        assertThat(Solution().reverseKGroup(head, 3).toString(), equalTo("3, 2, 1, 4, 5"))
    }
}
