package g2301_2400.s2381_shifting_letters_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shiftingLetters() {
        assertThat(
            Solution()
                .shiftingLetters("abc", arrayOf(intArrayOf(0, 1, 0), intArrayOf(1, 2, 1), intArrayOf(0, 2, 1))),
            equalTo("ace")
        )
    }

    @Test
    fun shiftingLetters2() {
        assertThat(
            Solution().shiftingLetters("dztz", arrayOf(intArrayOf(0, 0, 0), intArrayOf(1, 1, 1))),
            equalTo("catz")
        )
    }
}
