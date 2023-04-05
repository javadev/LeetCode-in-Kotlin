package g0001_0100.s0096_unique_binary_search_trees

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numTrees() {
        assertThat(Solution().numTrees(3), equalTo(5))
    }

    @Test
    fun numTrees2() {
        assertThat(Solution().numTrees(1), equalTo(1))
    }
}
