package g1101_1200.s1111_maximum_nesting_depth_of_two_valid_parentheses_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDepthAfterSplit() {
        assertThat(
            Solution().maxDepthAfterSplit("(()())"),
            equalTo(intArrayOf(1, 0, 0, 0, 0, 1)),
        )
    }

    @Test
    fun maxDepthAfterSplit2() {
        assertThat(
            Solution().maxDepthAfterSplit("()(())()"),
            equalTo(intArrayOf(1, 1, 1, 0, 0, 1, 1, 1)),
        )
    }
}
