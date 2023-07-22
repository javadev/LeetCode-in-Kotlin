package g2401_2500.s2414_length_of_the_longest_alphabetical_continuous_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestContinuousSubstring() {
        assertThat(Solution().longestContinuousSubstring("abacaba"), equalTo(2))
    }

    @Test
    fun longestContinuousSubstring2() {
        assertThat(Solution().longestContinuousSubstring("abcde"), equalTo(5))
    }
}
