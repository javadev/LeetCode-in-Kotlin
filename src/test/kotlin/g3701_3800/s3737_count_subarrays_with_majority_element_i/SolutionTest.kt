package g3701_3800.s3737_count_subarrays_with_majority_element_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countMajoritySubarrays() {
        assertThat<Int>(
            Solution().countMajoritySubarrays(intArrayOf(1, 1, 2), 1),
            equalTo<Int>(4),
        )
    }

    @Test
    fun countMajoritySubarrays2() {
        assertThat<Int>(
            Solution().countMajoritySubarrays(intArrayOf(2, 2), 1),
            equalTo<Int>(0),
        )
    }

    @Test
    fun countMajoritySubarrays3() {
        assertThat<Int>(
            Solution().countMajoritySubarrays(intArrayOf(1, 2, 1, 2), 1),
            equalTo<Int>(3),
        )
    }
}
