package g0901_1000.s0906_super_palindromes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun superpalindromesInRange() {
        assertThat(Solution().superpalindromesInRange("4", "1000"), equalTo(4))
    }

    @Test
    fun superpalindromesInRange2() {
        assertThat(Solution().superpalindromesInRange("1", "2"), equalTo(1))
    }
}
