package g2801_2900.s2845_count_of_interesting_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countInterestingSubarrays() {
        assertThat(
            Solution().countInterestingSubarrays(mutableListOf(3, 2, 4), 2, 1),
            equalTo(3L)
        )
    }

    @Test
    fun countInterestingSubarrays2() {
        assertThat(
            Solution().countInterestingSubarrays(mutableListOf(3, 1, 9, 6), 3, 0),
            equalTo(2L)
        )
    }
}
