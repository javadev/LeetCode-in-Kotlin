package g2401_2500.s2428_maximum_sum_of_an_hourglass

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSum() {
        assertThat(
            Solution()
                .maxSum(
                    arrayOf(
                        intArrayOf(6, 2, 1, 3),
                        intArrayOf(4, 2, 1, 5),
                        intArrayOf(9, 2, 8, 7),
                        intArrayOf(4, 1, 2, 9),
                    ),
                ),
            equalTo(30),
        )
    }

    @Test
    fun maxSum2() {
        assertThat(
            Solution().maxSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))),
            equalTo(35),
        )
    }
}
