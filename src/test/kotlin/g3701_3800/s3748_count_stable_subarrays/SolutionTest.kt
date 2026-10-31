package g3701_3800.s3748_count_stable_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countStableSubarrays() {
        assertThat<LongArray>(
            Solution()
                .countStableSubarrays(
                    intArrayOf(3, 1, 2),
                    arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2)),
                ),
            equalTo<LongArray>(longArrayOf(2L, 3L, 4L)),
        )
    }

    @Test
    fun countStableSubarrays2() {
        assertThat<LongArray>(
            Solution().countStableSubarrays(intArrayOf(2, 2), arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 0))),
            equalTo<LongArray>(longArrayOf(3L, 1L)),
        )
    }
}
