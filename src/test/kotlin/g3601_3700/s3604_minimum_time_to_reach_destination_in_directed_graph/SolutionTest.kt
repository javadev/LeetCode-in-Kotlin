package g3601_3700.s3604_minimum_time_to_reach_destination_in_directed_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minTime() {
        assertThat<Int>(
            Solution().minTime(
                3,
                arrayOf<IntArray>(intArrayOf(0, 1, 0, 1), intArrayOf(1, 2, 2, 5)),
            ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun minTime2() {
        assertThat<Int>(
            Solution()
                .minTime(
                    4,
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 0, 3),
                        intArrayOf(1, 3, 7, 8),
                        intArrayOf(0, 2, 1, 5),
                        intArrayOf(2, 3, 4, 7),
                    ),
                ),
            equalTo<Int>(5),
        )
    }

    @Test
    fun minTime3() {
        assertThat<Int>(
            Solution().minTime(3, arrayOf<IntArray>(intArrayOf(1, 0, 1, 3), intArrayOf(1, 2, 3, 5))),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun minTest4() {
        assertThat<Int>(
            Solution()
                .minTime(
                    5,
                    arrayOf<IntArray>(
                        intArrayOf(1, 3, 17, 18),
                        intArrayOf(1, 3, 0, 7),
                        intArrayOf(0, 1, 0, 3),
                        intArrayOf(3, 2, 1, 20),
                        intArrayOf(1, 2, 25, 25),
                        intArrayOf(0, 3, 13, 14),
                        intArrayOf(1, 0, 11, 15),
                        intArrayOf(0, 4, 19, 21),
                        intArrayOf(2, 0, 4, 20),
                    ),
                ),
            equalTo<Int>(20),
        )
    }
}
