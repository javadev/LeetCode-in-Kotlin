package g2201_2300.s2203_minimum_weighted_subgraph_with_the_required_paths

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumWeight() {
        assertThat(
            Solution()
                .minimumWeight(
                    6,
                    arrayOf(
                        intArrayOf(0, 2, 2),
                        intArrayOf(0, 5, 6),
                        intArrayOf(1, 0, 3),
                        intArrayOf(1, 4, 5),
                        intArrayOf(2, 1, 1),
                        intArrayOf(2, 3, 3),
                        intArrayOf(2, 3, 4),
                        intArrayOf(3, 4, 2),
                        intArrayOf(4, 5, 1),
                    ),
                    0,
                    1,
                    5,
                ),
            equalTo(9L),
        )
    }

    @Test
    fun minimumWeight2() {
        assertThat(
            Solution().minimumWeight(3, arrayOf(intArrayOf(0, 1, 1), intArrayOf(2, 1, 1)), 0, 1, 2),
            equalTo(-1L),
        )
    }
}
