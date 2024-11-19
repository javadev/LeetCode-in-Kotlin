package g0001_0100.s0095_unique_binary_search_trees_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun generateTrees() {
        assertThat(
            Solution().generateTrees(3).toString(),
            equalTo(
                "[3,2,1,null,null, 2,1,3, 3,1,null,2,null, 1,null,3,2,null, 1,null,2,null,3]",
            ),
        )
    }

    @Test
    fun generateTrees2() {
        assertThat(Solution().generateTrees(1).toString(), equalTo("[1]"))
    }
}
