package g3901_4000.s3975_filter_occupied_intervals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun filterOccupiedIntervals() {
        assertThat<MutableList<MutableList<Int>>>(
            Solution()
                .filterOccupiedIntervals(
                    arrayOf<IntArray>(
                        intArrayOf(2, 6),
                        intArrayOf(4, 8),
                        intArrayOf(10, 10),
                        intArrayOf(10, 12),
                        intArrayOf(14, 16),
                    ),
                    7,
                    11,
                ),
            equalTo<MutableList<MutableList<Int>>>(
                mutableListOf(
                    mutableListOf<Int>(2, 6),
                    mutableListOf<Int>(12, 12),
                    mutableListOf<Int>(14, 16),
                ),
            ),
        )
    }

    @Test
    fun filterOccupiedIntervals2() {
        assertThat<MutableList<MutableList<Int>>>(
            Solution().filterOccupiedIntervals(arrayOf<IntArray>(intArrayOf(1, 5), intArrayOf(2, 3)), 3, 8),
            equalTo<MutableList<MutableList<Int>>>(
                mutableListOf(
                    mutableListOf<Int>(1, 2),
                ),
            ),
        )
    }

    @Test
    fun filterOccupiedIntervals3() {
        assertThat<MutableList<MutableList<Int>>>(
            Solution().filterOccupiedIntervals(arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(4, 5)), 1, 5),
            equalTo<MutableList<out Any>>(mutableListOf<Int>()),
        )
    }
}
