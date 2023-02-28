package g0301_0400.s0310_minimum_height_trees

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMinHeightTrees() {
        assertThat(
            Solution().findMinHeightTrees(4, arrayOf(intArrayOf(1, 0), intArrayOf(1, 2), intArrayOf(1, 3))),
            equalTo(listOf(1))
        )
    }

    @Test
    fun findMinHeightTrees2() {
        assertThat(
            Solution()
                .findMinHeightTrees(
                    6, arrayOf(intArrayOf(3, 0), intArrayOf(3, 1), intArrayOf(3, 2), intArrayOf(3, 4), intArrayOf(5, 4))
                ),
            equalTo(listOf(3, 4))
        )
    }
}
