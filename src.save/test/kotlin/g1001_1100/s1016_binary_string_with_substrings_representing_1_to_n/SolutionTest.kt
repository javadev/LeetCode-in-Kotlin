package g1001_1100.s1016_binary_string_with_substrings_representing_1_to_n

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun queryString() {
        assertThat(Solution().queryString("0110", 3), equalTo(true))
    }

    @Test
    fun queryString2() {
        assertThat(Solution().queryString("0110", 4), equalTo(false))
    }
}
