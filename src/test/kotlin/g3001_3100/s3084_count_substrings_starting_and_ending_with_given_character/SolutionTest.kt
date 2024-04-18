package g3001_3100.s3084_count_substrings_starting_and_ending_with_given_character

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubstrings() {
        assertThat(Solution().countSubstrings("abada", 'a'), equalTo(6L))
    }

    @Test
    fun countSubstrings2() {
        assertThat(Solution().countSubstrings("zzz", 'z'), equalTo(6L))
    }
}
