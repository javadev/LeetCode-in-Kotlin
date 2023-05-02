package g0801_0900.s0844_backspace_string_compare

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun backspaceCompare() {
        assertThat(Solution().backspaceCompare("ab#c", "ad#c"), equalTo(true))
    }

    @Test
    fun backspaceCompare2() {
        assertThat(Solution().backspaceCompare("ab##", "c#d#"), equalTo(true))
    }

    @Test
    fun backspaceCompare3() {
        assertThat(Solution().backspaceCompare("a#c", "b"), equalTo(false))
    }
}
