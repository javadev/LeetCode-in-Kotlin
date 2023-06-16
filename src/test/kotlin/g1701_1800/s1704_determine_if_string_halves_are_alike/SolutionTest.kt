package g1701_1800.s1704_determine_if_string_halves_are_alike

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun halvesAreAlike() {
        assertThat(Solution().halvesAreAlike("book"), equalTo(true))
    }

    @Test
    fun halvesAreAlike2() {
        assertThat(Solution().halvesAreAlike("textbook"), equalTo(false))
    }

    @Test
    fun halvesAreAlike3() {
        assertThat(Solution().halvesAreAlike(""), equalTo(false))
    }

    @Test
    fun halvesAreAlike4() {
        assertThat(Solution().halvesAreAlike("aeiouAEIOU"), equalTo(true))
    }
}
