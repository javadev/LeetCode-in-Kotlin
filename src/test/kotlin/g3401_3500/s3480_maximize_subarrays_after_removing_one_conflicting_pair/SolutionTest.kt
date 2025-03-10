package g3401_3500.s3480_maximize_subarrays_after_removing_one_conflicting_pair

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubarrays() {
        assertThat<Long>(
            Solution().maxSubarrays(
                4,
                arrayOf<IntArray>(intArrayOf(2, 3), intArrayOf(1, 4)),
            ),
            equalTo<Long>(9L),
        )
    }

    @Test
    fun maxSubarrays2() {
        assertThat<Long>(
            Solution().maxSubarrays(5, arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(2, 5), intArrayOf(3, 5))),
            equalTo<Long>(12L),
        )
    }

    @Test
    fun maxSubarrays3() {
        assertThat<Long>(
            Solution().maxSubarrays(
                10,
                arrayOf<IntArray>(intArrayOf(10, 5), intArrayOf(3, 8)),
            ),
            equalTo<Long>(50L),
        )
    }
}
