package g1601_1700.s1665_minimum_initial_energy_to_finish_tasks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumEffort() {
        assertThat(Solution().minimumEffort(arrayOf(intArrayOf(1, 2), intArrayOf(2, 4), intArrayOf(4, 8))), equalTo(8))
    }

    @Test
    fun minimumEffort2() {
        assertThat(
            Solution()
                .minimumEffort(
                    arrayOf(
                        intArrayOf(1, 3),
                        intArrayOf(2, 4),
                        intArrayOf(10, 11),
                        intArrayOf(10, 12),
                        intArrayOf(8, 9),
                    ),
                ),
            equalTo(32),
        )
    }

    @Test
    fun minimumEffort3() {
        assertThat(
            Solution()
                .minimumEffort(
                    arrayOf(
                        intArrayOf(1, 7),
                        intArrayOf(2, 8),
                        intArrayOf(3, 9),
                        intArrayOf(4, 10),
                        intArrayOf(5, 11),
                        intArrayOf(6, 12),
                    ),
                ),
            equalTo(27),
        )
    }
}
