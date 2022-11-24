package g0301_0400.s0383_ransom_note

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canConstruct() {
        assertThat(Solution().canConstruct("a", "b"), equalTo(false))
    }

    @Test
    fun canConstruct2() {
        assertThat(Solution().canConstruct("aa", "ab"), equalTo(false))
    }

    @Test
    fun canConstruct3() {
        assertThat(Solution().canConstruct("aa", "aab"), equalTo(true))
    }
}
