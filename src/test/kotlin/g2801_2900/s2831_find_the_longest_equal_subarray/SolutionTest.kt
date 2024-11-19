package g2801_2900.s2831_find_the_longest_equal_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestEqualSubarray() {
        assertThat(
            Solution().longestEqualSubarray(listOf(1, 3, 2, 3, 1, 3), 3),
            equalTo(3),
        )
    }

    @Test
    fun longestEqualSubarray2() {
        assertThat(
            Solution().longestEqualSubarray(listOf(1, 1, 2, 2, 1, 1), 2),
            equalTo(4),
        )
    }
}
