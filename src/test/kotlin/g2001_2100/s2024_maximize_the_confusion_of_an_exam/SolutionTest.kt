package g2001_2100.s2024_maximize_the_confusion_of_an_exam

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxConsecutiveAnswers() {
        MatcherAssert.assertThat(Solution().maxConsecutiveAnswers("TTFF", 2), CoreMatchers.equalTo(4))
    }

    @Test
    fun maxConsecutiveAnswers2() {
        MatcherAssert.assertThat(Solution().maxConsecutiveAnswers("TTFF", 1), CoreMatchers.equalTo(3))
    }

    @Test
    fun maxConsecutiveAnswers3() {
        MatcherAssert.assertThat(Solution().maxConsecutiveAnswers("TTFTTFTT", 1), CoreMatchers.equalTo(5))
    }
}
