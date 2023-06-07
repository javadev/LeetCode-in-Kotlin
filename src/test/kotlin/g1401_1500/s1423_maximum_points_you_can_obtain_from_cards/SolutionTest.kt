package g1401_1500.s1423_maximum_points_you_can_obtain_from_cards

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxScore() {
        assertThat(Solution().maxScore(intArrayOf(1, 2, 3, 4, 5, 6, 1), 3), equalTo(12))
    }

    @Test
    fun maxScore2() {
        assertThat(Solution().maxScore(intArrayOf(2, 2, 2), 2), equalTo(4))
    }

    @Test
    fun maxScore3() {
        assertThat(Solution().maxScore(intArrayOf(9, 7, 7, 9, 7, 7, 9), 7), equalTo(55))
    }
}
