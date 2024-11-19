package g1801_1900.s1832_check_if_the_sentence_is_pangram

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkIfPangram() {
        assertThat(
            Solution().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"),
            equalTo(true),
        )
    }

    @Test
    fun checkIfPangram2() {
        assertThat(Solution().checkIfPangram("leetcode"), equalTo(false))
    }
}
