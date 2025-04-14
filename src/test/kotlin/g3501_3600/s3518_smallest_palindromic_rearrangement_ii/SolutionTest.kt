package g3501_3600.s3518_smallest_palindromic_rearrangement_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestPalindrome() {
        assertThat<String>(
            Solution().smallestPalindrome("abba", 2),
            equalTo<String>("baab")
        )
    }

    @Test
    fun smallestPalindrome2() {
        assertThat<String>(Solution().smallestPalindrome("aa", 2), equalTo<String>(""))
    }

    @Test
    fun smallestPalindrome3() {
        assertThat<String>(
            Solution().smallestPalindrome("bacab", 1),
            equalTo<String>("abcba")
        )
    }
}
