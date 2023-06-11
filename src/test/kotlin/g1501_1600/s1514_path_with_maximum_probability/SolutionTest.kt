package g1501_1600.s1514_path_with_maximum_probability

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProbability() {
        MatcherAssert.assertThat(
            Solution()
                .maxProbability(
                    3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2)), doubleArrayOf(0.5, 0.5, 0.2),
                    0,
                    2
                ),
            CoreMatchers.equalTo(0.2500)
        )
    }

    @Test
    fun maxProbability2() {
        MatcherAssert.assertThat(
            Solution()
                .maxProbability(
                    3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2)), doubleArrayOf(0.5, 0.5, 0.3),
                    0,
                    2
                ),
            CoreMatchers.equalTo(0.3)
        )
    }

    @Test
    fun maxProbability3() {
        MatcherAssert.assertThat(
            Solution().maxProbability(3, arrayOf(intArrayOf(0, 1)), doubleArrayOf(0.5), 0, 2),
            CoreMatchers.equalTo(0.0)
        )
    }
}
