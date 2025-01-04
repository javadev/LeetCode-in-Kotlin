package g3301_3400.s3392_count_subarrays_of_length_three_with_a_condition

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubarrays() {
        assertThat<Int>(
            Solution().countSubarrays(intArrayOf(1, 2, 1, 4, 1)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun countSubarrays2() {
        assertThat<Int>(Solution().countSubarrays(intArrayOf(1, 1, 1)), equalTo<Int>(0))
    }
}
