package g4001_4100.s4030_check_ascii_palindromic

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPalindromic() {
        assertThat<Boolean>(Solution().isPalindromic("A"), equalTo<Boolean>(false))
    }

    @Test
    fun isPalindromic2() {
        assertThat<Boolean>(Solution().isPalindromic("\u0000"), equalTo<Boolean>(true))
    }

    @Test
    fun isPalindromic3() {
        assertThat<Boolean>(
            Solution().isPalindromic("\u0001\u0080"),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun isPalindromic4() {
        assertThat<Boolean>(Solution().isPalindromic("ab"), equalTo<Boolean>(false))
    }
}
