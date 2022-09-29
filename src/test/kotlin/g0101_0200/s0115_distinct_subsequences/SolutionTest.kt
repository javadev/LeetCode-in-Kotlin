package g0101_0200.s0115_distinct_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numDistinct() {
        assertThat(Solution().numDistinct("rabbbit", "rabbit"), equalTo(3))
    }

    @Test
    fun numDistinct2() {
        assertThat(Solution().numDistinct("babgbag", "bag"), equalTo(5))
    }

    @Test
    fun numDistinct3() {
        assertThat(Solution().numDistinct("bag", "babgbag"), equalTo(0))
    }
}
