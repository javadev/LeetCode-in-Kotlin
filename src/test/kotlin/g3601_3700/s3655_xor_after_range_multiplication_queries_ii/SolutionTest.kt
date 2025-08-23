package g3601_3700.s3655_xor_after_range_multiplication_queries_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun xorAfterQueries() {
        assertThat<Int>(
            Solution().xorAfterQueries(intArrayOf(1, 1, 1), arrayOf<IntArray>(intArrayOf(0, 2, 1, 4))),
            equalTo<Int>(4),
        )
    }

    @Test
    fun xorAfterQueries2() {
        assertThat<Int>(
            Solution()
                .xorAfterQueries(
                    intArrayOf(2, 3, 1, 5, 4),
                    arrayOf<IntArray>(intArrayOf(1, 4, 2, 3), intArrayOf(0, 2, 1, 2)),
                ),
            equalTo<Int>(31),
        )
    }

    @Test
    fun xorAfterQueries3() {
        assertThat<Int>(
            Solution()
                .xorAfterQueries(
                    intArrayOf(329, 112, 80),
                    arrayOf<IntArray>(
                        intArrayOf(2, 2, 2, 20),
                        intArrayOf(0, 2, 1, 19),
                        intArrayOf(0, 2, 3, 9),
                        intArrayOf(1, 2, 1, 11),
                        intArrayOf(2, 2, 1, 11),
                        intArrayOf(0, 2, 2, 11),
                        intArrayOf(1, 1, 2, 2),
                        intArrayOf(0, 1, 1, 14),
                        intArrayOf(1, 2, 3, 8),
                        intArrayOf(2, 2, 1, 14),
                        intArrayOf(2, 2, 3, 10),
                        intArrayOf(2, 2, 3, 1),
                        intArrayOf(1, 1, 2, 12),
                        intArrayOf(0, 2, 1, 15),
                        intArrayOf(0, 2, 1, 3),
                        intArrayOf(1, 1, 3, 15),
                        intArrayOf(1, 1, 2, 2),
                    ),
                ),
            equalTo<Int>(426005772),
        )
    }
}
