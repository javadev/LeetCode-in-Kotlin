package g1401_1500.s1480_running_sum_of_1d_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun runningSum() {
        assertThat(
            Solution().runningSum(intArrayOf(1, 2, 3, 4)),
            equalTo(intArrayOf(1, 3, 6, 10))
        )
    }

    @Test
    fun runningSum2() {
        assertThat(
            Solution().runningSum(intArrayOf(1, 1, 1, 1, 1)),
            equalTo(intArrayOf(1, 2, 3, 4, 5))
        )
    }

    @Test
    fun runningSum3() {
        assertThat(
            Solution().runningSum(intArrayOf(3, 1, 2, 10, 1)),
            equalTo(intArrayOf(3, 4, 6, 16, 17))
        )
    }
}
