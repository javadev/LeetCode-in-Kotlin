package g1701_1800.s1800_maximum_ascending_subarray_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxAscendingSum() {
        assertThat(Solution().maxAscendingSum(intArrayOf(10, 20, 30, 5, 10, 50)), equalTo(65))
    }

    @Test
    fun maxAscendingSum2() {
        assertThat(Solution().maxAscendingSum(intArrayOf(10, 20, 30, 40, 50)), equalTo(150))
    }

    @Test
    fun maxAscendingSum3() {
        assertThat(
            Solution().maxAscendingSum(intArrayOf(12, 17, 15, 13, 10, 11, 12)),
            equalTo(33),
        )
    }
}
