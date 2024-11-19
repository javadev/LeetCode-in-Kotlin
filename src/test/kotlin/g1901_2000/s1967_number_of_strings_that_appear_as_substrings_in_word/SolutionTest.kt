package g1901_2000.s1967_number_of_strings_that_appear_as_substrings_in_word

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numOfStrings() {
        assertThat(
            Solution().numOfStrings(arrayOf("a", "abc", "bc", "d"), "abc"),
            equalTo(3),
        )
    }

    @Test
    fun numOfStrings2() {
        assertThat(
            Solution().numOfStrings(arrayOf("a", "b", "c"), "aaaaabbbbb"),
            equalTo(2),
        )
    }

    @Test
    fun numOfStrings3() {
        assertThat(Solution().numOfStrings(arrayOf("a", "a", "a"), "ab"), equalTo(3))
    }
}
