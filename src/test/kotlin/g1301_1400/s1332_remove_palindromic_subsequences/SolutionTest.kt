package g1301_1400.s1332_remove_palindromic_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removePalindromeSub() {
        assertThat(Solution().removePalindromeSub("ababa"), equalTo(1))
    }

    @Test
    fun removePalindromeSub2() {
        assertThat(Solution().removePalindromeSub("abb"), equalTo(2))
    }

    @Test
    fun removePalindromeSub3() {
        assertThat(Solution().removePalindromeSub("baabb"), equalTo(2))
    }
}
