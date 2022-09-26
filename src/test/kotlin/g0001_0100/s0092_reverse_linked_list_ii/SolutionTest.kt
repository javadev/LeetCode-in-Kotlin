package g0001_0100.s0092_reverse_linked_list_ii

import com_github_leetcode.LinkedListUtils.createSinglyLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun reverseBetween() {
        val node1 = createSinglyLinkedList(Arrays.asList(1, 2, 3, 4, 5))
        assertThat(Solution().reverseBetween(node1, 2, 4).toString(), equalTo("1, 4, 3, 2, 5"))
    }

    @Test
    fun reverseBetween2() {
        val node1 = createSinglyLinkedList(Arrays.asList(5))
        assertThat(Solution().reverseBetween(node1, 1, 1).toString(), equalTo("5"))
    }
}
