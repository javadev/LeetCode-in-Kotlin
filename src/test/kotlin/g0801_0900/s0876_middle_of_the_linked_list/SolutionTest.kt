package g0801_0900.s0876_middle_of_the_linked_list

import com_github_leetcode.LinkedListUtils.createSinglyLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun middleNode() {
        val head = createSinglyLinkedList(listOf(1, 2, 3, 4, 5))
        assertThat(
            Solution().middleNode(head).toString(),
            equalTo(createSinglyLinkedList(listOf(3, 4, 5)).toString()),
        )
    }

    @Test
    fun middleNode2() {
        val head = createSinglyLinkedList(listOf(1, 2, 3, 4, 5, 6))
        assertThat(
            Solution().middleNode(head).toString(),
            equalTo(createSinglyLinkedList(listOf(4, 5, 6)).toString()),
        )
    }
}
