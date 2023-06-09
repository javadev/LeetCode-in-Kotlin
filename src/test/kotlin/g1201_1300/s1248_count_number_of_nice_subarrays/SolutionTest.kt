package g1201_1300.s1248_count_number_of_nice_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSubarrays() {
        assertThat(Solution().numberOfSubarrays(intArrayOf(1, 1, 2, 1, 1), 3), equalTo(2))
    }

    @Test
    fun numberOfSubarrays2() {
        assertThat(Solution().numberOfSubarrays(intArrayOf(2, 4, 6), 1), equalTo(0))
    }

    @Test
    fun numberOfSubarrays3() {
        assertThat(
            Solution().numberOfSubarrays(intArrayOf(2, 2, 2, 1, 2, 2, 1, 2, 2, 2), 2),
            equalTo(16)
        )
    }
}
