package g2501_2600.s2581_count_number_of_possible_root_nodes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rootCount() {
        assertThat(
            Solution().rootCount(
                arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(4, 2)),
                arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(0, 1),
                    intArrayOf(1, 0),
                    intArrayOf(2, 4),
                ),
                3,
            ),
            equalTo(3),
        )
    }

    @Test
    fun rootCount2() {
        assertThat(
            Solution().rootCount(
                arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4)),
                arrayOf(
                    intArrayOf(1, 0),
                    intArrayOf(3, 4),
                    intArrayOf(2, 1),
                    intArrayOf(3, 2),
                ),
                1,
            ),
            equalTo(5),
        )
    }
}
