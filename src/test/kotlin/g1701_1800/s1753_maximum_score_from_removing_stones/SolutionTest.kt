package g1701_1800.s1753_maximum_score_from_removing_stones

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumScore() {
        assertThat(Solution().maximumScore(2, 4, 6), equalTo(6))
    }

    @Test
    fun maximumScore2() {
        assertThat(Solution().maximumScore(4, 4, 6), equalTo(7))
    }

    @Test
    fun maximumScore3() {
        assertThat(Solution().maximumScore(1, 8, 8), equalTo(8))
    }
}
