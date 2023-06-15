package g1601_1700.s1614_maximum_nesting_depth_of_the_parentheses

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDepth() {
        MatcherAssert.assertThat(Solution().maxDepth("(1+(2*3)+((8)/4))+1"), CoreMatchers.equalTo(3))
    }

    @Test
    fun maxDepth2() {
        MatcherAssert.assertThat(Solution().maxDepth("(1)+((2))+(((3)))"), CoreMatchers.equalTo(3))
    }
}
