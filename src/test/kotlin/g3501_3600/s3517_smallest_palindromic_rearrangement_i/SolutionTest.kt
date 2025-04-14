package g3501_3600.s3517_smallest_palindromic_rearrangement_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestPalindrome() {
        assertThat<String>(Solution().smallestPalindrome("z"), equalTo<String>("z"))
    }

    @Test
    fun smallestPalindrome2() {
        assertThat<String>(
            Solution().smallestPalindrome("babab"),
            equalTo<String>("abbba")
        )
    }

    @Test
    fun smallestPalindrome3() {
        assertThat<String>(
            Solution().smallestPalindrome("daccad"),
            equalTo<String>("acddca")
        )
    }
}
