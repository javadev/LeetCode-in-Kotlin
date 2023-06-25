package g2001_2100.s2060_check_if_an_original_string_exists_given_two_encoded_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun possiblyEquals() {
        assertThat(Solution().possiblyEquals("internationalization", "i18n"), equalTo(true))
    }

    @Test
    fun possiblyEquals2() {
        assertThat(Solution().possiblyEquals("l123e", "44"), equalTo(true))
    }

    @Test
    fun possiblyEquals3() {
        assertThat(Solution().possiblyEquals("a5b", "c5b"), equalTo(false))
    }
}
