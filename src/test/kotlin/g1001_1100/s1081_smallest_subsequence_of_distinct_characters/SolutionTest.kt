package g1001_1100.s1081_smallest_subsequence_of_distinct_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestSubsequence() {
        assertThat(Solution().smallestSubsequence("bcabc"), equalTo("abc"))
    }

    @Test
    fun smallestSubsequence2() {
        assertThat(Solution().smallestSubsequence("cbacdcbc"), equalTo("acdb"))
    }
}
