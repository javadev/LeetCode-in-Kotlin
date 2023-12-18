package g2801_2900.s2829_determine_the_minimum_sum_of_a_k_avoiding_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumSum() {
        assertThat(Solution().minimumSum(5, 4), equalTo(18))
    }

    @Test
    fun minimumSum2() {
        assertThat(Solution().minimumSum(2, 6), equalTo(3))
    }
}
