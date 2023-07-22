package g2401_2500.s2497_maximum_star_sum_of_a_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxStarSum() {
        assertThat(
            Solution()
                .maxStarSum(
                    intArrayOf(1, 2, 3, 4, 10, -10, -20),
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(1, 2),
                        intArrayOf(1, 3),
                        intArrayOf(3, 4),
                        intArrayOf(3, 5),
                        intArrayOf(3, 6)
                    ),
                    2
                ),
            equalTo(16)
        )
    }

    @Test
    fun maxStarSum2() {
        assertThat(Solution().maxStarSum(intArrayOf(-5), arrayOf(), 0), equalTo(-5))
    }
}
