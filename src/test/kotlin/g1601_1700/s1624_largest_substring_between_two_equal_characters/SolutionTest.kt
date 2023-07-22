package g1601_1700.s1624_largest_substring_between_two_equal_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxLengthBetweenEqualCharacters() {
        assertThat(Solution().maxLengthBetweenEqualCharacters("aa"), equalTo(0))
    }

    @Test
    fun maxLengthBetweenEqualCharacters2() {
        assertThat(Solution().maxLengthBetweenEqualCharacters("abca"), equalTo(2))
    }

    @Test
    fun maxLengthBetweenEqualCharacters3() {
        assertThat(Solution().maxLengthBetweenEqualCharacters("cbzxy"), equalTo(-1))
    }
}
