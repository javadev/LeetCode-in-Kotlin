package g0701_0800.s0718_maximum_length_of_repeated_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLength() {
        assertThat(
            Solution().findLength(intArrayOf(1, 2, 3, 2, 1), intArrayOf(3, 2, 1, 4, 7)),
            equalTo(3),
        )
    }

    @Test
    fun findLength2() {
        assertThat(
            Solution().findLength(intArrayOf(0, 0, 0, 0, 0), intArrayOf(0, 0, 0, 0, 0)),
            equalTo(5),
        )
    }
}
