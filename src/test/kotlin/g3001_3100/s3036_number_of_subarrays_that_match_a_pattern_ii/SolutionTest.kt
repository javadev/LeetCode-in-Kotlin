package g3001_3100.s3036_number_of_subarrays_that_match_a_pattern_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countMatchingSubarrays() {
        assertThat(
            Solution()
                .countMatchingSubarrays(intArrayOf(1, 2, 3, 4, 5, 6), intArrayOf(1, 1)),
            equalTo(4),
        )
    }

    @Test
    fun countMatchingSubarrays2() {
        assertThat(
            Solution()
                .countMatchingSubarrays(
                    intArrayOf(1, 4, 4, 1, 3, 5, 5, 3),
                    intArrayOf(1, 0, -1),
                ),
            equalTo(2),
        )
    }
}
