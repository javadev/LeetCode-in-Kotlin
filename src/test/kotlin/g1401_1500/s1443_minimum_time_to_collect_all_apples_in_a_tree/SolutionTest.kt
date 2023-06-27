package g1401_1500.s1443_minimum_time_to_collect_all_apples_in_a_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minTime() {
        assertThat(
            Solution()
                .minTime(
                    7,
                    arrayOf(
                        intArrayOf(0, 1), intArrayOf(0, 2),
                        intArrayOf(1, 4), intArrayOf(1, 5), intArrayOf(2, 3),
                        intArrayOf(2, 6)
                    ),
                    mutableListOf(false, false, true, false, true, true, false)
                ),
            equalTo(8)
        )
    }

    @Test
    fun minTime2() {
        assertThat(
            Solution()
                .minTime(
                    7,
                    arrayOf(
                        intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 4),
                        intArrayOf(1, 5), intArrayOf(2, 3), intArrayOf(2, 6)
                    ),
                    mutableListOf(false, false, true, false, false, true, false)
                ),
            equalTo(6)
        )
    }

    @Test
    fun minTime3() {
        assertThat(
            Solution()
                .minTime(
                    7,
                    arrayOf(
                        intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 4),
                        intArrayOf(1, 5), intArrayOf(2, 3), intArrayOf(2, 6)
                    ),
                    mutableListOf(false, false, false, false, false, false, false)
                ),
            equalTo(0)
        )
    }
}
