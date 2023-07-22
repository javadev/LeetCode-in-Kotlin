package g1301_1400.s1358_number_of_substrings_containing_all_three_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSubstrings() {
        assertThat(Solution().numberOfSubstrings("abcabc"), equalTo(10))
    }

    @Test
    fun numberOfSubstrings2() {
        assertThat(Solution().numberOfSubstrings("aaacb"), equalTo(3))
    }

    @Test
    fun numberOfSubstrings3() {
        assertThat(Solution().numberOfSubstrings("abc"), equalTo(1))
    }
}
