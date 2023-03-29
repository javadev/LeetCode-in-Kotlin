package g0801_0900.s0845_longest_mountain_in_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestMountain() {
        assertThat(Solution().longestMountain(intArrayOf(2, 1, 4, 7, 3, 2, 5)), equalTo(5))
    }

    @Test
    fun longestMountain2() {
        assertThat(Solution().longestMountain(intArrayOf(2, 2, 2)), equalTo(0))
    }
}
