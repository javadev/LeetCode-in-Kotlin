package g3801_3900.s3844_longest_almost_palindromic_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun almostPalindromic() {
        assertThat<Int>(Solution().almostPalindromic("abca"), equalTo<Int>(4))
    }

    @Test
    fun almostPalindromic2() {
        assertThat<Int>(Solution().almostPalindromic("abba"), equalTo<Int>(4))
    }

    @Test
    fun almostPalindromic3() {
        assertThat<Int>(Solution().almostPalindromic("zzabba"), equalTo<Int>(5))
    }
}
