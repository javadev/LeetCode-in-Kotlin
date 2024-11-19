package g1901_2000.s1976_number_of_ways_to_arrive_at_destination

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPaths() {
        assertThat(
            Solution()
                .countPaths(
                    7,
                    arrayOf(
                        intArrayOf(0, 6, 7),
                        intArrayOf(0, 1, 2),
                        intArrayOf(1, 2, 3),
                        intArrayOf(1, 3, 3),
                        intArrayOf(6, 3, 3),
                        intArrayOf(3, 5, 1),
                        intArrayOf(6, 5, 1),
                        intArrayOf(2, 5, 1),
                        intArrayOf(0, 4, 5),
                        intArrayOf(4, 6, 2),
                    ),
                ),
            equalTo(4),
        )
    }

    @Test
    fun countPaths2() {
        assertThat(Solution().countPaths(2, arrayOf(intArrayOf(1, 0, 10))), equalTo(1))
    }
}
