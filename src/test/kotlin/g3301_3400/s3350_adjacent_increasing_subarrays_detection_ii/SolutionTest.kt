package g3301_3400.s3350_adjacent_increasing_subarrays_detection_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxIncreasingSubarrays() {
        assertThat<Int>(
            Solution().maxIncreasingSubarrays(listOf<Int>(2, 5, 7, 8, 9, 2, 3, 4, 3, 1)),
            equalTo<Int>(3)
        )
    }

    @Test
    fun maxIncreasingSubarrays2() {
        assertThat<Int>(
            Solution().maxIncreasingSubarrays(listOf<Int>(1, 2, 3, 4, 4, 4, 4, 5, 6, 7)),
            equalTo<Int>(2)
        )
    }
}
