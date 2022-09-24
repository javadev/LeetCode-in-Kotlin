package g0001_0100.s0071_simplify_path

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun simplifyPath() {
        assertThat(Solution().simplifyPath("/home/"), equalTo("/home"))
    }

    @Test
    fun simplifyPath2() {
        assertThat(Solution().simplifyPath("/../"), equalTo("/"))
    }

    @Test
    fun simplifyPath3() {
        assertThat(Solution().simplifyPath("/home//foo/"), equalTo("/home/foo"))
    }
}
