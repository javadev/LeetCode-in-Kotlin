package g4001_4100.s4033_valid_k_unique_subarrays_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validSubarrays() {
        assertThat<BooleanArray>(
            Solution().validSubarrays(intArrayOf(1, 1), 1, arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(0, 0))),
            equalTo<BooleanArray>(booleanArrayOf(true, false)),
        )
    }

    @Test
    fun validSubarrays2() {
        assertThat<BooleanArray>(
            Solution()
                .validSubarrays(
                    intArrayOf(1, 2, 1, 2),
                    2,
                    arrayOf<IntArray>(intArrayOf(0, 3), intArrayOf(0, 1), intArrayOf(1, 2)),
                ),
            equalTo<BooleanArray>(booleanArrayOf(true, false, false)),
        )
    }

    @Test
    fun validSubarrays3() {
        assertThat<BooleanArray>(
            Solution().validSubarrays(intArrayOf(1, 2), 2, arrayOf<IntArray>()),
            equalTo<BooleanArray>(booleanArrayOf()),
        )
    }
}
