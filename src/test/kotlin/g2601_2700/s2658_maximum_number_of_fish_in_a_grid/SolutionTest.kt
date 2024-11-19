package g2601_2700.s2658_maximum_number_of_fish_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaxFish() {
        assertThat(
            Solution().findMaxFish(
                arrayOf(
                    intArrayOf(0, 2, 1, 0),
                    intArrayOf(4, 0, 0, 3),
                    intArrayOf(1, 0, 0, 4),
                    intArrayOf(0, 3, 2, 0),
                ),
            ),
            equalTo(7),
        )
    }

    @Test
    fun findMaxFish2() {
        assertThat(
            Solution().findMaxFish(
                arrayOf(
                    intArrayOf(1, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 1),
                ),
            ),
            equalTo(1),
        )
    }
}
