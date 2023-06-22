package g1801_1900.s1844_replace_all_digits_with_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun replaceDigits() {
        assertThat(Solution().replaceDigits("a1c1e1"), equalTo("abcdef"))
    }

    @Test
    fun replaceDigits2() {
        assertThat(Solution().replaceDigits("a1b2c3d4e"), equalTo("abbdcfdhe"))
    }
}
