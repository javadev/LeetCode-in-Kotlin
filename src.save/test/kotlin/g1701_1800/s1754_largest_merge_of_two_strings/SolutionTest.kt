package g1701_1800.s1754_largest_merge_of_two_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestMerge() {
        assertThat(Solution().largestMerge("cabaa", "bcaaa"), equalTo("cbcabaaaaa"))
    }

    @Test
    fun largestMerge2() {
        assertThat(Solution().largestMerge("abcabc", "abdcaba"), equalTo("abdcabcabcaba"))
    }
}
