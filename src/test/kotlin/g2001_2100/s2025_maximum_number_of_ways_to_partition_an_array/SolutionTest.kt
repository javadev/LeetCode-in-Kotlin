package g2001_2100.s2025_maximum_number_of_ways_to_partition_an_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun waysToPartition() {
        MatcherAssert.assertThat(Solution().waysToPartition(intArrayOf(2, -1, 2), 3), CoreMatchers.equalTo(1))
    }

    @Test
    fun waysToPartition2() {
        MatcherAssert.assertThat(Solution().waysToPartition(intArrayOf(0, 0, 0), 1), CoreMatchers.equalTo(2))
    }

    @Test
    fun waysToPartition3() {
        MatcherAssert.assertThat(
            Solution()
                .waysToPartition(
                    intArrayOf(22, 4, -25, -20, -15, 15, -16, 7, 19, -10, 0, -13, -14),
                    -33
                ),
            CoreMatchers.equalTo(4)
        )
    }
}
