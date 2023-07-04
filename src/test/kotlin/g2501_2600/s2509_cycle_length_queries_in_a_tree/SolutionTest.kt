package g2501_2600.s2509_cycle_length_queries_in_a_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun cycleLengthQueries() {
        assertThat(
            Solution().cycleLengthQueries(3, arrayOf(intArrayOf(5, 3), intArrayOf(4, 7), intArrayOf(2, 3))),
            equalTo(intArrayOf(4, 5, 3))
        )
    }

    @Test
    fun cycleLengthQueries2() {
        assertThat(
            Solution().cycleLengthQueries(2, arrayOf(intArrayOf(1, 2))), equalTo(intArrayOf(2))
        )
    }
}
