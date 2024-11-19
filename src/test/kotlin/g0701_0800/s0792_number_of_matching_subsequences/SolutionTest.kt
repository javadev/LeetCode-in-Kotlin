package g0701_0800.s0792_number_of_matching_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numMatchingSubseq() {
        assertThat(
            Solution().numMatchingSubseq("abcde", arrayOf("a", "bb", "acd", "ace")),
            equalTo(3),
        )
    }

    @Test
    fun numMatchingSubseq2() {
        assertThat(
            Solution()
                .numMatchingSubseq(
                    "dsahjpjauf",
                    arrayOf("ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"),
                ),
            equalTo(2),
        )
    }
}
