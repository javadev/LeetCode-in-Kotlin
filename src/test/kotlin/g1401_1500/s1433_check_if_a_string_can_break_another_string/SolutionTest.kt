package g1401_1500.s1433_check_if_a_string_can_break_another_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkIfCanBreak() {
        assertThat(Solution().checkIfCanBreak("abc", "xya"), equalTo(true))
    }

    @Test
    fun checkIfCanBreak2() {
        assertThat(Solution().checkIfCanBreak("abe", "acd"), equalTo(false))
    }

    @Test
    fun checkIfCanBreak3() {
        assertThat(Solution().checkIfCanBreak("leetcodee", "interview"), equalTo(true))
    }
}
