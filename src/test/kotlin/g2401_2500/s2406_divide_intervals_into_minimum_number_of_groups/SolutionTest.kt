package g2401_2500.s2406_divide_intervals_into_minimum_number_of_groups

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minGroups() {
        assertThat(
            Solution().minGroups(
                arrayOf(
                    intArrayOf(5, 10),
                    intArrayOf(6, 8),
                    intArrayOf(1, 5),
                    intArrayOf(2, 3),
                    intArrayOf(1, 10)
                )
            ),
            equalTo(3)
        )
    }

    @Test
    fun minGroups2() {
        assertThat(
            Solution().minGroups(arrayOf(intArrayOf(1, 3), intArrayOf(5, 6), intArrayOf(8, 10), intArrayOf(11, 13))),
            equalTo(1)
        )
    }
}
