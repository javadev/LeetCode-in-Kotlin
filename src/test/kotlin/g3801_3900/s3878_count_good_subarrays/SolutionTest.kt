package g3801_3900.s3878_count_good_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countGoodSubarrays() {
        assertThat<Long>(
            Solution().countGoodSubarrays(intArrayOf(4, 2, 3)),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun countGoodSubarrays2() {
        assertThat<Long>(
            Solution().countGoodSubarrays(intArrayOf(1, 3, 1)),
            equalTo<Long>(6L),
        )
    }
}
