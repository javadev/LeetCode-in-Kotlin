package g1101_1200.s1130_minimum_cost_tree_from_leaf_values

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mctFromLeafValues() {
        assertThat(Solution().mctFromLeafValues(intArrayOf(6, 2, 4)), equalTo(32))
    }

    @Test
    fun mctFromLeafValues2() {
        assertThat(Solution().mctFromLeafValues(intArrayOf(4, 11)), equalTo(44))
    }
}
