package g2601_2700.s2615_sum_of_distances

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distance() {
        assertThat(
            Solution().distance(intArrayOf(1, 3, 1, 1, 2)),
            equalTo(longArrayOf(5, 0, 3, 4, 0))
        )
    }

    @Test
    fun distance2() {
        assertThat(Solution().distance(intArrayOf(0, 5, 3)), equalTo(longArrayOf(0, 0, 0)))
    }
}
