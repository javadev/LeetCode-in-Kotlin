package g1401_1500.s1422_maximum_score_after_splitting_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat(Solution().maxScore("011101"), equalTo(5))
    }

    @Test
    fun maxScore2() {
        assertThat(Solution().maxScore("00111"), equalTo(5))
    }

    @Test
    fun maxScore3() {
        assertThat(Solution().maxScore("1111"), equalTo(3))
    }
}
