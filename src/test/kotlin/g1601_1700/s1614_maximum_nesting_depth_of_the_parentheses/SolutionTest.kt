package g1601_1700.s1614_maximum_nesting_depth_of_the_parentheses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDepth() {
        assertThat(Solution().maxDepth("(1+(2*3)+((8)/4))+1"), equalTo(3))
    }

    @Test
    fun maxDepth2() {
        assertThat(Solution().maxDepth("(1)+((2))+(((3)))"), equalTo(3))
    }
}
