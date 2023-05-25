package g1101_1200.s1189_maximum_number_of_balloons

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxNumberOfBalloons() {
        MatcherAssert.assertThat(Solution().maxNumberOfBalloons("nlaebolko"), CoreMatchers.equalTo(1))
    }

    @Test
    fun maxNumberOfBalloons2() {
        MatcherAssert.assertThat(Solution().maxNumberOfBalloons("loonbalxballpoon"), CoreMatchers.equalTo(2))
    }

    @Test
    fun maxNumberOfBalloons3() {
        MatcherAssert.assertThat(Solution().maxNumberOfBalloons("leetcode"), CoreMatchers.equalTo(0))
    }
}
