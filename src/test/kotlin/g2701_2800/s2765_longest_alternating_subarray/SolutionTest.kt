package g2701_2800.s2765_longest_alternating_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun alternatingSubarray() {
        assertThat(Solution().alternatingSubarray(intArrayOf(2, 3, 4, 3, 4)), equalTo(4))
    }

    @Test
    fun alternatingSubarray2() {
        assertThat(Solution().alternatingSubarray(intArrayOf(4, 5, 6)), equalTo(2))
    }
}
