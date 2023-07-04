package g2501_2600.s2518_number_of_great_partitions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPartitions() {
        assertThat(Solution().countPartitions(intArrayOf(1, 2, 3, 4), 4), equalTo(6))
    }

    @Test
    fun countPartitions2() {
        assertThat(Solution().countPartitions(intArrayOf(3, 3, 3), 4), equalTo(0))
    }

    @Test
    fun countPartitions3() {
        assertThat(Solution().countPartitions(intArrayOf(6, 6), 2), equalTo(2))
    }
}
