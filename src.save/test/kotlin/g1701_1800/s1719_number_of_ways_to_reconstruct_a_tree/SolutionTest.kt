package g1701_1800.s1719_number_of_ways_to_reconstruct_a_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkWays() {
        assertThat(Solution().checkWays(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))), equalTo(1))
    }

    @Test
    fun checkWays2() {
        assertThat(
            Solution().checkWays(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3), intArrayOf(1, 3)
                )
            ),
            equalTo(2)
        )
    }

    @Test
    fun checkWays3() {
        assertThat(
            Solution().checkWays(
                arrayOf(
                    intArrayOf(1, 2), intArrayOf(2, 3),
                    intArrayOf(2, 4), intArrayOf(1, 5)
                )
            ),
            equalTo(0)
        )
    }
}
