package g1301_1400.s1310_xor_queries_of_a_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun xorQueries() {
        assertThat(
            Solution()
                .xorQueries(
                    intArrayOf(1, 3, 4, 8),
                    arrayOf(
                        intArrayOf(0, 1), intArrayOf(1, 2),
                        intArrayOf(0, 3), intArrayOf(3, 3)
                    )
                ),
            equalTo(intArrayOf(2, 7, 14, 8))
        )
    }

    @Test
    fun xorQueries2() {
        assertThat(
            Solution()
                .xorQueries(
                    intArrayOf(4, 8, 2, 10),
                    arrayOf(
                        intArrayOf(2, 3), intArrayOf(1, 3),
                        intArrayOf(0, 0), intArrayOf(0, 3)
                    )
                ),
            equalTo(intArrayOf(8, 0, 4, 4))
        )
    }
}
