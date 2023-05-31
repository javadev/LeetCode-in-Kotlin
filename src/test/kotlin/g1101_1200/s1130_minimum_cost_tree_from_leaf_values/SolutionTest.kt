package g1101_1200.s1130_minimum_cost_tree_from_leaf_values

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mctFromLeafValues() {
        MatcherAssert.assertThat(Solution().mctFromLeafValues(intArrayOf(6, 2, 4)), CoreMatchers.equalTo(32))
    }

    @Test
    fun mctFromLeafValues2() {
        MatcherAssert.assertThat(Solution().mctFromLeafValues(intArrayOf(4, 11)), CoreMatchers.equalTo(44))
    }
}
