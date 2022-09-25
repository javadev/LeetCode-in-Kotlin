package g0001_0100.s0083_remove_duplicates_from_sorted_list

import com_github_leetcode.LinkedListUtils.createSinglyLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun deleteDuplicates() {
        val head = createSinglyLinkedList(Arrays.asList(1, 1, 2))
        assertThat(Solution().deleteDuplicates(head).toString(), equalTo("1, 2"))
    }

    @Test
    fun deleteDuplicates2() {
        val head = createSinglyLinkedList(Arrays.asList(1, 1, 2, 3, 3))
        assertThat(Solution().deleteDuplicates(head).toString(), equalTo("1, 2, 3"))
    }
}
