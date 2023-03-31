package g0801_0900.s0854_k_similar_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kSimilarity() {
        assertThat(Solution().kSimilarity("ab", "ba"), equalTo(1))
    }

    @Test
    fun kSimilarity2() {
        assertThat(Solution().kSimilarity("abc", "bca"), equalTo(2))
    }
}
