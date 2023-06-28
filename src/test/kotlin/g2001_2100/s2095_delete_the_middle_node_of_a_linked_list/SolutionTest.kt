package g2001_2100.s2095_delete_the_middle_node_of_a_linked_list

import com_github_leetcode.LinkedListUtils.createSinglyLinkedList
import com_github_leetcode.ListNode
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun deleteMiddle() {
        val node = createSinglyLinkedList(listOf(1, 3, 4, 7, 1, 2, 6))
        assertThat(Solution().deleteMiddle(node).toString(), equalTo("1, 3, 4, 1, 2, 6"))
    }

    @Test
    fun deleteMiddle2() {
        val node = createSinglyLinkedList(listOf(1, 2, 3, 4))
        assertThat(Solution().deleteMiddle(node).toString(), equalTo("1, 2, 4"))
    }

    @Test
    fun deleteMiddle3() {
        val node = createSinglyLinkedList(listOf(2, 1))
        assertThat(Solution().deleteMiddle(node).toString(), equalTo("2"))
    }

    @Test
    fun deleteMiddle4() {
        assertThat(Solution().deleteMiddle(ListNode()), equalTo(null))
    }
}
