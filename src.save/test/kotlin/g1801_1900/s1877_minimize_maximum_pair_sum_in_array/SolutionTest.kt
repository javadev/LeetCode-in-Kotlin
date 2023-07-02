package g1801_1900.s1877_minimize_maximum_pair_sum_in_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minPairSum() {
        assertThat(Solution().minPairSum(intArrayOf(3, 5, 2, 3)), equalTo(7))
    }

    @Test
    fun minPairSum2() {
        assertThat(Solution().minPairSum(intArrayOf(3, 5, 4, 2, 4, 6)), equalTo(8))
    }
}
