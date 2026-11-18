package g4001_4100.s4001_aggregate_two_time_series

import com_github_leetcode.ArrayUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun aggregateTimeSeries() {
        assertThat<List<List<Int>>>(
            Solution()
                .aggregateTimeSeries(
                    arrayOf<IntArray>(intArrayOf(1, 3), intArrayOf(4, 1)),
                    arrayOf<IntArray>(intArrayOf(2, 2), intArrayOf(5, 2)),
                ),
            equalTo<List<List<Int>>>(
                ArrayUtils.getLists(
                    arrayOf<IntArray>(
                        intArrayOf(1, 5),
                        intArrayOf(2, 3),
                        intArrayOf(4, 3),
                        intArrayOf(5, 2),
                    ),
                ),
            ),
        )
    }

    @Test
    fun aggregateTimeSeries2() {
        assertThat<List<List<Int>>>(
            Solution()
                .aggregateTimeSeries(
                    arrayOf<IntArray>(intArrayOf(1, 5), intArrayOf(3, 1)),
                    arrayOf<IntArray>(intArrayOf(2, 2)),
                ),
            equalTo<List<List<Int>>>(
                ArrayUtils.getLists(
                    arrayOf<IntArray>(
                        intArrayOf(1, 7),
                        intArrayOf(2, 3),
                        intArrayOf(3, 1),
                    ),
                ),
            ),
        )
    }

    @Test
    fun aggregateTimeSeries3() {
        assertThat<List<List<Int>>>(
            Solution()
                .aggregateTimeSeries(
                    arrayOf<IntArray>(intArrayOf(1, 5)),
                    arrayOf<IntArray>(intArrayOf(1000000000, 2)),
                ),
            equalTo<List<List<Int>>>(
                ArrayUtils.getLists(
                    arrayOf<IntArray>(
                        intArrayOf(1, 7),
                        intArrayOf(1000000000, 2),
                    ),
                ),
            ),
        )
    }
}
