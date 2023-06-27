package g2201_2300.s2221_find_triangular_sum_of_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun triangularSum() {
        assertThat(Solution().triangularSum(intArrayOf(1, 2, 3, 4, 5)), equalTo(8))
    }

    @Test
    fun triangularSum2() {
        assertThat(Solution().triangularSum(intArrayOf(5)), equalTo(5))
    }
}
