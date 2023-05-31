package g1101_1200.s1147_longest_chunked_palindrome_decomposition

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestDecomposition() {
        MatcherAssert.assertThat(
            Solution().longestDecomposition("ghiabcdefhelloadamhelloabcdefghi"),
            CoreMatchers.equalTo(7)
        )
    }

    @Test
    fun longestDecomposition2() {
        MatcherAssert.assertThat(Solution().longestDecomposition("merchant"), CoreMatchers.equalTo(1))
    }

    @Test
    fun longestDecompositio3() {
        MatcherAssert.assertThat(Solution().longestDecomposition("antaprezatepzapreanta"), CoreMatchers.equalTo(11))
    }
}
