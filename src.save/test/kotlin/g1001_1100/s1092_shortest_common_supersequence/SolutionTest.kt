package g1001_1100.s1092_shortest_common_supersequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestCommonSupersequence() {
        assertThat(Solution().shortestCommonSupersequence("abac", "cab"), equalTo("cabac"))
    }

    @Test
    fun shortestCommonSupersequence2() {
        assertThat(
            Solution().shortestCommonSupersequence("aaaaaaaa", "aaaaaaaa"),
            equalTo("aaaaaaaa")
        )
    }
}
