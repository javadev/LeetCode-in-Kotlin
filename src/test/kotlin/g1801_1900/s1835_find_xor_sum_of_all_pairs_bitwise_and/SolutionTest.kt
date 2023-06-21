package g1801_1900.s1835_find_xor_sum_of_all_pairs_bitwise_and

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun xORSum() {
        assertThat(
            Solution().getXORSum(intArrayOf(1, 2, 3), intArrayOf(6, 5)),
            equalTo(0)
        )
    }

    @Test
    fun xORSum2() {
        assertThat(Solution().getXORSum(intArrayOf(12), intArrayOf(4)), equalTo(4))
    }
}
