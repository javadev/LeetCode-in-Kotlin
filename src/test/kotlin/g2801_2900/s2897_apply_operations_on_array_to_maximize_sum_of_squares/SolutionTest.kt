package g2801_2900.s2897_apply_operations_on_array_to_maximize_sum_of_squares

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSum() {
        MatcherAssert.assertThat(Solution().maxSum(mutableListOf(2, 6, 5, 8), 2), CoreMatchers.equalTo(261))
    }

    @Test
    fun maxSum2() {
        MatcherAssert.assertThat(Solution().maxSum(mutableListOf(4, 5, 4, 7), 3), CoreMatchers.equalTo(90))
    }
}
