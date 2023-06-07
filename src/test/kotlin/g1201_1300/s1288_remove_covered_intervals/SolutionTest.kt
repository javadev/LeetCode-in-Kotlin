package g1201_1300.s1288_remove_covered_intervals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeCoveredIntervals() {
        assertThat(
            Solution().removeCoveredIntervals(
                arrayOf(
                    intArrayOf(1, 4),
                    intArrayOf(3, 6), intArrayOf(2, 8)
                )
            ),
            equalTo(2)
        )
    }

    @Test
    fun removeCoveredIntervals2() {
        assertThat(
            Solution().removeCoveredIntervals(
                arrayOf(
                    intArrayOf(1, 4),
                    intArrayOf(2, 3)
                )
            ),
            equalTo(1)
        )
    }
}
