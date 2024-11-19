package g1401_1500.s1489_find_critical_and_pseudo_critical_edges_in_minimum_spanning_tree

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findCriticalAndPseudoCriticalEdges() {
        assertThat(
            Solution()
                .findCriticalAndPseudoCriticalEdges(
                    5,
                    arrayOf(
                        intArrayOf(0, 1, 1),
                        intArrayOf(1, 2, 1),
                        intArrayOf(2, 3, 2),
                        intArrayOf(0, 3, 2),
                        intArrayOf(0, 4, 3),
                        intArrayOf(3, 4, 3),
                        intArrayOf(1, 4, 6),
                    ),
                ),
            equalTo(getLists(arrayOf(intArrayOf(0, 1), intArrayOf(2, 3, 4, 5)))),
        )
    }

    @Test
    fun findCriticalAndPseudoCriticalEdges2() {
        assertThat(
            Solution()
                .findCriticalAndPseudoCriticalEdges(
                    4,
                    arrayOf(intArrayOf(0, 1, 1), intArrayOf(1, 2, 1), intArrayOf(2, 3, 1), intArrayOf(0, 3, 1)),
                ),
            equalTo(getLists(arrayOf(intArrayOf(), intArrayOf(0, 1, 2, 3)))),
        )
    }
}
