package g2801_2900.s2825_make_string_a_subsequence_using_cyclic_increments

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canMakeSubsequence() {
        assertThat(Solution().canMakeSubsequence("abc", "ad"), equalTo(true))
    }

    @Test
    fun canMakeSubsequence2() {
        assertThat(Solution().canMakeSubsequence("zc", "ad"), equalTo(true))
    }

    @Test
    fun canMakeSubsequence3() {
        assertThat(Solution().canMakeSubsequence("ab", "d"), equalTo(false))
    }
}
