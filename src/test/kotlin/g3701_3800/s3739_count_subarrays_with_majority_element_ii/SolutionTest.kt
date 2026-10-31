package g3701_3800.s3739_count_subarrays_with_majority_element_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countMajoritySubarrays() {
        assertThat<Long>(
            Solution().countMajoritySubarrays(intArrayOf(1, 1, 2), 1),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun countMajoritySubarrays2() {
        assertThat<Long>(
            Solution().countMajoritySubarrays(intArrayOf(2, 2), 1),
            equalTo<Long>(0L),
        )
    }

    @Test
    fun countMajoritySubarrays3() {
        assertThat<Long>(
            Solution().countMajoritySubarrays(intArrayOf(1, 2, 1, 2), 1),
            equalTo<Long>(3L),
        )
    }
}
