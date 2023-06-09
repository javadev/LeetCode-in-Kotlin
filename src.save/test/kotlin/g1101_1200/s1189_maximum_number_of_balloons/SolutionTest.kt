package g1101_1200.s1189_maximum_number_of_balloons

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxNumberOfBalloons() {
        assertThat(Solution().maxNumberOfBalloons("nlaebolko"), equalTo(1))
    }

    @Test
    fun maxNumberOfBalloons2() {
        assertThat(Solution().maxNumberOfBalloons("loonbalxballpoon"), equalTo(2))
    }

    @Test
    fun maxNumberOfBalloons3() {
        assertThat(Solution().maxNumberOfBalloons("leetcode"), equalTo(0))
    }
}
