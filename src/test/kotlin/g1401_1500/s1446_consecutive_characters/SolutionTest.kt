package g1401_1500.s1446_consecutive_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPower() {
        assertThat(Solution().maxPower("leetcode"), equalTo(2))
    }

    @Test
    fun maxPower2() {
        assertThat(Solution().maxPower("abbcccddddeeeeedcba"), equalTo(5))
    }
}
