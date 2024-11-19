package g2101_2200.s2192_all_ancestors_of_a_node_in_a_directed_acyclic_graph

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun ancestors() {
        val edges = arrayOf(
            intArrayOf(0, 3),
            intArrayOf(0, 4),
            intArrayOf(1, 3),
            intArrayOf(2, 4),
            intArrayOf(2, 7),
            intArrayOf(3, 5),
            intArrayOf(3, 6),
            intArrayOf(3, 7),
            intArrayOf(4, 6),
        )
        val expected = arrayOf(
            intArrayOf(),
            intArrayOf(),
            intArrayOf(),
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(0, 1, 3),
            intArrayOf(0, 1, 2, 3, 4),
            intArrayOf(0, 1, 2, 3),
        )
        assertThat(
            Solution().getAncestors(8, edges),
            equalTo(getLists(expected)),
        )
    }

    @Test
    fun ancestors2() {
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(0, 3),
            intArrayOf(0, 4),
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 4),
            intArrayOf(2, 3),
            intArrayOf(2, 4),
            intArrayOf(3, 4),
        )
        val expected = arrayOf(
            intArrayOf(),
            intArrayOf(0),
            intArrayOf(0, 1),
            intArrayOf(0, 1, 2),
            intArrayOf(0, 1, 2, 3),
            intArrayOf(),
            intArrayOf(),
            intArrayOf(),
        )
        assertThat(
            Solution().getAncestors(8, edges),
            equalTo(getLists(expected)),
        )
    }
}
