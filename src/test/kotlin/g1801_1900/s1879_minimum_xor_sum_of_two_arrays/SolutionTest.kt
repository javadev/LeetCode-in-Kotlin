package g1801_1900.s1879_minimum_xor_sum_of_two_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumXORSum() {
        assertThat(Solution().minimumXORSum(intArrayOf(1, 2), intArrayOf(2, 3)), equalTo(2))
    }

    @Test
    fun minimumXORSum2() {
        assertThat(
            Solution().minimumXORSum(intArrayOf(1, 0, 3), intArrayOf(5, 3, 4)),
            equalTo(8),
        )
    }
}
