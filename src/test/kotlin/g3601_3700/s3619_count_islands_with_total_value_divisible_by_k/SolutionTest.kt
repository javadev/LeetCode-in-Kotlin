package g3601_3700.s3619_count_islands_with_total_value_divisible_by_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countIslands() {
        assertThat<Int>(
            Solution()
                .countIslands(
                    arrayOf<IntArray>(
                        intArrayOf(0, 2, 1, 0, 0),
                        intArrayOf(0, 5, 0, 0, 5),
                        intArrayOf(0, 0, 1, 0, 0),
                        intArrayOf(0, 1, 4, 7, 0),
                        intArrayOf(0, 2, 0, 0, 8),
                    ),
                    5,
                ),
            equalTo<Int>(2),
        )
    }

    @Test
    fun countIslands2() {
        assertThat<Int>(
            Solution()
                .countIslands(
                    arrayOf<IntArray>(
                        intArrayOf(3, 0, 3, 0),
                        intArrayOf(0, 3, 0, 3),
                        intArrayOf(3, 0, 3, 0),
                    ),
                    3,
                ),
            equalTo<Int>(6),
        )
    }
}
