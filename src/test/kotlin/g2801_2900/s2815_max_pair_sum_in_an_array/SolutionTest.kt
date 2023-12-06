package g2801_2900.s2815_max_pair_sum_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

// #Easy #Array #Hash_Table
internal class SolutionTest {
    @Test
    fun maxSum() {
        assertThat(Solution().maxSum(intArrayOf(51, 71, 17, 24, 42)), equalTo(88))
    }

    @Test
    fun maxSum2() {
        assertThat(Solution().maxSum(intArrayOf(1, 2, 3, 4)), equalTo(-1))
    }
}
