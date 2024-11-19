package g2601_2700.s2685_count_the_number_of_complete_components

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCompleteComponents() {
        assertThat(
            Solution().countCompleteComponents(
                6,
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(0, 2),
                    intArrayOf(1, 2),
                    intArrayOf(3, 4),
                ),
            ),
            equalTo(3),
        )
    }

    @Test
    fun countCompleteComponents2() {
        assertThat(
            Solution().countCompleteComponents(
                6,
                arrayOf(
                    intArrayOf(0, 1),
                    intArrayOf(0, 2),
                    intArrayOf(1, 2),
                    intArrayOf(3, 4),
                    intArrayOf(3, 5),
                ),
            ),
            equalTo(1),
        )
    }
}
