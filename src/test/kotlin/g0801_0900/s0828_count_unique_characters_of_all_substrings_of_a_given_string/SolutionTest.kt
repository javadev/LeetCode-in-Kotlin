package g0801_0900.s0828_count_unique_characters_of_all_substrings_of_a_given_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun uniqueLetterString() {
        assertThat(Solution().uniqueLetterString("ABC"), equalTo(10))
    }

    @Test
    fun uniqueLetterString2() {
        assertThat(Solution().uniqueLetterString("ABA"), equalTo(8))
    }

    @Test
    fun uniqueLetterString3() {
        assertThat(Solution().uniqueLetterString("LEETCODE"), equalTo(92))
    }
}
