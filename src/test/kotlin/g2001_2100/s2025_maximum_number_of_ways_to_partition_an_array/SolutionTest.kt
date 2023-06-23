package g2001_2100.s2025_maximum_number_of_ways_to_partition_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun waysToPartition() {
        assertThat(Solution().waysToPartition(intArrayOf(2, -1, 2), 3), equalTo(1))
    }

    @Test
    fun waysToPartition2() {
        assertThat(Solution().waysToPartition(intArrayOf(0, 0, 0), 1), equalTo(2))
    }

    @Test
    fun waysToPartition3() {
        assertThat(
            Solution()
                .waysToPartition(
                    intArrayOf(22, 4, -25, -20, -15, 15, -16, 7, 19, -10, 0, -13, -14),
                    -33
                ),
            equalTo(4)
        )
    }
}
