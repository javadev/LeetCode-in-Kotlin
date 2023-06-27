package g2001_2100.s2090_k_radius_subarray_averages

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun averages() {
        assertThat(
            Solution().getAverages(intArrayOf(7, 4, 3, 9, 1, 8, 5, 2, 6), 3),
            equalTo(intArrayOf(-1, -1, -1, 5, 4, 4, -1, -1, -1))
        )
    }

    @Test
    fun averages2() {
        assertThat(
            Solution().getAverages(intArrayOf(100000), 0),
            equalTo(intArrayOf(100000))
        )
    }

    @Test
    fun averages3() {
        assertThat(
            Solution().getAverages(intArrayOf(8), 100000),
            equalTo(intArrayOf(-1))
        )
    }
}
