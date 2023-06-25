package g2001_2100.s2058_find_the_minimum_and_maximum_number_of_nodes_between_critical_points

import com_github_leetcode.LinkedListUtils.createSinglyLinkedList
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun nodesBetweenCriticalPoints() {
        val node = createSinglyLinkedList(listOf(3, 1))
        assertThat(Solution().nodesBetweenCriticalPoints(node), equalTo(intArrayOf(-1, -1)))
    }

    @Test
    fun nodesBetweenCriticalPoints2() {
        val node = createSinglyLinkedList(listOf(5, 3, 1, 2, 5, 1, 2))
        assertThat(Solution().nodesBetweenCriticalPoints(node), equalTo(intArrayOf(1, 3)))
    }

    @Test
    fun nodesBetweenCriticalPoints3() {
        val node = createSinglyLinkedList(listOf(1, 3, 2, 2, 3, 2, 2, 2, 7))
        assertThat(Solution().nodesBetweenCriticalPoints(node), equalTo(intArrayOf(3, 3)))
    }
}
