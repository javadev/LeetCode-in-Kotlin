package g1701_1800.s1755_closest_subsequence_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minAbsDifference() {
        assertThat(Solution().minAbsDifference(intArrayOf(5, -7, 3, 5), 6), equalTo(0))
    }

    @Test
    fun minAbsDifference2() {
        assertThat(Solution().minAbsDifference(intArrayOf(7, -9, 15, -2), -5), equalTo(1))
    }

    @Test
    fun minAbsDifference3() {
        assertThat(Solution().minAbsDifference(intArrayOf(1, 2, 3), -7), equalTo(7))
    }
}
