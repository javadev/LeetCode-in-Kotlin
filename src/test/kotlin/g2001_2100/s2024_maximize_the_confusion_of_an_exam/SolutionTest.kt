package g2001_2100.s2024_maximize_the_confusion_of_an_exam

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxConsecutiveAnswers() {
        assertThat(Solution().maxConsecutiveAnswers("TTFF", 2), equalTo(4))
    }

    @Test
    fun maxConsecutiveAnswers2() {
        assertThat(Solution().maxConsecutiveAnswers("TTFF", 1), equalTo(3))
    }

    @Test
    fun maxConsecutiveAnswers3() {
        assertThat(Solution().maxConsecutiveAnswers("TTFTTFTT", 1), equalTo(5))
    }
}
