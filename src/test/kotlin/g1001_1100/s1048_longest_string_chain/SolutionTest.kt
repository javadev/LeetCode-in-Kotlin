package g1001_1100.s1048_longest_string_chain

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestStrChain() {
        assertThat(
            Solution().longestStrChain(arrayOf("a", "b", "ba", "bca", "bda", "bdca")),
            equalTo(4)
        )
    }

    @Test
    fun longestStrChain2() {
        assertThat(
            Solution()
                .longestStrChain(arrayOf("xbc", "pcxbcf", "xb", "cxbc", "pcxbc")),
            equalTo(5)
        )
    }

    @Test
    fun longestStrChain3() {
        assertThat(Solution().longestStrChain(arrayOf("abcd", "dbqca")), equalTo(1))
    }
}
