package g1801_1900.s1863_sum_of_all_subset_xor_totals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subsetXORSum() {
        assertThat(Solution().subsetXORSum(intArrayOf(1, 3)), equalTo(6))
    }

    @Test
    fun subsetXORSum2() {
        assertThat(Solution().subsetXORSum(intArrayOf(5, 1, 6)), equalTo(28))
    }

    @Test
    fun subsetXORSum3() {
        assertThat(Solution().subsetXORSum(intArrayOf(3, 4, 5, 6, 7, 8)), equalTo(480))
    }
}
