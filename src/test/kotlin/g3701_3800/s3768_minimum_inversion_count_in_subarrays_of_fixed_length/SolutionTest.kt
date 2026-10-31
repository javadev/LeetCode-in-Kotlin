package g3701_3800.s3768_minimum_inversion_count_in_subarrays_of_fixed_length

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minInversionCount() {
        assertThat<Long>(
            Solution().minInversionCount(intArrayOf(3, 1, 2), 2),
            equalTo<Long>(0L),
        )
    }

    @Test
    fun minInversionCount2() {
        assertThat<Long>(
            Solution().minInversionCount(intArrayOf(3, 2, 1), 3),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun minInversionCount3() {
        assertThat<Long>(
            Solution().minInversionCount(intArrayOf(1, 2, 3, 4), 2),
            equalTo<Long>(0L),
        )
    }
}
