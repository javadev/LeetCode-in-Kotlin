package g2301_2400.s2322_minimum_score_after_removals_on_a_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumScore() {
        assertThat(
            Solution()
                .minimumScore(
                    intArrayOf(1, 5, 5, 4, 11),
                    arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(3, 4)),
                ),
            equalTo(9),
        )
    }

    @Test
    fun minimumScore2() {
        assertThat(
            Solution()
                .minimumScore(
                    intArrayOf(5, 5, 2, 4, 4, 2),
                    arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(5, 2), intArrayOf(4, 3), intArrayOf(1, 3)),
                ),
            equalTo(0),
        )
    }
}
