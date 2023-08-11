package g2501_2600.s2593_find_score_of_an_array_after_marking_all_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findScore() {
        assertThat(Solution().findScore(intArrayOf(2, 1, 3, 4, 5, 2)), equalTo(7))
    }

    @Test
    fun findScore2() {
        assertThat(Solution().findScore(intArrayOf(2, 3, 5, 1, 3, 2)), equalTo(5))
    }
}
