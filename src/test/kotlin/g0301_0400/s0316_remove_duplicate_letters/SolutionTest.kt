package g0301_0400.s0316_remove_duplicate_letters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeDuplicateLetters() {
        assertThat(Solution().removeDuplicateLetters("bcabc"), equalTo("abc"))
    }

    @Test
    fun removeDuplicateLetters2() {
        assertThat(Solution().removeDuplicateLetters("cbacdcbc"), equalTo("acdb"))
    }
}
