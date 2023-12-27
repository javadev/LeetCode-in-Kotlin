package g2901_3000.s2913_subarrays_distinct_element_sum_of_squares_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumCounts() {
        assertThat(Solution().sumCounts(mutableListOf(1, 2, 1)), equalTo(15))
    }

    @Test
    fun sumCounts2() {
        assertThat(Solution().sumCounts(mutableListOf(1, 1)), equalTo(3))
    }
}
