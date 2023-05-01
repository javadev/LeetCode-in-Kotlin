package g0901_1000.s0948_bag_of_tokens

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun bagOfTokensScore() {
        assertThat(Solution().bagOfTokensScore(intArrayOf(100, 200), 150), equalTo(1))
    }

    @Test
    fun bagOfTokensScore2() {
        assertThat(
            Solution().bagOfTokensScore(intArrayOf(100, 200, 300, 400), 200), equalTo(2)
        )
    }
}
