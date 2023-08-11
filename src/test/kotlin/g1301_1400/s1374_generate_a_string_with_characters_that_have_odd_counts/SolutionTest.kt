package g1301_1400.s1374_generate_a_string_with_characters_that_have_odd_counts

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun generateTheString() {
        assertThat(Solution().generateTheString(4), equalTo("aaaz"))
    }

    @Test
    fun generateTheString2() {
        assertThat(Solution().generateTheString(2), equalTo("az"))
    }

    @Test
    fun generateTheString3() {
        assertThat(Solution().generateTheString(7), equalTo("aaaaabz"))
    }
}
