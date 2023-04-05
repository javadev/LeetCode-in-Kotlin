package g0601_0700.s0697_degree_of_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findShortestSubArray() {
        assertThat(Solution().findShortestSubArray(intArrayOf(1, 2, 2, 3, 1)), equalTo(2))
    }

    @Test
    fun findShortestSubArray2() {
        assertThat(
            Solution().findShortestSubArray(intArrayOf(1, 2, 2, 3, 1, 4, 2)), equalTo(6)
        )
    }
}
