package g1601_1700.s1671_minimum_number_of_removals_to_make_mountain_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumMountainRemovals() {
        assertThat(Solution().minimumMountainRemovals(intArrayOf(1, 3, 1)), equalTo(0))
    }

    @Test
    fun minimumMountainRemovals2() {
        assertThat(
            Solution().minimumMountainRemovals(intArrayOf(2, 1, 1, 5, 6, 2, 3, 1)),
            equalTo(3),
        )
    }
}
