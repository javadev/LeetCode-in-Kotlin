package g0001_0100.s0082_remove_duplicates_from_sorted_list_ii

import com_github_leetcode.LinkedListUtils.contructLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun deleteDuplicates() {
        val head = contructLinkedList(intArrayOf(1, 2, 3, 3, 4, 4, 5))
        assertThat(Solution().deleteDuplicates(head).toString(), equalTo("1, 2, 5"))
    }

    @Test
    fun deleteDuplicates2() {
        val head = contructLinkedList(intArrayOf(1, 1, 1, 2, 3))
        assertThat(Solution().deleteDuplicates(head).toString(), equalTo("2, 3"))
    }
}
