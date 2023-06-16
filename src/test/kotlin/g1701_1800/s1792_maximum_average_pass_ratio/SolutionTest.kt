package g1701_1800.s1792_maximum_average_pass_ratio

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxAverageRatio() {
        assertThat(
            Solution().maxAverageRatio(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(3, 5), intArrayOf(2, 2)
                ),
                2
            ),
            equalTo(0.7833333333333333)
        )
    }

    @Test
    fun maxAverageRatio2() {
        assertThat(
            Solution().maxAverageRatio(
                arrayOf(
                    intArrayOf(2, 4), intArrayOf(3, 9),
                    intArrayOf(4, 5), intArrayOf(2, 10)
                ),
                4
            ),
            equalTo(0.5348484848484849)
        )
    }
}
