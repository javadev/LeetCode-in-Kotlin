package g1601_1700.s1678_goal_parser_interpretation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun interpret() {
        assertThat(Solution().interpret("G()(al)"), equalTo("Goal"))
    }

    @Test
    fun interpret2() {
        assertThat(Solution().interpret("G()()()()(al)"), equalTo("Gooooal"))
    }

    @Test
    fun interpret3() {
        assertThat(Solution().interpret("(al)G(al)()()G"), equalTo("alGalooG"))
    }
}
