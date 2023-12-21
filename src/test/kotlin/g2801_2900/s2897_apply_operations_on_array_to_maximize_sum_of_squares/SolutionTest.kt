package g2801_2900.s2897_apply_operations_on_array_to_maximize_sum_of_squares

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSum() {
        assertThat(Solution().maxSum(mutableListOf(2, 6, 5, 8), 2), equalTo(261))
    }

    @Test
    fun maxSum2() {
        assertThat(Solution().maxSum(mutableListOf(4, 5, 4, 7), 3), equalTo(90))
    }
}
