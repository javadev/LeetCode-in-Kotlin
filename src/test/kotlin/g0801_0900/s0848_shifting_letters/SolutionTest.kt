package g0801_0900.s0848_shifting_letters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shiftingLetters() {
        assertThat(Solution().shiftingLetters("abc", intArrayOf(3, 5, 9)), equalTo("rpl"))
    }

    @Test
    fun shiftingLetters2() {
        assertThat(Solution().shiftingLetters("aaa", intArrayOf(1, 2, 3)), equalTo("gfd"))
    }
}
