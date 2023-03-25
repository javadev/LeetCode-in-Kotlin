package g0801_0900.s0823_binary_trees_with_factors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numFactoredBinaryTrees() {
        assertThat(Solution().numFactoredBinaryTrees(intArrayOf(2, 4)), equalTo(3))
    }

    @Test
    fun numFactoredBinaryTrees2() {
        assertThat(Solution().numFactoredBinaryTrees(intArrayOf(2, 4, 5, 10)), equalTo(7))
    }
}
