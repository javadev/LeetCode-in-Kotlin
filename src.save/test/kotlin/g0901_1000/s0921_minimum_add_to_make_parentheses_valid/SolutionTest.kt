package g0901_1000.s0921_minimum_add_to_make_parentheses_valid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minAddToMakeValid() {
        assertThat(Solution().minAddToMakeValid("())"), equalTo(1))
    }

    @Test
    fun minAddToMakeValid2() {
        assertThat(Solution().minAddToMakeValid("((("), equalTo(3))
    }
}
