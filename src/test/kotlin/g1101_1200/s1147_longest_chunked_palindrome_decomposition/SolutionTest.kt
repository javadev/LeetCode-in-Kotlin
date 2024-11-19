package g1101_1200.s1147_longest_chunked_palindrome_decomposition

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestDecomposition() {
        assertThat(
            Solution().longestDecomposition("ghiabcdefhelloadamhelloabcdefghi"),
            equalTo(7),
        )
    }

    @Test
    fun longestDecomposition2() {
        assertThat(Solution().longestDecomposition("merchant"), equalTo(1))
    }

    @Test
    fun longestDecompositio3() {
        assertThat(Solution().longestDecomposition("antaprezatepzapreanta"), equalTo(11))
    }
}
