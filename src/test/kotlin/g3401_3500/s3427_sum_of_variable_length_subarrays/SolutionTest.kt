package g3401_3500.s3427_sum_of_variable_length_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subarraySum() {
        assertThat<Int>(Solution().subarraySum(intArrayOf(2, 3, 1)), equalTo<Int>(11))
    }

    @Test
    fun subarraySum2() {
        assertThat<Int>(Solution().subarraySum(intArrayOf(3, 1, 1, 2)), equalTo<Int>(13))
    }
}
