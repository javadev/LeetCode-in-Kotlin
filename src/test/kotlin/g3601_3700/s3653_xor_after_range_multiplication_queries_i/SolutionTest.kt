package g3601_3700.s3653_xor_after_range_multiplication_queries_i

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
}
