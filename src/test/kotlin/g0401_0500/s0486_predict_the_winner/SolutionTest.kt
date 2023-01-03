package g0401_0500.s0486_predict_the_winner

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun predictTheWinner() {
        assertThat(Solution().predictTheWinner(intArrayOf(1, 5, 2)), equalTo(false))
    }

    @Test
    fun predictTheWinner2() {
        assertThat(Solution().predictTheWinner(intArrayOf(1, 5, 233, 7)), equalTo(true))
    }
}
