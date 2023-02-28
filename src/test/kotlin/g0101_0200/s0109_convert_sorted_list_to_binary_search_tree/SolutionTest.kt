package g0101_0200.s0109_convert_sorted_list_to_binary_search_tree

import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun convertSortedListToBST() {
        val nodes = ListNode(
            -10, ListNode(-3, ListNode(0, ListNode(5, ListNode(9))))
        )
        assertThat(
            Solution().sortedListToBST(nodes).toString(),
            equalTo("0,-3,-10,null,9,5,null")
        )
    }

    @Test
    fun convertSortedListToBST2() {
        assertThat(Solution().sortedListToBST(null), equalTo(null))
    }
}
