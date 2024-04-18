package g3001_3100.s3090_maximum_length_substring_with_two_occurrences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumLengthSubstring() {
        assertThat(Solution().maximumLengthSubstring("bcbbbcba"), equalTo(4))
    }

    @Test
    fun maximumLengthSubstring2() {
        assertThat(Solution().maximumLengthSubstring("aaaa"), equalTo(2))
    }
}
